/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beSkilled.cont;

import beSkilled.mod.StudenModel;
import javax.faces.bean.ManagedBean;

import javax.faces.bean.SessionScoped;

/**
 *
 * @author Mostafizur
 */
@ManagedBean
@SessionScoped
public class StudentCont {
    StudenModel student;

    public StudenModel getStudent() {
        if (student==null) {
            student=new StudenModel();
            
        }
        return student;
    }

    public void setStudent(StudenModel student) {
        this.student = student;
    }
    public void reset(){
    student=new StudenModel();
            }
    
}
