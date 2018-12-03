package com.aman.vaadin.student.listener.mainmenulistener;

import com.aman.vaadin.student.ui.MyUi;
import com.aman.vaadin.student.view.MainMenuView;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;

public class EditButtonClickListener implements ClickListener {

	private static final long serialVersionUID = 1L;

	private MainMenuView mainMenuView;

	public EditButtonClickListener(MainMenuView mainMenuView) {
		this.mainMenuView = mainMenuView;
	}

	@Override
	public void buttonClick(ClickEvent clickEvent) {
		mainMenuView.getUI().getNavigator().navigateTo(MyUi.EDITVIEW);
	}
}
