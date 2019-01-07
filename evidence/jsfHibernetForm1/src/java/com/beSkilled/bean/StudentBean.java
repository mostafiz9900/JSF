/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beSkilled.bean;

import com.beSkilled.entity.Student;
import com.beSkilled.service.StudentService;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author User
 */
@ManagedBean
@ViewScoped
public class StudentBean {

    private StudentService service = new StudentService();
    private Student student;
    private List<Student> list;
    private String[] courseCompleated;

    public void save() {
        String cc = "";
        for (String s : courseCompleated) {
            cc += s + " , ";
        }
        student.setSubject(cc);
        service.saveOrInsert(student);
    }

    public void update() {
        String cc = "";
        for (String s : courseCompleated) {
            cc += s + " , ";
        }
        student.setSubject(cc);
        service.saveOrInsert(student);
    }

    public void del() {
        service.del(student);
    }

    public Student searchId() {
        Student s = new Student();
        s = service.getById(student.getId());
        return s;

    }

    public StudentService getService() {
        return service;
    }

    public void setService(StudentService service) {
        this.service = service;
    }

    public Student getStudent() {
        if (student == null) {
            student = new Student();

        }
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public List<Student> getList() {
        list = new ArrayList<>();
        list = service.getList();
        return list;
    }

    public void setList(List<Student> list) {
        this.list = list;
    }

    public String[] getCourseCompleated() {
        return courseCompleated;
    }

    public void setCourseCompleated(String[] courseCompleated) {
        this.courseCompleated = courseCompleated;
    }

}
