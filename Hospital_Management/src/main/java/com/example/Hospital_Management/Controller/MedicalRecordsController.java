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

import com.example.Hospital_Management.Entity.Medical_Records;
import com.example.Hospital_Management.Service.MedicalRecordService;

@RestController
@RequestMapping("/api/records")
public class MedicalRecordsController {
	
	@Autowired
	private MedicalRecordService recordService;

	@PostMapping("Save")
	public Medical_Records saveAll(@RequestBody Medical_Records records) {
		return recordService.saveRecords(records);
	}
	@GetMapping("All")
	public List<Medical_Records>getAll(){
		return recordService.getAllRecords();
	}
	@GetMapping("/{id}")
	public Optional<Medical_Records>getByid(@PathVariable Long id){
		return recordService.getById(id);
	}
}
