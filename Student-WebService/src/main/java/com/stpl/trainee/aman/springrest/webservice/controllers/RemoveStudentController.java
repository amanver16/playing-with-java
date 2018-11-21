package com.stpl.trainee.aman.springrest.webservice.controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.stpl.trainee.aman.springrest.webservice.beans.requests.StudentRequest;
import com.stpl.trainee.aman.springrest.webservice.beans.responses.StudentResponse;
import com.stpl.trainee.aman.springrest.webservice.services.RemoveStudentService;

@RestController
public class RemoveStudentController {

	@RequestMapping(value = "/removeStudent", method = RequestMethod.POST)
	public StudentResponse removeStudent(@RequestBody StudentRequest addStudentRequest) {
		
		RemoveStudentService removeStudentService = new RemoveStudentService();
		StudentResponse removeStudentResponse = new StudentResponse();
		removeStudentResponse.setStatus(removeStudentService.removeStudentService(addStudentRequest.getAddStudentBean().getId()));

		if (removeStudentResponse.getStatus()) {
			removeStudentResponse.setMessage("Student Removed Successfully");
		} else {
			removeStudentResponse.setMessage("Deletion Failed !!!");
		}

		return removeStudentResponse;
	}
}
