package com.aman.java.student.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aman.java.student.service.LoginService;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
				try {
					doPost(request, response);
				} catch (Exception exception) {
					exception.printStackTrace();
				}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		LoginService loginService = new LoginService();

		try {
			
			if (loginService.login(username, password)) {
				request.getRequestDispatcher("\\jsp/student.jsp").forward(request, response);

			} else {
				try (PrintWriter out = response.getWriter()) {
					out.println("<script type=\"text/javascript\">");
					out.println("alert('Login Failed.');");
					out.println("location='jsp/login.jsp';");
					out.println("</script>");
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
