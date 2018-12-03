package com.aman.springmvc.student.controllers;

import com.aman.springmvc.student.bean.StudentBean;
import com.aman.springmvc.student.service.SearchStudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ShowStudentController {

	@Autowired
	SearchStudentService searchStudentService;

	@RequestMapping(value = "/showStudent", method = RequestMethod.POST)
	public ModelAndView addStudent(@RequestParam("id") String searchId) {

		ModelAndView modelAndView;
		StudentBean studentBean = searchStudentService.searchStudent(Integer.parseInt(searchId));

		if (studentBean != null) {

			modelAndView = new ModelAndView("showStudent");
			Integer id = studentBean.getId();
			modelAndView.addObject("id", id.toString());
			modelAndView.addObject("name", studentBean.getName());
			modelAndView.addObject("gender", studentBean.getGender());
			modelAndView.addObject("course", studentBean.getCourse());
			modelAndView.addObject("email", studentBean.getEmail());
			Integer phone = studentBean.getPhone();
			modelAndView.addObject("phone", phone.toString());

		} else {
			modelAndView = new ModelAndView("showStudent");
			modelAndView.addObject("showStatus", "Student is not available !!!");
		}

		return modelAndView;
	}
}
