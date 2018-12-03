package com.aman.java.student.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aman.java.student.bean.StudentBean;
import com.aman.java.student.service.ViewStudentService;

public class SearchStudentServlet extends HttpServlet {

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

        ViewStudentService viewStudentService = new ViewStudentService();
        StudentBean studentBean = viewStudentService.viewStudent(Integer.parseInt(request.getParameter("id")));

        if (studentBean != null) {

            request.setAttribute("id", studentBean.getId());
            request.setAttribute("name", studentBean.getName());
            request.setAttribute("gender", studentBean.getGender());
            request.setAttribute("course", studentBean.getCourse());
            request.setAttribute("email", studentBean.getEmail());
            request.setAttribute("phone", studentBean.getPhone());
            request.setAttribute("username", studentBean.getUsername());
            request.setAttribute("password", studentBean.getPassword());

            request.getRequestDispatcher("\\jsp/updateStudent.jsp").forward(request, response);

        } else {

            try (PrintWriter out = response.getWriter()) {
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Student is not available.');");
                out.println("location='jsp/searchStudent.jsp';");
                out.println("</script>");
            }
        }

    }
}