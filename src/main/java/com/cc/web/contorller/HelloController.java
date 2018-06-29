/**
 * 
 */
package com.cc.web.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author CC
 * @date 2018年6月29日
 * @version 1.0
 * @Description: 
 */
@Controller
public class HelloController {
	@RequestMapping("/hello")
	public String hello() {
		
		return "hello";
		
	}
	
	
	@RequestMapping("/index")
	public String index() {
		
		return "index";
		
	}
}
