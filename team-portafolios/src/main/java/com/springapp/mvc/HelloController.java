package com.springapp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HelloController {
	@RequestMapping(value = "/index")
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Hello world! test");
		return "hello";
	}
	@RequestMapping(value = "/index2")
	public String printWelcome2(ModelMap model) {
		model.addAttribute("message", "Hello world! test");
		return "index";
	}
}