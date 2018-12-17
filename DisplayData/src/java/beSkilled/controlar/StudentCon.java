
package beSkilled.controlar;

import beSkilled.Student;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class StudentCon {
    Student student;

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
