package com.example.Hospital_Management.Entity;

import java.util.Date;

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
	private String Name;
	private String Gender;
	private Date Admission_Date;
    private long contact;


}
