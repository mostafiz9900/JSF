/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beSkilled.Controller;

import com.beSkilled.entity.Student;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Mostafizur
 */
@ManagedBean
@SessionScoped
public class StudentCont {
    private Student student;

    public Student getStudent() {
        if (student==null) {
            student=new Student();
        
        }
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
    
}
