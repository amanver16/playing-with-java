package com.aman.springmvc.student.controllers;

import com.aman.springmvc.student.service.RemoveStudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RemoveStudentController {

	@Autowired
	RemoveStudentService removeStudentService;

	@RequestMapping(value = "/removeStudent", method = RequestMethod.POST)
	public ModelAndView addStudent(@RequestParam("id") String deleteId) {

		ModelAndView modelAndView;

		if (removeStudentService.removeStudent(Integer.parseInt(deleteId))) {
			modelAndView = new ModelAndView("removeStudent");
			modelAndView.addObject("removeStatus", "Student Removed Successfully !!!");
		} else {
			modelAndView = new ModelAndView("removeStudent");
			modelAndView.addObject("removeStatus", "Student Can't Be Removed/Found !!!");
		}

		return modelAndView;
	}

}
