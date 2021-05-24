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
		
		Student st=em.find(Student.class,1);
	    
	   System.out.println(st.getName());
	   
	
		
		transaction.commit();
		em.close();  
		
		   System.out.println(st.getSubjectList());
		
	}

}
