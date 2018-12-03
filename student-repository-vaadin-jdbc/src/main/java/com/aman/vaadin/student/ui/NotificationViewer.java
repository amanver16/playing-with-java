package com.aman.vaadin.student.ui;

import com.vaadin.server.Page;
import com.vaadin.shared.Position;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Notification.Type;

public class NotificationViewer {
	
	public void getNotification(String notification) {
		Notification notify = new Notification(notification,Type.HUMANIZED_MESSAGE);
		notify.setDelayMsec(1000);
		notify.setPosition(Position.BOTTOM_CENTER);
		notify.show(Page.getCurrent());
	}
}
