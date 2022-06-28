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
	
}
