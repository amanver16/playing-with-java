package com.aman.springmvc.student.controllers;

import com.aman.springmvc.student.bean.StudentBean;
import com.aman.springmvc.student.service.EditStudentService;
import com.aman.springmvc.student.service.SearchStudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EditStudentController {

    private ModelAndView modelAndView;

    @Autowired
    private SearchStudentService searchStudentService;

    @Autowired
    private EditStudentService editStudentService;

    @RequestMapping(value = "/searchForEdit", method = RequestMethod.POST)
    public ModelAndView searchStudentForEdit(@RequestParam("id") String searchId) {

        StudentBean studentBean = searchStudentService.searchStudent(Integer.parseInt(searchId));

        if (studentBean != null) {

            modelAndView = new ModelAndView("editStudent");
            Integer id = studentBean.getId();
            modelAndView.addObject("id", id.toString());
            modelAndView.addObject("name", studentBean.getName());
            modelAndView.addObject("gender", studentBean.getGender());
            modelAndView.addObject("course", studentBean.getCourse());
            modelAndView.addObject("email", studentBean.getEmail());
            Integer phone = studentBean.getPhone();
            modelAndView.addObject("phone", phone.toString());
            modelAndView.addObject("username", studentBean.getUsername());
            modelAndView.addObject("password", studentBean.getPassword());

        } else {
            modelAndView = new ModelAndView("editStudent");
            modelAndView.addObject("searchStatus", "Student is not available !!!");
        }

        return modelAndView;
    }

    @RequestMapping(value = "/editStudent", method = RequestMethod.POST)
    public ModelAndView editStudentDetails(@RequestParam("id") String id, @RequestParam("name") String name,
            @RequestParam("gender") String gender, @RequestParam("course") String course,
            @RequestParam("email") String email, @RequestParam("phone") String phone,
            @RequestParam("username") String username, @RequestParam("password") String password) {

        StudentBean studentBean = new StudentBean();

        studentBean.setId(Integer.parseInt(id));
        studentBean.setName(name);
        studentBean.setGender(gender);
        studentBean.setCourse(course);
        studentBean.setEmail(email);
        studentBean.setPhone(Integer.parseInt(phone));
        studentBean.setUsername(username);
        studentBean.setPassword(password);

        if (editStudentService.updateStudent(studentBean)) {
            modelAndView = new ModelAndView("editStudent");
            modelAndView.addObject("statusAfterEdit", "Student Details Updated Successfully !!!");
        } else {
            modelAndView = new ModelAndView("editStudent");
            modelAndView.addObject("statusAfterEdit", "Student Updation Failed !!!");
        }

        return modelAndView;
    }
}
