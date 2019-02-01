package com.spi.Test;

import javax.persistence.*;

import com.spi.bean.StudentEntity;
import com.spi.bean.Subject;

public class TestApp {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Student_details");

		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
//		
		StudentEntity s1 = new StudentEntity();
		s1.setS_id(1);
		s1.setS_name("varsha");
		s1.setS_age(22);

		StudentEntity s2 = new StudentEntity();
		s2.setS_id(2);
		s2.setS_name("vandana");
		s2.setS_age(16);
		
		
//
		Subject sb1 = new Subject();
		sb1.setName("ENGLISH");
		sb1.setMarks(80);
		sb1.setS_id(s1.getS_id());

		Subject sb2 = new Subject();
		sb2.setName("Maths");
		sb2.setMarks(75);
		sb2.setS_id(s2.getS_id());

		s1.setSub(sb1);
		s2.setSub(sb2);

		em.persist(s1);// No need to perform persist operation separately for different entities.
		em.persist(s2);
		
		System.out.println("Record successfully inserted");
		em.getTransaction().commit();

		em.close();
		emf.close();
    

	}

}