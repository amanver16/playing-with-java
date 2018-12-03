package com.aman.vaadin.student.listener.editstudentlistener;

import com.aman.vaadin.student.bean.StudentBean;
import com.aman.vaadin.student.service.EditStudentService;
import com.aman.vaadin.student.service.SearchStudentService;
import com.aman.vaadin.student.ui.NotificationViewer;
import com.aman.vaadin.student.view.EditStudentView;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.Panel;
import com.vaadin.ui.TextField;

public class EditButtonListener implements ClickListener {

    private static final long serialVersionUID = 1L;

    private EditStudentView editStudentView;

    public EditButtonListener(EditStudentView editStudentView) {
        this.editStudentView = editStudentView;
    }

    @Override
    public void buttonClick(ClickEvent clickEvent) {

        int id = Integer.parseInt(editStudentView.getIdField().getValue());
        SearchStudentService searchStudentService = new SearchStudentService();
        StudentBean studentBean = searchStudentService.searchStudent(id);
        NotificationViewer notificationViewer = new NotificationViewer();

        if (studentBean != null) {
            createEditStudentForm(studentBean);
        } else {
            notificationViewer.getNotification("Student is not available !!!");
        }
    }

    // Method to create edit student form
    public void createEditStudentForm(StudentBean studentBean) {

        TextField idField;
        TextField nameField;
        TextField genderField;
        TextField courseField;
        TextField emailField;
        TextField phoneField;
        TextField usernamField;
        TextField passworField;

        Panel editStudentPanel = new Panel("<center>Edit Student Form</center>");
        editStudentPanel.setWidth("350px");
        editStudentPanel.addStyleName("test");
        editStudentView.addComponent(editStudentPanel);

        FormLayout editStudentFormLayout = new FormLayout();

        idField = new TextField("ID");
        idField.setValue(Integer.toString(studentBean.getId()));
        editStudentFormLayout.addComponent(idField);
        nameField = new TextField("Name");
        nameField.setValue(studentBean.getName());
        editStudentFormLayout.addComponent(nameField);
        genderField = new TextField("Gender");
        genderField.setValue(studentBean.getGender());
        editStudentFormLayout.addComponent(genderField);
        courseField = new TextField("Course");
        courseField.setValue(studentBean.getCourse());
        editStudentFormLayout.addComponent(courseField);
        emailField = new TextField("Email");
        emailField.setValue(studentBean.getEmail());
        editStudentFormLayout.addComponent(emailField);
        phoneField = new TextField("Phone");
        phoneField.setValue(Integer.toString(studentBean.getPhone()));
        editStudentFormLayout.addComponent(phoneField);
        usernamField = new TextField("Username");
        usernamField.setValue(studentBean.getUsername());
        editStudentFormLayout.addComponent(usernamField);
        passworField = new TextField("Password");
        passworField.setValue(studentBean.getPassword());
        editStudentFormLayout.addComponent(passworField);

        Button updateButton = new Button("Update Details", new Button.ClickListener() {

            private static final long serialVersionUID = 1L;

            @Override
            public void buttonClick(ClickEvent editButtonClickEvent) {
                int id = Integer.parseInt(idField.getValue());
                String name = nameField.getValue();
                String gender = genderField.getValue();
                String course = courseField.getValue();
                String email = emailField.getValue();
                int phone = Integer.parseInt(phoneField.getValue());
                String username = usernamField.getValue();
                String password = passworField.getValue();

                StudentBean student = new StudentBean();

                student.setId(id);
                student.setName(name);
                student.setGender(gender);
                student.setCourse(course);
                student.setEmail(email);
                student.setPhone(phone);
                student.setUsername(username);
                student.setPassword(password);

                EditStudentService editStudentService = new EditStudentService();
                NotificationViewer notificationViewer = new NotificationViewer();

                if (editStudentService.updateStudent(student)) {
                    notificationViewer.getNotification("Student Updated Successfully !!!");
                } else {
                    notificationViewer.getNotification("Student updation failed !!!");
                }
            }
        });

        editStudentFormLayout.addComponent(updateButton);
        editStudentPanel.setContent(editStudentFormLayout);
        editStudentView.setSizeFull();
        editStudentFormLayout.getComponent(6).setWidth("200px");
        editStudentFormLayout.getComponent(7).setWidth("200px");
        editStudentView.setComponentAlignment(editStudentPanel, Alignment.MIDDLE_CENTER);

    }

}
