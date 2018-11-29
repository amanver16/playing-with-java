package com.stpl.trainee.aman.springrest.webservice.beans.responses;

public class StudentResponse {

	private boolean status;
	private String message;

	public boolean getStatus() {
		return status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
}
