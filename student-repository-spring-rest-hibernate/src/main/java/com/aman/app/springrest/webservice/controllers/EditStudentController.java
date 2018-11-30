package com.aman.app.springrest.webservice.controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aman.app.springrest.webservice.beans.requests.StudentRequest;
import com.aman.app.springrest.webservice.beans.responses.StudentResponse;
import com.aman.app.springrest.webservice.services.EditStudentService;

@RestController
public class EditStudentController {

	@RequestMapping(value = "/editStudent", method = RequestMethod.POST)
	public StudentResponse addStudent(@RequestBody StudentRequest editStudentRequest) {
		
		EditStudentService editStudentService = new EditStudentService();
		StudentResponse editStudentResponse = new StudentResponse();
		editStudentResponse.setStatus(editStudentService.editStudentService(editStudentRequest.getAddStudentBean()));

		if (editStudentResponse.getStatus()) {
			editStudentResponse.setMessage("Student Updated Successfully");
		} else {
			editStudentResponse.setMessage("Updation Failed !!!");
		}

		return editStudentResponse;
	}
}
