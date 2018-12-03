package com.aman.vaadin.student.view;

import com.aman.vaadin.student.listener.mainmenulistener.LoginButtonClickListener;
import com.vaadin.annotations.Theme;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.Panel;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Theme("mytheme")
public class LoginView extends VerticalLayout implements View {

	private static final long serialVersionUID = 1L;
	
	private Panel loginPanel;
	private FormLayout loginFormLayout;	
	private TextField usernameField;
	private PasswordField passwordField;

	public LoginView() {

		this.addStyleName("desktop");

		loginPanel = new Panel("<center>Login</center>");
		loginPanel.setSizeUndefined();

		addComponent(loginPanel);

		loginFormLayout = new FormLayout();

		usernameField = new TextField("Username");
		usernameField.focus();
		loginFormLayout.addComponent(usernameField);

		passwordField = new PasswordField("Password");
		passwordField.setPlaceholder("*****************");
		loginFormLayout.addComponent(passwordField);

		loginFormLayout.setSizeUndefined();
		loginFormLayout.setMargin(true);
	
		Button loginButton = new Button("Login", new LoginButtonClickListener(this));		
		
		loginFormLayout.addComponent(loginButton);
		loginFormLayout.setComponentAlignment(loginButton, Alignment.MIDDLE_CENTER);
		loginPanel.setContent(loginFormLayout);
		setSizeFull();
		setComponentAlignment(loginPanel, Alignment.MIDDLE_CENTER);
	}	

	@Override
	public void enter(ViewChangeEvent event) {
		// Do Something
	}

}
