/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beSkilled.model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Mostafizur
 */
@ManagedBean
@SessionScoped
public class StuCon {

    StuMod stu;

    public StuMod getStu() {
        if (stu == null) {
            stu = new StuMod();

        }
        return stu;
    }

    public void setStu(StuMod stu) {
        this.stu = stu;
    }

}
