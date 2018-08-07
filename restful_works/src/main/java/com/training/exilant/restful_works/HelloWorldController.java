package com.training.exilant.restful_works;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
   // @RequestMapping(method=RequestMethod.GET,path="hello-world")
	@GetMapping(path="hello-world")
	public String helloWorld() {
		return "Hello world";
	}
	@GetMapping(path="/hello-world-bean")
	public HelloWorld helloWor() {
		return new HelloWorld("Hello World.....");
	}
	@GetMapping(path="/hello-world/path-variable/{name}")
	public HelloWorld helloWorldPathVariable(@PathVariable String name) {
		return new HelloWorld("Hello Mr/Ms/Mrs::"+name);
	}
}
