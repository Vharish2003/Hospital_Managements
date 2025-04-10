package com.example.Hospital_Management.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Hospital_Management.Entity.Nurses;
import com.example.Hospital_Management.Repository.NursesRepository;

@Service
public class NurseService {
	
	@Autowired
	private NursesRepository nurseRepo;
	
	public Nurses saveNurse(Nurses nurse) {
		return nurseRepo.save(nurse);
	}
	
	public List<Nurses>getAllNurses(){
		return nurseRepo.findAll();
	}
	public Optional<Nurses>getById(Long id){
		return nurseRepo.findById(id);
	}
	
	public boolean deleteById(Long id) {
		if(nurseRepo.existsById(id)) {
			nurseRepo.deleteById(id);
			return true;
		}
		else {
			return false;
		}
	}

}
