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
public class formV {

    formVMod fr;

    public formVMod getFr() {
        if (fr==null) {
            fr=new formVMod();
            
        }
        return fr;
    }

    public void setFr(formVMod fr) {
        this.fr = fr;
    }

    

   

}
