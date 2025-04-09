package com.example.Hospital_Management.Service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Hospital_Management.Entity.Medical_Records;
import com.example.Hospital_Management.Repository.RecordsRepository;

@Service
public class MedicalRecordService {
	
	@Autowired
	private RecordsRepository recordsRepo;
	
	public Medical_Records saveRecords(Medical_Records records) {
		return recordsRepo.save(records);
	}
	
	public List<Medical_Records>getAllRecords(){
		return recordsRepo.findAll();
	}
	public Optional<Medical_Records>getById(Long id){
		return recordsRepo.findById(id);
	}

}
