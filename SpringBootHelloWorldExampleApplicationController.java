package com.sunirban.controller;
import org.springframework.web.blind.annotation.RestController;
import org.springframework.web.blind.annotation.RequestMapping;


@RestController
public class HelloWorldController {

	
	
		@RequestMapping(value="/")
		public String hello() {
			return "Hello World!";
			
		}
		
		
}
