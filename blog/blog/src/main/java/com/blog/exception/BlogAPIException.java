package com.blog.exception;

import org.springframework.http.HttpStatus;

public class BlogAPIException extends Throwable {
    public BlogAPIException(HttpStatus httpStatus, java.lang.String invalidJwtSignature) {
    }
}
