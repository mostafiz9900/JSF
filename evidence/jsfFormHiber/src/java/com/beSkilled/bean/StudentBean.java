/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beSkilled.bean;

import com.beSkilled.entity.Student;
import com.beSkilled.service.StudentService;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author User
 */
@ManagedBean
@ViewScoped
public class StudentBean {

    private Student student;
    private String[] courseCompleted;

    public void saveStu() {
        String cc = "";
        for (String s : courseCompleted) {
            cc += s + " , ";

        }
        student.setCompletedCourse(cc);
        student.setRegDate(new Date());
        StudentService service=new StudentService();
        service.saveStudent(student);
        System.out.println("Insert Success");
        
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String[] getCourseCompleted() {
        return courseCompleted;
    }

    public void setCourseCompleted(String[] courseCompleted) {
        this.courseCompleted = courseCompleted;
    }
    
}
