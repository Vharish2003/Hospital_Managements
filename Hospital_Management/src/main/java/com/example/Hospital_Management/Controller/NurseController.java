package com.example.Hospital_Management.Controller;

import java.util.List;
import java.util.Optional;

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
	
	private NurseService nurseService;
	
	@PostMapping("Save")
	public Nurses saveAll(@RequestBody Nurses nurse) {
		return nurseService.saveNurse(nurse);
	}
	@GetMapping("All")
	public List<Nurses>getAll(){
		return nurseService.getAllNurses();
	}
	@GetMapping("/{id}")
	public Optional<Nurses>getByid(@PathVariable Long id){
		return nurseService.getById(id);
	}
	

}
