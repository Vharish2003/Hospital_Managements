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

import com.example.Hospital_Management.Entity.Doctors;
import com.example.Hospital_Management.Service.DoctorService;

@RestController
@RequestMapping("api/doctors")
public class DoctorController {
	
	@Autowired
	private DoctorService doctorService;

	@PostMapping("Save")
	public Doctors saveAllDoctors(@RequestBody Doctors doctors) {
		return doctorService.saveDoctors(doctors);
	}
	
	@GetMapping("All")
	public ResponseEntity<?>getAll(){
		List<Doctors>doctors=doctorService.getAllDoctors();
		if(doctors.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Given Table is Empty");
		}
		else {
			return ResponseEntity.ok(doctors);
		}
	}
	@GetMapping("/{id}")
	public ResponseEntity<?>getByid(@PathVariable Long id){
		Optional<Doctors>doctors=doctorService.getById(id);
		if(doctors.isPresent()) {
			return ResponseEntity.ok(id);
		}
		else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Given id is Not Exists" +id);
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?>deleteByid(@PathVariable Long id){
		boolean doctors=doctorService.deleteById(id);
		if(doctors) {
			return ResponseEntity.status(HttpStatus.ACCEPTED).body("Given Id Is Success Fully Deleted"+id);
		}
		else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Given Id is Not Deleted"+id);
		}
	}
}
