package com.training.exilant.restful_works;

public class HelloWorld {

	private String message;
	public HelloWorld(String message) {
		this.setMessage(message);
	}
	@Override
	public String toString() {
		return "HelloWorld [message=" + message + "]";
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
