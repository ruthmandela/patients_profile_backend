package com.example.patents.Controller;
import com.example.patents.RequestModel.PatientRegistationModel;
import com.example.patents.RequestModel.WeightModel;
import com.example.patents.Service.PatientRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping( "/patient")


public class PatientRegistrationController {
    @Autowired
    PatientRegistrationService patientRegistrationService;


    @PostMapping(value = "/register")
    public ResponseEntity<?> registerProfile(@RequestBody PatientRegistationModel payload) {
        return ResponseEntity.ok(patientRegistrationService.registerPatients(payload));
    }

    @PutMapping(value = "/clinicalRecords")
    public ResponseEntity<?> updateClinicalRecord(@RequestBody WeightModel model,
                                                  @RequestParam(name = "firstName") String firstName,
                                                  @RequestParam(name = "lastName") String lastName) {

        return ResponseEntity.ok(patientRegistrationService.updateClinicalData(model, firstName, lastName));
    }

    @GetMapping(value = "/getPatients")
    public ResponseEntity<?>getPatientsList(){
        return ResponseEntity.ok(patientRegistrationService.getAll());

    }
}
