package com.stpl.trainee.aman.springrest.webservice.controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.stpl.trainee.aman.springrest.webservice.beans.requests.StudentRequest;
import com.stpl.trainee.aman.springrest.webservice.beans.responses.StudentResponse;
import com.stpl.trainee.aman.springrest.webservice.services.AddStudentService;

@RestController
public class AddStudentController {	

	@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	public StudentResponse addStudent(@RequestBody StudentRequest addStudentRequest) {
		
		AddStudentService addStudentService = new AddStudentService();
		StudentResponse addStudentResponse = new StudentResponse();
		addStudentResponse.setStatus(addStudentService.addStudentService(addStudentRequest.getAddStudentBean()));

		if (addStudentResponse.getStatus()) {
			addStudentResponse.setMessage("Student Added Successfully");
		} else {
			addStudentResponse.setMessage("Addition Failed !!!");
		}

		return addStudentResponse;
	}
}
