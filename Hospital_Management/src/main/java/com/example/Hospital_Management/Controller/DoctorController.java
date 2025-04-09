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
	public List<Doctors>getAll(){
		return doctorService.getAllDoctors();
	}
	@GetMapping("/{id}")
	public Optional<Doctors>getByid(@PathVariable Long id){
		return doctorService.getById(id);
	}
}
