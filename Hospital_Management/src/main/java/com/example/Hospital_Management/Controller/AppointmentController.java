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

import com.example.Hospital_Management.Entity.Appointments;
import com.example.Hospital_Management.Service.AppointmentService;

@RestController
@RequestMapping("/api/appointment")
public class AppointmentController {
	
	@Autowired
	private AppointmentService appointentService;
	
	@PostMapping("Save")
	public Appointments saveAll(@RequestBody Appointments appointment) {
		return appointentService.saveAppointments(appointment);
	}
	
	@GetMapping("All")
	public List<Appointments>getAll(){
		return appointentService.getAllAppointments();
	}
	@GetMapping("/{id}")
	public ResponseEntity <Optional<Appointments>> getByid(@PathVariable Long id){

		Optional<Appointments> appointments = appointentService.getById(id);
		if (appointments.isPresent()){
			return ResponseEntity.ok(appointments);
		}
		else {
			return ResponseEntity.ok(appointments);
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?>deleteByid(@PathVariable Long id){
		boolean appointment=appointentService.deleteById(id);
		if(appointment) {
			return ResponseEntity.status(HttpStatus.ACCEPTED).body("Given Id is Success Fully Deleted"+id);
		}
		else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Given id is Not deleted"+id);
		}
	}

}
