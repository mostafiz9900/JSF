
package beSkilled;

import beSkilled.dao.UserDAO;
import java.sql.SQLDataException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class LoginBean {
   private String uname, pass, msg;

    public LoginBean() {
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    public String loginAction()throws SQLDataException{
    boolean result=UserDAO.login(uname, pass);
        if (result) {
            return "home";
            
            
        }else{
        setMsg("login Failed!");
        setUname("");
        setPass("");
        return "index";
        
        }
    }
}
