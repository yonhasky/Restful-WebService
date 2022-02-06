package com.example.RestfulWebService.helloworld;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@Autowired
	private MessageSource messageSourse;

	// GET /hello-world(endpoint)
	@GetMapping("/hello-world")
	public String helloWorld() {
		String result = "hello";

		return result;
	}

	@GetMapping("/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World");
	}

	// 가변 파라미터
	@GetMapping("/hello-world-bean/path-variable/{name}")
	public HelloWorldBean helloWorldBean(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello World, %s", name));
	}

	@GetMapping("/hello-world-internationalized")
	public String helloworldInternationalized(
			@RequestHeader(name = "Accept-Language", required = false) Locale locale) {
		return messageSourse.getMessage("greeting.message", null, locale);
	}
}
