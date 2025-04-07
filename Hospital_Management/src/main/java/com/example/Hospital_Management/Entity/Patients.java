package com.example.Hospital_Management.Entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Patients {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long P_Id;
	private String Name;
	private String Gender;
	private Date Admission_Date;
    private long contact;
    
    
	public long getP_Id() {
		return P_Id;
	}
	public void setP_Id(long p_Id) {
		P_Id = p_Id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public Date getAdmission_Date() {
		return Admission_Date;
	}
	public void setAdmission_Date(Date admission_Date) {
		Admission_Date = admission_Date;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Patients [P_Id=" + P_Id + ", Name=" + Name + ", Gender=" + Gender + ", Admission_Date=" + Admission_Date
				+ ", contact=" + contact + "]";
	}
	public Patients(long p_Id, String name, String gender, Date admission_Date, long contact) {
		super();
		P_Id = p_Id;
		Name = name;
		Gender = gender;
		Admission_Date = admission_Date;
		this.contact = contact;
	}
	public Patients() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
	

}
