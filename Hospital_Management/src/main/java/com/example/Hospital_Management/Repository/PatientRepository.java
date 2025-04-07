package com.example.Hospital_Management.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Hospital_Management.Entity.Patients;

@Repository
public interface PatientRepository extends JpaRepository<Patients, Long>{

}
