package com.training.exilant.restful_works.user;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;



@ControllerAdvice
@RestController
public class CustomResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

	
	@ExceptionHandler
	public ResponseEntity<Object> handleAllException(Exception e,WebRequest request){
		
		
		   ErrorDetails errorDetails=new ErrorDetails(new Date(), e.getMessage(), request.getDescription(true));
		
		   return new ResponseEntity<Object>(errorDetails,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<Object> handleUserNotFoundException(Exception e,WebRequest request){
		
		
		   ErrorDetails errorDetails=new ErrorDetails(new Date(), e.getMessage(),"Sorry user not Found in DB");
		
		   return new ResponseEntity<Object>(errorDetails,HttpStatus.NOT_FOUND);
	}
}
