package com.aman.vaadin.student.listener.showstudentlistener;

import com.aman.vaadin.student.ui.MyUi;
import com.aman.vaadin.student.view.ShowStudentView;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;

public class ShowViewBackButtonListener implements ClickListener {

    private static final long serialVersionUID = 1L;

    private ShowStudentView showStudentView;

    public ShowViewBackButtonListener(ShowStudentView showStudentView) {
        this.showStudentView = showStudentView;
    }

    @Override
    public void buttonClick(ClickEvent clickEvent) {
        showStudentView.getUI().getNavigator().navigateTo(MyUi.MAINVIEW);
    }
}
