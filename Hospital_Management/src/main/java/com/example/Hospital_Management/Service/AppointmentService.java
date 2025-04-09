package com.example.Hospital_Management.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Hospital_Management.Entity.Appointments;
import com.example.Hospital_Management.Repository.AppointmentsRepository;

@Service
public class AppointmentService {
	
	@Autowired
	private AppointmentsRepository appointmentRepo;
	
	public Appointments saveAppointments(Appointments appointment) {
		return appointmentRepo.save(appointment);
	}
	public List<Appointments>getAllAppointments(){
		return appointmentRepo.findAll();
	}
	public Optional<Appointments>getById(Long id){
		return appointmentRepo.findById(id);
	}

}
