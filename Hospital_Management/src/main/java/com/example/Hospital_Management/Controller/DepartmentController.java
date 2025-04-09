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

import com.example.Hospital_Management.Entity.Departments;
import com.example.Hospital_Management.Service.DepartmentService;

@RestController
@RequestMapping("/api/department")
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping("Save")
	public Departments saveAll(@RequestBody Departments department) {
		return departmentService.saveDepartment(department);
	}
	@GetMapping("All")
	public List<Departments>getAll(){
		return departmentService.getAllDepartments();
	}
	@GetMapping("/{id}")
	public Optional<Departments>findId(@PathVariable Long id){
		return departmentService.getById(id);
	}

}
