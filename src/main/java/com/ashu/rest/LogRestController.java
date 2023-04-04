package com.ashu.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogRestController {
	
	Logger logger =LoggerFactory.getLogger(LogRestController.class);
	
	
	
	
	@GetMapping("/welcome")
	public String welcome()
	{
		
		logger.info("Logging info from welcome method");
		String str= "Welcome To Logging";
		logger.warn("warn message from from welcome method ");
		return str;
	}
	
	@GetMapping("/greet")
	public String greetMsg()
	{
		logger.debug("Debug from Greet");
		logger.info("Logging info from welcome method");
		
		try {
			int x=10/0;
		} catch (Exception e) {
			logger.error("Exception Error Occur in try block");
		}
		
		
		logger.warn("Warn From greet Msg");
		return "Good Morning from Learn&Grow IT";
		
		
	}
	
	

}
