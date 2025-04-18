package com.example.Hospital_Management.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;

import com.example.Hospital_Management.Entity.Patients;
import com.example.Hospital_Management.Repository.PatientRepository;

@Service
public class PatientService {
	
	@Autowired
	private PatientRepository patientRepo;
	
	public Patients savePatient(Patients patients) {
		return patientRepo.save(patients);
	}
	public List<Patients>getAllPatients(){
		return patientRepo.findAll();
	}
	public Optional<Patients>getById(Long id){
		return patientRepo.findById(id);
	}
	
	public boolean deleteByid(Long id){
		if(patientRepo.existsById(id)) {
		patientRepo.deleteById(id);
		return true;
		
	}
	else {
		return false;
	}
	}
}
