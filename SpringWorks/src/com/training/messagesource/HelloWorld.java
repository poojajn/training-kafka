package com.training.messagesource;



import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;

public class HelloWorld {

	
	private String greetimg;
	private String message;
	@Autowired
	private MessageSource messageResource;
	
	public MessageSource getMessageResource() {
		return messageResource;
	}
	public void setMessageResource(MessageSource messageResource) {
		this.messageResource = messageResource;
	}
	public String getGreetimg() {
		return greetimg;
	}
	public void setGreetimg(String greetimg) {
		this.greetimg = greetimg;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	public void sayHelloWorld() {
		System.out.println(messageResource.getMessage("helloworld.greet",new Object[] {greetimg,message},null));
	}
	public void sayHelloWorld_fr() {
		System.out.println(messageResource.getMessage("helloworld.greet",new Object[] {greetimg,message},new Locale("fr")));
	}
	
	
}
