package com.kbpay.cop.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	
	@RequestMapping("/HELLO")
	public String helloworld() {
		
		Date date = new Date();
		
		return "helloworld 시간 : " + date.toString(); 
	}
	
	@RequestMapping("/ERRORTEST")
	public String errorTest() {
		
		String[] testArr = {"1","2"};
		String error = testArr[3];
		
		return "에러없음"; 
	}
	
}
