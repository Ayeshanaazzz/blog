package com.blog.service.impl;

import com.blog.entity.Post;
import com.blog.exception.ResourceNotFoundException;
import com.blog.payload.PostDto;
import com.blog.repository.PostRepository;
import com.blog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    private PostRepository postRepo;
    @Override
    public PostDto createPost(PostDto postDto) {
        Post post =new Post();
        post.setTitle(postDto.getTitle());
        post.setContent(postDto.getContent());
        post.setDescription(postDto.getDescription());
        Post savePost = postRepo.save(post);
        PostDto dto = new PostDto();
        dto.setId(savePost.getId());
        dto.setTitle(savePost.getTitle());
        dto.setContent(savePost.getContent());
        dto.setDescription(savePost.getDescription());
        dto.setMessage("Post saved!");
        return dto;
    }

    @Override
    public void deletePost(long id) {//id is taken from controller layer
        Post post = postRepo.findById(id).orElseThrow(//lambdas expression is used to throw exception by creating custom exception
                () -> new ResourceNotFoundException("post not found" + id)
        );
        postRepo.deleteById(id);//find data of that id

    }

    @Override
    public List<PostDto> getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir) {
        Sort.Direction direction = Sort.Direction.ASC; // Default to ascending

        if ("desc".equalsIgnoreCase(sortDir)) {
            direction = Sort.Direction.DESC;
        }

        Pageable pageable = PageRequest.of(pageNo, pageSize, Sort.by(direction, sortBy));
        Page<Post> postPage = postRepo.findAll(pageable);
        List<Post> posts = postPage.getContent();
        List<PostDto> dtos = posts.stream().map(p -> mapToDto(p)).collect(Collectors.toList());
        return dtos;
    }


    PostDto mapToDto(Post post){
        PostDto dto = new PostDto();
        dto.setId(post.getId());
        dto.setTitle(post.getTitle());
        dto.setContent(post.getContent());
        dto.setDescription(post.getDescription());
       return dto;
    }
}
