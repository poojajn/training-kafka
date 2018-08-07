package com.springboot.controller;
import com.springboot.service.WelcomeService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController
public class WelcomeController {

@Autowired
private WelcomeService service;
	
@RequestMapping("/welcome")
public String welcome() {
		
	return service.welcomeServiceMsg();
}

}


