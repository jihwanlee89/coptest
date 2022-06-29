package com.kbpay.cop.advice;

import org.springframework.web.bind.annotation.ExceptionHandler;

//@org.springframework.web.bind.annotation.RestControllerAdvice
public class RestControllerAdvice {
	@ExceptionHandler(Exception.class)
	public String globalError(Exception e) {
		
		String error = "에러 발생 :: " + e;
		return error;
	}
	
}
