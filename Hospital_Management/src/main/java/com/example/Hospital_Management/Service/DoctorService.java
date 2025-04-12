package com.example.Hospital_Management.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Hospital_Management.Entity.Doctors;
import com.example.Hospital_Management.Repository.DoctorsRepository;

@Service
public class DoctorService {
	
	@Autowired
	private DoctorsRepository doctorRepo;
	
	public Doctors saveDoctors(Doctors doctors) {
		return doctorRepo.save(doctors);
	}
	public List<Doctors>getAllDoctors(){
		return doctorRepo.findAll();
	}
	public Optional<Doctors>getById(Long id){
		return doctorRepo.findById(id);
	}
	public boolean deleteById(Long id) {
		if(doctorRepo.existsById(id)) {
			doctorRepo.deleteById(id);
			return true;
		}else {
			return false;
		}
	}

}
