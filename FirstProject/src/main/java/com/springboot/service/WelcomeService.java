package com.springboot.service;

import org.springframework.stereotype.Service;

//spring to manage this bean
@Service
public class WelcomeService{
	 public String welcomeServiceMsg() {
		 
		 return "welcome to service class";
	 }
	 
	 
}