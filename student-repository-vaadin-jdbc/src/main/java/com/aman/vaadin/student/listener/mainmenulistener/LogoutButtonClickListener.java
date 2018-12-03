package com.aman.vaadin.student.listener.mainmenulistener;

import com.aman.vaadin.student.ui.NotificationViewer;
import com.aman.vaadin.student.view.MainMenuView;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;

public class LogoutButtonClickListener implements ClickListener{
	
	private static final long serialVersionUID = 1L;

	private MainMenuView mainMenuView;

	public LogoutButtonClickListener(MainMenuView mainMenuView) {
		this.mainMenuView = mainMenuView;
	}
	
	@Override
    public void buttonClick(ClickEvent clickEvent) {
		NotificationViewer notificationViewer = new NotificationViewer();
		notificationViewer.getNotification("Logout Successfull !!!");
		mainMenuView.getUI().getNavigator().navigateTo("");
	}
}
