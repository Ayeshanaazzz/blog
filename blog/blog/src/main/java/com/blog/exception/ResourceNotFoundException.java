package com.blog.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
//acts like a throw block to throw exception
@ResponseStatus(HttpStatus.NOT_FOUND)//will show 404 code when exception runs
public class ResourceNotFoundException extends RuntimeException{//extends runtime becoz we dont want error during compile time
   // private String message;//encrypting message

    public ResourceNotFoundException(String message) {//this message will be given when we create object of this class
        //this.message = message;
        super(message);
    }//this method is called in service layer
}
