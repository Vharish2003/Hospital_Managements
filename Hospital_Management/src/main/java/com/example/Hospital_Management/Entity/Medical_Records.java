package com.example.Hospital_Management.Entity;

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
public class Medical_Records {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long Rec_Id;
	@JsonProperty("Diagnosis")
	private String Diagnosis;
	@JsonProperty("Prescription")
	private String Prescription;
	@JsonProperty("Rec_Date")
	private Date Rec_Date;
	@JsonProperty("Treatment")
	private String Treatment;
	
	
	@ManyToOne
	@JsonProperty("D_Id")
	@JoinColumn(name="D_Id")
	private Doctors doctors;
	
	@ManyToOne
	@JoinColumn(name="P_Id")
	@JsonProperty("P_Id")
	private Patients patients;

	public long getRec_Id() {
		return Rec_Id;
	}

	public void setRec_Id(long rec_Id) {
		Rec_Id = rec_Id;
	}

	public String getDiagnosis() {
		return Diagnosis;
	}

	public void setDiagnosis(String diagnosis) {
		Diagnosis = diagnosis;
	}

	public String getPrescription() {
		return Prescription;
	}

	public void setPrescription(String prescription) {
		Prescription = prescription;
	}

	public Date getRec_Date() {
		return Rec_Date;
	}

	public void setRec_Date(Date rec_Date) {
		Rec_Date = rec_Date;
	}

	public String getTreatment() {
		return Treatment;
	}

	public void setTreatment(String treatment) {
		Treatment = treatment;
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
		return "Medical_Records [Rec_Id=" + Rec_Id + ", Diagnosis=" + Diagnosis + ", Prescription=" + Prescription
				+ ", Rec_Date=" + Rec_Date + ", Treatment=" + Treatment + ", doctors=" + doctors + ", patients="
				+ patients + "]";
	}

	public Medical_Records(long rec_Id, String diagnosis, String prescription, Date rec_Date, String treatment,
			Doctors doctors, Patients patients) {
		super();
		Rec_Id = rec_Id;
		Diagnosis = diagnosis;
		Prescription = prescription;
		Rec_Date = rec_Date;
		Treatment = treatment;
		this.doctors = doctors;
		this.patients = patients;
	}

	public Medical_Records() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
