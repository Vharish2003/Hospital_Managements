package com.example.Hospital_Management.Entity;

import java.sql.Time;
import java.util.Date;

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
public class Appointments {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long Apt_Id;
	@JsonProperty("Apt_Date")
	private Date Apt_Date;
	@JsonProperty("Apt_Time")
	private Time Apt_Time;
	
	@ManyToOne
	@JsonProperty("D_Id")
	@JoinColumn(name="D_Id")
	private Doctors doctors;
	
	@ManyToOne
	@JsonProperty("P_Id")
	@JoinColumn(name="P_Id")
	private Patients patients;

	
	
	public long getApt_Id() {
		return Apt_Id;
	}

	public void setApt_Id(long apt_Id) {
		Apt_Id = apt_Id;
	}

	public Date getApt_Date() {
		return Apt_Date;
	}

	public void setApt_Date(Date apt_Date) {
		Apt_Date = apt_Date;
	}

	public Time getApt_Time() {
		return Apt_Time;
	}

	public void setApt_Time(Time apt_Time) {
		Apt_Time = apt_Time;
	}

	public Doctors getDoctors() {
		return doctors;
	}

	public void setDoctors(Doctors doctors) {
		this.doctors = doctors;
	}

	public Patients getPatients() {
		return patients;
	}

	public void setPatients(Patients patients) {
		this.patients = patients;
	}

	@Override
	public String toString() {
		return "Appointments [Apt_Id=" + Apt_Id + ", Apt_Date=" + Apt_Date + ", Apt_Time=" + Apt_Time + ", doctors="
				+ doctors + ", patients=" + patients + "]";
	}

	public Appointments(long apt_Id, Date apt_Date, Time apt_Time, Doctors doctors, Patients patients) {
		super();
		Apt_Id = apt_Id;
		Apt_Date = apt_Date;
		Apt_Time = apt_Time;
		this.doctors = doctors;
		this.patients = patients;
	}

	public Appointments() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
