package com.aman.vaadin.window;

import com.vaadin.ui.Button;
import com.vaadin.ui.Window;
import com.vaadin.v7.ui.ComboBox;
import com.vaadin.v7.ui.VerticalLayout;

public class PopupWindowDemo extends Window {
	
	private static final long serialVersionUID = 1L;	

	public PopupWindowDemo() {
		
		setClosable(false);
		setWidth("1366px");
		setHeight("768px");
		VerticalLayout layout = new VerticalLayout();
		setContent(layout);
		ComboBox comboBox = new ComboBox("ItemsNew");
		comboBox.addItem("Hello");
		comboBox.addItem("World");
		comboBox.setWidth("500px");
		layout.addComponent(comboBox);	
        layout.addComponent(new Button("Close me", event -> close()));
        layout.addComponent(new Button("Close me", event -> close()));
        layout.addComponent(new Button("Close me", event -> close()));
        layout.addComponent(new Button("Close me", event -> close()));
        layout.addComponent(new Button("Close me", event -> close()));
        layout.addComponent(new Button("Close me", event -> close()));
        layout.addComponent(new Button("Close me", event -> close()));
        layout.addComponent(new Button("Close me", event -> close()));
        layout.addComponent(new Button("Close me", event -> close()));
        layout.addComponent(new Button("Close me", event -> close()));
        layout.addComponent(new Button("Close me", event -> close()));
        layout.addComponent(new Button("Close me", event -> close()));
        layout.addComponent(new Button("Close me", event -> close()));
        layout.addComponent(new Button("Close me", event -> close()));
        layout.addComponent(new Button("Close me", event -> close()));
        layout.addComponent(new Button("Close me", event -> close()));
        layout.addComponent(new Button("Close me", event -> close()));
        layout.addComponent(new Button("Close me", event -> close()));
        layout.addComponent(new Button("Close me", event -> close()));
        ComboBox comboBox2 = new ComboBox("Items");
        comboBox2.addItem("Hello");
        comboBox2.addItem("World");
        comboBox2.setWidth("500px");
		layout.addComponent(comboBox2);	
        layout.addComponent(new Button("Close me", event -> close()));
        layout.addComponent(new Button("Close me", event -> close()));
        layout.addComponent(new Button("Close me", event -> close()));
        layout.addComponent(new Button("Close me", event -> close()));
        layout.addComponent(new Button("Close me", event -> close()));
        layout.addComponent(new Button("Close me", event -> close()));
        layout.addComponent(new Button("Close me", event -> close()));
        layout.addComponent(new Button("Close me", event -> close()));
        layout.addComponent(new Button("Close me", event -> close()));
        layout.addComponent(new Button("Close me", event -> close()));
        layout.addComponent(new Button("Close me", event -> close()));
        layout.addComponent(new Button("Close me", event -> close()));
        layout.addComponent(new Button("Close me", event -> close()));
        layout.addComponent(new Button("Close me", event -> close()));
        layout.addComponent(new Button("Close me", event -> close()));
        layout.addComponent(new Button("Close me", event -> close()));
        layout.addComponent(new Button("Close me", event -> close()));
	}
	
}
