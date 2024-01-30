package com.blog.payload;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostDto {
    private long id;
    @NotEmpty //will do validation
    @Size(min = 2,message = "Title should be at least 2 character")
    private String title;
    @NotEmpty
    @Size(min = 2,message = "Description should be at least 4 characters")
    private String description;
    @NotEmpty
    @Size(min = 4,message = "Content should be not empty")
    private  String content;
    private String message;
}
