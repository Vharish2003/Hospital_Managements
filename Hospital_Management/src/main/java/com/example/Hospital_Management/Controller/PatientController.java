package com.example.Hospital_Management.Controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
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
	public ResponseEntity<?>getAll(){
		List<Patients>patients=patientService.getAllPatients();
		if(patients.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Values are not inserted");
		}
		else {
			return ResponseEntity.ok(patients);
		}
	}
	

	@GetMapping("/{id}")
	public ResponseEntity<?>getByid(@PathVariable Long id){
		Optional<Patients>patient=patientService.getById(id);
		if(patient.isPresent()) {
			return ResponseEntity.ok(patient.get());
		}
		else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("patient Id is Not_Found in Given List "+id);
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?>deleteId(@PathVariable Long id){
		boolean patients=patientService.deleteByid(id);
		if(patients) {
			return ResponseEntity.ok("success fully deleted");
		}
		else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("given id is not deleted");
		}
	}

}
