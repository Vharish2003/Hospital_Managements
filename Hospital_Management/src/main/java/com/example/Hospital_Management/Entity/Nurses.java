package com.example.Hospital_Management.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Nurses {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long N_Id;
	private String Name;
	private String Department;
	private String Shift;
	private long contact;
	
	
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
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
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
	@Override
	public String toString() {
		return "Nurses [N_Id=" + N_Id + ", Name=" + Name + ", Department=" + Department + ", Shift=" + Shift
				+ ", contact=" + contact + "]";
	}
	public Nurses(long n_Id, String name, String department, String shift, long contact) {
		super();
		N_Id = n_Id;
		Name = name;
		Department = department;
		Shift = shift;
		this.contact = contact;
	}
	public Nurses() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
