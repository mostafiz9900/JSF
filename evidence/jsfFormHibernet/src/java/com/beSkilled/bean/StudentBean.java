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
 * @author Mostafizur
 */
@ManagedBean
@ViewScoped
public class StudentBean {

    private Student student;
    private List<Student> list;
    private String[] courseCompleted;
    
    public void save() {
        String su = "";
        for (String s : getCourseCompleted()) {
            su += s + " , ";
            
        }
        student.setSubject(su);
        StudentService service = new StudentService();
        service.saveOrEdit(student);
    }

    public void del() {
        StudentService service=new StudentService();
        service.delete(student);
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
        StudentService service=new StudentService();
        list=new ArrayList<>();
        list=service.getList();
        return list;
    }
    
    public void setList(List<Student> list) {
        this.list = list;
    }
    
    public String[] getCourseCompleted() {
        return courseCompleted;
    }
    
    public void setCourseCompleted(String[] courseCompleted) {
        this.courseCompleted = courseCompleted;
    }
    
}
