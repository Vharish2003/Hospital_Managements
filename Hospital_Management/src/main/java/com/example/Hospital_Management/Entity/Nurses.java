package com.example.Hospital_Management.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Nurses {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long N_Id;
	private String Name;
	private String Shift;
	private long contact;
	
	@ManyToOne
	@JoinColumn(name="Dept_Id")
	private Departments departments;

	public long getN_Id() {
		return N_Id;
	}

	public void setN_Id(long n_Id) {
		N_Id = n_Id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getShift() {
		return Shift;
	}

	public void setShift(String shift) {
		Shift = shift;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public Departments getDepartments() {
		return departments;
	}

	public void setDepartments(Departments departments) {
		this.departments = departments;
	}

	@Override
	public String toString() {
		return "Nurses [N_Id=" + N_Id + ", Name=" + Name + ", Shift=" + Shift + ", contact=" + contact
				+ ", departments=" + departments + "]";
	}

	public Nurses(long n_Id, String name, String shift, long contact, Departments departments) {
		super();
		N_Id = n_Id;
		Name = name;
		Shift = shift;
		this.contact = contact;
		this.departments = departments;
	}

	public Nurses() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

		}
