package com.example.Hospital_Management.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Doctors {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long D_Id;
	@JsonProperty("Name")
	private String Name;
	@JsonProperty("Specialization")
	private String Specialization;
	@JsonProperty("ContactNo")
	private String ContactNo;
	@JsonProperty("Shift")
	private String Shift;
	
	
	@ManyToOne
	@JsonProperty("Dept_Id")
	@JoinColumn(name = "Dept_Id")
	private Departments department;


	public long getD_Id() {
		return D_Id;
	}


	public void setD_Id(long d_Id) {
		D_Id = d_Id;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getSpecialization() {
		return Specialization;
	}


	public void setSpecialization(String specialization) {
		Specialization = specialization;
	}


	public String getContactNo() {
		return ContactNo;
	}


	public void setContactNo(String contactNo) {
		ContactNo = contactNo;
	}


	public String getShift() {
		return Shift;
	}


	public void setShift(String shift) {
		Shift = shift;
	}


	public Departments getDepartment() {
		return department;
	}


	public void setDepartment(Departments department) {
		this.department = department;
	}


	@Override
	public String toString() {
		return "Doctors [D_Id=" + D_Id + ", Name=" + Name + ", Specialization=" + Specialization + ", ContactNo="
				+ ContactNo + ", Shift=" + Shift + ", department=" + department + "]";
	}


	public Doctors(long d_Id, String name, String specialization, String contactNo, String shift,
			Departments department) {
		super();
		D_Id = d_Id;
		Name = name;
		Specialization = specialization;
		ContactNo = contactNo;
		Shift = shift;
		this.department = department;
	}


	public Doctors() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
