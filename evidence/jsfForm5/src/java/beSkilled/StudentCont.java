/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beSkilled;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author User
 */
@ManagedBean
@SessionScoped
public class StudentCont {
    StudentMod student;

    public StudentMod getStudent() {
        if (student==null) {
            student=new StudentMod();
            
        }
        return student;
    }

    public void setStudent(StudentMod student) {
        this.student = student;
    }
    public void reset(){
    student=new StudentMod();
    }
    
}
