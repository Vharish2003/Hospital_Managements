package com.example.Hospital_Management.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Hospital_Management.Entity.Nurses;
import com.example.Hospital_Management.Service.NurseService;

@RestController
@RequestMapping("/api/nurse")
public class NurseController {
	
	@Autowired
	private NurseService nurseService;
	
	@PostMapping("Save")
	public Nurses saveAll(@RequestBody Nurses nurse) {
		return nurseService.saveNurse(nurse);
	}
	
	@GetMapping("All")
	public ResponseEntity<?>getAll(){
		List<Nurses>nurse=nurseService.getAllNurses();
		if(nurse.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("nurses list are not found in given List");
		}
		else {
			return ResponseEntity.ok(nurse);
		}
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?>getByid(@PathVariable Long id){
		Optional<Nurses>nurse=nurseService.getById(id);
		if(nurse.isPresent()) {
			return ResponseEntity.ok(nurse.get());
		}
		else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("given id is Not_Found in given lis" +id);
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?>deleteByid(@PathVariable Long id){
		boolean nurse=nurseService.deleteById(id);
		if(nurse) {
			return ResponseEntity.status(HttpStatus.ACCEPTED).body("Success fully deleted given id" +id);
		}
		else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("given id is not deleted");
		}
	}

}
