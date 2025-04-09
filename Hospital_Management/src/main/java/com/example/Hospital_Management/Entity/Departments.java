package com.example.Hospital_Management.Entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Departments {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long Dept_Id;
	private String dept_name;
	private String dept_head;
	
	public long getDept_Id() {
		return Dept_Id;
	}
	public void setDept_Id(long dept_Id) {
		Dept_Id = dept_Id;
	}
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	public String getDept_head() {
		return dept_head;
	}
	public void setDept_head(String dept_head) {
		this.dept_head = dept_head;
	}
	@Override
	public String toString() {
		return "Departments [Dept_Id=" + Dept_Id + ", dept_name=" + dept_name + ", dept_head=" + dept_head + "]";
	}
	public Departments(long dept_Id, String dept_name, String dept_head) {
		super();
		Dept_Id = dept_Id;
		this.dept_name = dept_name;
		this.dept_head = dept_head;
	}
	public Departments() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	}
