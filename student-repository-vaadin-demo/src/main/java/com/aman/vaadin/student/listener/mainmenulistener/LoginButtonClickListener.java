package com.aman.vaadin.student.listener.mainmenulistener;

import com.aman.vaadin.student.service.LoginService;
import com.aman.vaadin.student.ui.MyUi;
import com.aman.vaadin.student.ui.NotificationViewer;
import com.aman.vaadin.student.view.LoginView;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;

public class LoginButtonClickListener implements ClickListener {

	private static final long serialVersionUID = 1L;
	private LoginView loginView;

	public LoginButtonClickListener(LoginView loginView) {
		this.loginView = loginView;
	}

	@Override
	public void buttonClick(ClickEvent event) {

		LoginService loginService = new LoginService();
		NotificationViewer notificationViewer = new NotificationViewer();
		String username = loginView.getUsernameField().getValue();
		String password = loginView.getPasswordField().getValue();

		if (loginService.login(username, password)) {
			notificationViewer.getNotification("Login Successfull !!!");
			loginView.getUI().getNavigator().navigateTo(MyUi.MAINVIEW);
		} else {
			notificationViewer.getNotification("Invalid Credentials !!!");
		}
	}
}