package com.aman.java.student.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aman.java.student.service.DeleteStudentService;

public class DeleteStudentServlet extends HttpServlet {

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

        DeleteStudentService deleteStudentService = new DeleteStudentService();

        try (PrintWriter out = response.getWriter()) {

			if (deleteStudentService.deleteStudent(Integer.parseInt(request.getParameter("id")))) {
				out.println("<script type=\"text/javascript\">");
				out.println("alert('Student Deleted Successfully');");
				out.println("location='jsp/searchStudent.jsp';");
				out.println("</script>");
			} else {
				out.println("<script type=\"text/javascript\">");
				out.println("alert('Student not deleted.');");
				out.println("location='jsp/searchStudent.jsp';");
				out.println("</script>");
			}

		}

    }
}