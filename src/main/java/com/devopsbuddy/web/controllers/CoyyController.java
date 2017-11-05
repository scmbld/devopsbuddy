/**
 * 
 */
package com.devopsbuddy.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author scmbld on 05-Nov-2017
 *
 */
@Controller
public class CoyyController {
	
	@RequestMapping("/about")
	public String about()
	{
		return "copy/about";
	}

}
