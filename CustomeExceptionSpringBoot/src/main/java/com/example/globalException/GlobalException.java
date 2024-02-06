package com.example.globalException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import Exception.Error;
import Exception.NameValidException;

@ControllerAdvice
public class GlobalException {
	
	@ExceptionHandler(value=NameValidException.class)
	public ResponseEntity<Error>globalException(NameValidException exception){
		Error error=new Error(1000,exception.getMessage());
		return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);	
	}

}
