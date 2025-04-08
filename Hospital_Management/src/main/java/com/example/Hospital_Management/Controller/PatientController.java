package com.example.Hospital_Management.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Hospital_Management.Entity.Patients;
import com.example.Hospital_Management.Service.PatientService;

@RestController
@RequestMapping("/api/patients")
public class PatientController {
	
	@Autowired
	private PatientService patientService;
	
	@PostMapping("/Save")
	public Patients savePatients(@RequestBody Patients patients) {
		return patientService.savePatient(patients);
	}
	
	@GetMapping("All")
	public List<Patients>getAll(){
		return patientService.getAllPatients();
	}
	
	@GetMapping("/{id}")
	public Optional<Patients>getById(@PathVariable Long id){
		return patientService.getById(id);
	}
	

}
