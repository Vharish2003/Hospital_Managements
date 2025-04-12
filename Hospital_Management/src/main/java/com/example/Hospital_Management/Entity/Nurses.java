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
public class Nurses {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long N_Id;
	@JsonProperty("Name")
	private String Name;
	@JsonProperty("Shift")
	private String Shift;
	@JsonProperty("contact")
	private long contact;
	
	@ManyToOne
	@JsonProperty("Dept_Id")
	@JoinColumn(name="Dept_Id")
	private Departments departments;


		}
