package com.demo;


import com.demo.entity.Alien;
import com.demo.entity.AlienName;
import com.demo.entity.Laptop;
import com.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

      /*  AlienName an=new AlienName();
        an.setSurname("varthya");
        an.setMiddle_name("vijaya");
        an.setLast_name("sri");

        Alien alien= new Alien();
        alien.setAid(101);
        alien.setName(an);
        alien.setColor("blue");
*/

        Laptop laptop = new Laptop();
        laptop.setLid(001);
        laptop.setName("HP");

        Student student = new Student();
        student.setRollNo(101);
        student.setName("Anna");
        student.setMarks(70);
        student.getLaptop().add(laptop);

        Configuration cfg=new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);

        SessionFactory sf=cfg.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        session.save(laptop);
        session.save(student);

        System.out.println( "values saved" );
        tx.commit();
    }
}
