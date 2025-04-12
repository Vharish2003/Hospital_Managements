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
	public ResponseEntity<?>getAll(){
		List<Departments>department=departmentService.getAllDepartments();
		if(department.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_MODIFIED).body("Given items are Not Exists");
		}
		else {
			return ResponseEntity.ok(department);
		}
	}
	@GetMapping("/{id}")
	public ResponseEntity<?>getByid(@PathVariable Long id){
		Optional<Departments>department=departmentService.getById(id);
		if(department.isPresent()) {
			return ResponseEntity.ok(id);
		}
		else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("given id is not exists"+id);
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?>deleteByid(@PathVariable Long id){
		boolean department=departmentService.deleteById(id);
		if(department) {
			return ResponseEntity.status(HttpStatus.ACCEPTED).body("Given id is Success Fully Deleted"+id);
		}
		else {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body("given id is not deleted"+id);
		}
	}

}
