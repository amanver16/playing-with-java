package com.aman.springmvc.student.controllers;

import com.aman.springmvc.student.service.LoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@Autowired
	LoginService loginService;

	@RequestMapping("/")
	public String home() {
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView doLogin(@RequestParam("username") String username, @RequestParam("password") String password) {

		ModelAndView modelAndView;

		if (loginService.login(username, password)) {
			modelAndView = new ModelAndView("mainmenu");
		} else {
			modelAndView = new ModelAndView("login");
			modelAndView.addObject("loginStatus", "Invalid credentials !!!");
		}

		return modelAndView;
	}
}