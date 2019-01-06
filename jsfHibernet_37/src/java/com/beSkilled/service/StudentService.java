
package com.beSkilled.service;

import com.beSkilled.entity.Student;
import com.beSkilled.utile.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class StudentService {
    public static void saveOrUpdate(Student student){
        SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
        Session session=sessionFactory.getCurrentSession();
        
        Transaction tr=session.beginTransaction();
        session.saveOrUpdate(tr);
        System.out.println("insert and update success");
        tr.commit();
    }
    
    public static void delete(Student student){
        SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
        Session session=sessionFactory.getCurrentSession();
        
        Transaction tr=session.beginTransaction();
        session.delete(student);
         System.out.println("delete success");
        tr.commit();
    }
    
    public static Student getById(int id){
        SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
        Session session=sessionFactory.getCurrentSession();
        Student student=(Student) session.get(Student.class, id);
        
        Transaction tr=session.beginTransaction();
       
        tr.commit();
        return student;
    }
     public static List<Student> getList(){
        SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
        Session session=sessionFactory.getCurrentSession();
        List<Student> students=session.createCriteria(Student.class).list();
        
        Transaction tr=session.beginTransaction();
       
        tr.commit();
        return  students;
    }
    
}
