/**
 * 
 */
package com.devopsbuddy.web.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author scmbld on 21-Oct-2017
 *
 */
@Controller
public class IndexController {

	@RequestMapping("/")
	public String home()
	{
		return "index";
	}
}
