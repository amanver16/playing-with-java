package com.aman.vaadin;

import javax.servlet.annotation.WebServlet;

import com.aman.vaadin.window.PopupWindowDemo;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.v7.ui.ComboBox;
import com.vaadin.v7.ui.VerticalLayout;

/**
 * This UI is the application entry point. A UI may either represent a browser
 * window (or tab) or some part of an HTML page where a Vaadin application is
 * embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is
 * intended to be overridden to add component to the user interface and
 * initialize non-component functionality.
 */
@Theme("mytheme")
public class MyUI extends UI {

	private static final long serialVersionUID = 1L;

	@Override
	protected void init(VaadinRequest vaadinRequest) {

		final VerticalLayout layout = new VerticalLayout();
		
		Button button = new Button("Click Me");
		button.addClickListener(e -> {
			PopupWindowDemo popupWindowDemo = new PopupWindowDemo();
			
			UI.getCurrent().addWindow(popupWindowDemo);
		});		
		layout.addComponent(button);
		
		ComboBox comboBox = new ComboBox("Items");
		comboBox.addItem("Hello");
		comboBox.addItem("World");
		comboBox.setWidth("500px");
		layout.addComponent(comboBox);
	}

	@WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
	@VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
	public static class MyUIServlet extends VaadinServlet {
		private static final long serialVersionUID = 1L;
	}
}
