package com.cts;


import java.util.Arrays;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=  Persistence.createEntityManagerFactory("myApp");

		EntityManager em=emf.createEntityManager();
		
		EntityTransaction transaction =em.getTransaction();
		
		transaction.begin();
		
		Student st=new Student();
		
		st.setName("abc");
		
		Student st1=new Student();
		
		st1.setName("def");
		
		Subject sub=new Subject();
		
		sub.setName("java");
		
		Subject sub1=new Subject();
		
		sub1.setName("mysql");
		
		st1.setSubjectList(Arrays.asList(sub));
		
		st.setSubjectList(Arrays.asList(sub,sub1));
		
		sub.setStudentList(Arrays.asList(st,st1));
		
		sub1.setStudentList(Arrays.asList(st));
	 
	     em.persist(st);
	     em.persist(st1);
	     
	    
		
		transaction.commit();
		em.close();  
		
		 
		
	}

}
