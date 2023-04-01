package com.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String campany;
    private int salary;
    
    
	public Employee(int id, String name, String campany, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.campany = campany;
		this.salary = salary;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCampany() {
		return campany;
	}


	public void setCampany(String campany) {
		this.campany = campany;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", campany=" + campany + ", salary=" + salary + "]";
	}


	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
    
    
    

}
