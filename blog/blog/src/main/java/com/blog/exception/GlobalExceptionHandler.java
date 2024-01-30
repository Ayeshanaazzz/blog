package com.blog.exception;

import com.blog.payload.ErrorDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

//acts like a catch block to handle exception
@ControllerAdvice

public class GlobalExceptionHandler extends ResponseEntityExceptionHandler//this becomes global catch block which handeles exception
 {
     @ExceptionHandler(ResourceNotFoundException.class)
   public ResponseEntity<ErrorDetails> handleGlobalException(
           Exception exception,
           WebRequest webRequest//helps in understanding details which url and where it occurs
   ){
       ErrorDetails errorDetails =new ErrorDetails(new Date(), exception.getMessage(), webRequest.getDescription(true));
      return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
   }
}
//step 1:ill create custom exception class that extends run time exception
//step2: create controlleradvice class and develop exception handler method which has annotation @Exceptionhandler
