package com.first.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DateController {

	@RequestMapping("/date")
	public ModelAndView displayDate() {
		
		ModelAndView mva = new ModelAndView();
		mva.addObject("msg","Today's date is  "+new Date());
		mva.setViewName("welcome");
		return mva;
	}

	@RequestMapping(value={"/day","/dayname"})
	public String diplayDate(Model model) {
		
		model.addAttribute("msg", "Today is "+new Date().getDay());
		return "welcome";
	}
}
