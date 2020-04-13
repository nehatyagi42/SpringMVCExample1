package com.rtpl.Common;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;

@ControllerAdvice  
public class HelloController {
	@RequestMapping("/")  
	
	public String display()  
    {  
	
        return "index";  
    } 
}
