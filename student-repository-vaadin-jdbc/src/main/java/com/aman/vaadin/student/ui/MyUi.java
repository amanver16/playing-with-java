package com.aman.vaadin.student.ui;

import javax.servlet.annotation.WebServlet;

import com.aman.vaadin.student.view.AddStudentView;
import com.aman.vaadin.student.view.EditStudentView;
import com.aman.vaadin.student.view.LoginView;
import com.aman.vaadin.student.view.MainMenuView;
import com.aman.vaadin.student.view.RemoveStudentView;
import com.aman.vaadin.student.view.ShowStudentView;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.UI;

@Theme("mytheme")
public class MyUi extends UI {

	private static final long serialVersionUID = 1L;

	public static final String MAINVIEW = "Student Repository";
	public static final String ADDVIEW = "Add Student";
	public static final String REMOVEVIEW = "Remove Student";
	public static final String EDITVIEW = "Edit Student";
	public static final String SHOWVIEW = "Show Student";

	@Override
	protected void init(VaadinRequest vaadinRequest) {

		getPage().setTitle("Student Repository");
		Navigator navigator = new Navigator(this, this);

		navigator.addView("", new LoginView());
		navigator.addView(MAINVIEW, new MainMenuView());
		navigator.addView(ADDVIEW, new AddStudentView());
		navigator.addView(REMOVEVIEW, new RemoveStudentView());
		navigator.addView(SHOWVIEW, new ShowStudentView());
		navigator.addView(EDITVIEW, new EditStudentView());

	}

	@WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
	@VaadinServletConfiguration(ui = MyUi.class, productionMode = false)
	public static class MyUIServlet extends VaadinServlet {
		private static final long serialVersionUID = 1L;
	}

}
