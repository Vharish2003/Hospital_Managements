package com.example.Hospital_Management.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Hospital_Management.Entity.Departments;
import com.example.Hospital_Management.Repository.DepartmentsRepository;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentsRepository departmentRepo;
	
	public Departments saveDepartment(Departments department) {
		return departmentRepo.save(department);
	}
	
	public List<Departments>getAllDepartments(){
		return departmentRepo.findAll();
	}
	public Optional<Departments>getById(Long id){
		return departmentRepo.findById(id);
	}

}
