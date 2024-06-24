package com.example.patents.Interface;

import com.example.patents.RequestModel.WeightModel;
import com.example.patents.ResponseModel.ResponseDate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PatientLogsRepository extends JpaRepository<WeightModel, Long> {
    @Modifying
    @Query(value = "UPDATE patient_logs set height=?1, weight=?1,bmi=?1,generalhealth=?1,ondiet=?1,takingDrugs=?1,coments=?1,status=?1  WHERE firstName=?1 AND lastName=?1", nativeQuery = true)
    public boolean updatepatientlogs(String height,String weight,String bmi,String generalHealth,String ondiet,String takingDrugs,String coment,String status, String firstName, String lastName);

   @Query(value = "SELECT CONCAT(first_name,last_name) as customerName FROM patient_profile WHERE first_name  IN (SELECT status FROM patient_logs)",nativeQuery = true)
    public List<ResponseDate> patientsList();
}
