package com.aman.java.student.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aman.java.student.bean.StudentBean;
import com.aman.java.student.service.UpdateStudentService;

public class UpdateStudentServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			doPost(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		StudentBean studentBean = new StudentBean();

		studentBean.setId(Integer.parseInt(request.getParameter("id")));
		studentBean.setName(request.getParameter("name"));
		studentBean.setGender(request.getParameter("gender"));
		studentBean.setCourse(request.getParameter("course"));
		studentBean.setEmail(request.getParameter("email"));
		studentBean.setPhone(Integer.parseInt(request.getParameter("phone")));
		studentBean.setUsername(request.getParameter("username"));
		studentBean.setPassword(request.getParameter("password"));

		UpdateStudentService updateStudentService = new UpdateStudentService();

		try (PrintWriter out = response.getWriter()) {

			if (updateStudentService.updateStudent(studentBean)) {
				out.println("<script type=\"text/javascript\">");
				out.println("alert('Student Updated Successfully');");
				out.println("location='jsp/updateStudent.jsp';");
				out.println("</script>");
			} else {
				out.println("<script type=\"text/javascript\">");
				out.println("alert('Student data not updated.');");
				out.println("location='jsp/updateStudent.jsp';");
				out.println("</script>");
			}

		}

	}
}
