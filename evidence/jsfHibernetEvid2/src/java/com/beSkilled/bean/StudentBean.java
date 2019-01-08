/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beSkilled.bean;

import com.beSkilled.entitly.Student;
import com.beSkilled.service.StudentService;
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
  private StudentService service=new StudentService();
  private Student student;
  private String[] courseComplete;
  private List<Student> list;
  
  public void save(){
  String cc="";
      for (String s:courseComplete) {
          cc+=s+" , ";
      }
      student.setSubject(cc);
      service.savaOrUpdate(student);
      
  }
  public void reset(){
  student=new Student();
  }

    public StudentService getService() {
        return service;
    }

    public void setService(StudentService service) {
        this.service = service;
    }

    public Student getStudent() {
        if (student==null) {
            student=new Student();
            
        }
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String[] getCourseComplete() {
        return courseComplete;
    }

    public void setCourseComplete(String[] courseComplete) {
        this.courseComplete = courseComplete;
    }

    public List<Student> getList() {
        return list;
    }

    public void setList(List<Student> list) {
        this.list = list;
    }
  
  
}
