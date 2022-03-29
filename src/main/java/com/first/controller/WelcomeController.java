package com.first.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

	@RequestMapping("/welcome")
	public ModelAndView displayWelcomeMsg() {
		
		ModelAndView mva = new ModelAndView();
		mva.addObject("msg", "Welcome to Spring Boot!!!!!!!!!!");
		mva.setViewName("welcome");
		
		return mva;
	}
}
