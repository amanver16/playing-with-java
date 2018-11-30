package com.aman.app.springrest.webservice.controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aman.app.springrest.webservice.beans.StudentBean;
import com.aman.app.springrest.webservice.beans.requests.StudentRequest;
import com.aman.app.springrest.webservice.beans.responses.ShowStudentResponse;
import com.aman.app.springrest.webservice.services.ShowStudentService;

@RestController
public class ShowStudentController {

	@RequestMapping(value = "/showStudent", method = RequestMethod.POST)
	public ShowStudentResponse showStudent(@RequestBody StudentRequest addStudentRequest) {

		ShowStudentService showStudentService = new ShowStudentService();
		ShowStudentResponse showStudentResponse = new ShowStudentResponse();
		
		showStudentResponse.setStudentBean(new StudentBean());
		showStudentResponse.setStudentBean(showStudentService.showStudentService(addStudentRequest.getAddStudentBean().getId()));
		
		return showStudentResponse;
	}
}
