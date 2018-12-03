package com.aman.springmvc.student.controllers;

import com.aman.springmvc.student.bean.StudentBean;
import com.aman.springmvc.student.service.AddStudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddStudentController {

	@Autowired
	AddStudentService addStudentService;

	@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	public ModelAndView addStudent(@RequestParam("id") String id, @RequestParam("name") String name,
			@RequestParam("gender") String gender, @RequestParam("course") String course,
			@RequestParam("email") String email, @RequestParam("phone") String phone,
			@RequestParam("username") String username, @RequestParam("password") String password) {

		ModelAndView modelAndView;
		StudentBean studentBean = new StudentBean();

		studentBean.setId(Integer.parseInt(id));
		studentBean.setName(name);
		studentBean.setGender(gender);
		studentBean.setCourse(course);
		studentBean.setEmail(email);
		studentBean.setPhone(Integer.parseInt(phone));
		studentBean.setUsername(username);
		studentBean.setPassword(password);

		if (addStudentService.addStudent(studentBean)) {
			modelAndView = new ModelAndView("addStudent");
			modelAndView.addObject("status", "Student Added Successfully !!!");
		} else {
			modelAndView = new ModelAndView("addStudent");
			modelAndView.addObject("status", "Student Addition Failed !!!");
		}

		return modelAndView;
	}
}
