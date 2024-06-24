package com.example.patents.Interface;

import com.example.patents.RequestModel.PatientRegistationModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<PatientRegistationModel, Long> {


}
