package com.aman.vaadin.student.view;

import com.aman.vaadin.student.listener.mainmenulistener.AddButtonClickListener;
import com.aman.vaadin.student.listener.mainmenulistener.EditButtonClickListener;
import com.aman.vaadin.student.listener.mainmenulistener.LogoutButtonClickListener;
import com.aman.vaadin.student.listener.mainmenulistener.RemoveButtonClickListener;
import com.aman.vaadin.student.listener.mainmenulistener.ShowButtonClickListener;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.Panel;
import com.vaadin.ui.VerticalLayout;

public class MainMenuView extends VerticalLayout implements View {

	private static final long serialVersionUID = 1L;
	
	private static final String COLWIDTH ="150px";
	
	public MainMenuView() {
		
		this.addStyleName("desktop");
		
		Panel mainMenuPanel = new Panel("<center>Student Repository</center>");
		mainMenuPanel.addStyleName("test");
		mainMenuPanel.setWidth("300px");		
		addComponent(mainMenuPanel);
		
		FormLayout mainMenuFormLayout = new FormLayout();	
		mainMenuFormLayout.setSizeFull();
		mainMenuFormLayout.setMargin(true);
		
		Button addButoon = new Button("Add Student", new AddButtonClickListener(this));		
		Button removeButton = new Button("Remove Student", new RemoveButtonClickListener(this));		
		Button editButton = new Button("Edit Student", new EditButtonClickListener(this));		
		Button showButton = new Button("Show Student", new ShowButtonClickListener(this));		
		Button logoutButton = new Button("Logout", new LogoutButtonClickListener(this));
		
		mainMenuFormLayout.addComponent(addButoon);
		mainMenuFormLayout.addComponent(removeButton);
		mainMenuFormLayout.addComponent(editButton);
		mainMenuFormLayout.addComponent(showButton);
		mainMenuFormLayout.addComponent(logoutButton);
		mainMenuPanel.setContent(mainMenuFormLayout);
		
		setSizeFull();
		
		mainMenuFormLayout.getComponent(0).setWidth(COLWIDTH);
		mainMenuFormLayout.getComponent(1).setWidth(COLWIDTH);
		mainMenuFormLayout.getComponent(2).setWidth(COLWIDTH);
		mainMenuFormLayout.getComponent(3).setWidth(COLWIDTH);
		mainMenuFormLayout.getComponent(4).setWidth(COLWIDTH);
		
		setComponentAlignment(mainMenuPanel, Alignment.MIDDLE_CENTER);		
	}
	
	@Override
	public void enter(ViewChangeEvent event) {
		//  Do Something		
	}

}
