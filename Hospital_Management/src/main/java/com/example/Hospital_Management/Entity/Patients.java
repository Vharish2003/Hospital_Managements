package com.example.Hospital_Management.Entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Patients {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long P_Id;
	@JsonProperty("Name")
	private String Name;
	@JsonProperty("Gender")
	private String Gender;
	@JsonProperty("Admission_Date")
	private Date Admission_Date;
    @JsonProperty("contact")
    private long contact;


}
