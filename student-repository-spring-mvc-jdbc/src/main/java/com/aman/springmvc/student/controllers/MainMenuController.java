package com.aman.springmvc.student.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainMenuController {

	private ModelAndView modelAndView;

	@RequestMapping(value = "/menu", params = "add", method = RequestMethod.POST)
	public ModelAndView addStudentRequest() {
		modelAndView = new ModelAndView("addStudent");
		return modelAndView;
	}

	@RequestMapping(value = "/menu", params = "show", method = RequestMethod.POST)
	public ModelAndView viewStudentRequest() {
		modelAndView = new ModelAndView("showStudent");
		return modelAndView;
	}

	@RequestMapping(value = "/menu", params = "edit", method = RequestMethod.POST)
	public ModelAndView editStudentRequest() {
		modelAndView = new ModelAndView("editStudent");
		return modelAndView;
	}

	@RequestMapping(value = "/menu", params = "remove", method = RequestMethod.POST)
	public ModelAndView removeStudentRequest() {
		modelAndView = new ModelAndView("removeStudent");
		return modelAndView;
	}

	@RequestMapping(value = "/menu", params = "logout", method = RequestMethod.POST)
	public ModelAndView logoutRequest() {
		modelAndView = new ModelAndView("login");
		modelAndView.addObject("logoutStatus", "Successfully logged out.");
		return modelAndView;
	}
}
