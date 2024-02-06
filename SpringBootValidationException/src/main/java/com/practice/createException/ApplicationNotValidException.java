package com.practice.createException;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApplicationNotValidException {
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String,String>HandleInvalidArgument(MethodArgumentNotValidException ex){
		Map<String, String>errormap=new HashMap();
//     ex.getBindingResult().getFieldError().forEach(n->{
//				errormap.
//			})
		return null;
		
		
	}
	

}
