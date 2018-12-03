package com.aman.vaadin.student.listener.editstudentlistener;

import com.aman.vaadin.student.ui.MyUi;
import com.aman.vaadin.student.view.EditStudentView;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;

public class EditViewBackButtonListener implements ClickListener {

    private static final long serialVersionUID = 1L;

    private EditStudentView editStudentView;

    public EditViewBackButtonListener(EditStudentView editStudentView) {
        this.editStudentView = editStudentView;
    }

    @Override
    public void buttonClick(ClickEvent clickEvent) {
        editStudentView.getUI().getNavigator().navigateTo(MyUi.MAINVIEW);
    }
}
