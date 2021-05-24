package com.cts;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

//@Entity
//@Table(name = "employee_table")
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//@DiscriminatorColumn(name = "emp_type")
//@MappedSuperclass
public class Employee {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.TABLE,generator = "seq_gen")
//	@SequenceGenerator(name = "seq_gen",initialValue = 1000)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	//@Column(name = "employee_name")
	private String name;
	
	//@Transient
	private int salary;
	
	@Temporal(TemporalType.DATE)
	private Date doj;
	
	@Embedded
	private Address address;
	
	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	
	  public int getId() { return id; }
	  
	  public void setId(int id) { this.id = id; }
	 

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee name=" + name + ", salary=" + salary + ", doj=" + doj + "]";
	}
	
	
	

}
