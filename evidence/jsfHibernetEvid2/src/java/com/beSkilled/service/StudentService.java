
package com.beSkilled.service;

import com.beSkilled.entitly.Student;
import com.beSkilled.utile.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class StudentService {
   public static void savaOrUpdate(Student student){
       SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
       Session session=sessionFactory.getCurrentSession();
       Transaction tr=session.beginTransaction();
       session.saveOrUpdate(student);
       System.out.println("Success insert");
       tr.commit();
   }
}
