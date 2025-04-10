package com.example.Hospital_Management.Entity;

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
	private String Name;
	private String Shift;
	private long contact;
	
	@ManyToOne
	@JoinColumn(name="Dept_Id")
	private Departments departments;


		}
