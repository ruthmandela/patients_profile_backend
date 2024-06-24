package com.example.patents.Service;

import com.example.patents.Interface.PatientLogsRepository;
import com.example.patents.Interface.PatientRepository;
import com.example.patents.RequestModel.PatientRegistationModel;
import com.example.patents.RequestModel.WeightModel;
import com.example.patents.ResponseModel.ResponseDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class PatientRegistrationService {
    @Autowired
    PatientRepository patientRepository;
    @Autowired
    PatientLogsRepository patientLogsRepository;

    public ResponseEntity<?> registerPatients(PatientRegistationModel payload) {
        WeightModel model = new WeightModel();
        HashMap<String, Object> map = new HashMap<>();
        try {

            payload.getIdNo();
            payload.getFirstName();
            payload.getLastName();
            payload.getDob();
            payload.getDob();
            model.setFirstName(payload.getFirstName());
            model.setLastName(payload.getLastName());
            patientRepository.save(payload);
            patientLogsRepository.save(model);
            map.put("message", "Request executed succesfully");
            map.put("succesful", true);
            map.put("messageCode", "200");
            map.put("", "");
            return ResponseEntity.ok(map);

        } catch (Exception el) {
            el.printStackTrace();
            map.put("message", "Failed to execute");
            map.put("succesful", false);
            map.put("messageCode", "400");
            map.put("", "");
            return ResponseEntity.ok(map);
        }
    }

    public ResponseEntity<?>updateClinicalData( WeightModel model,String firtName,String lastName){
        HashMap<String, Object> map = new HashMap<>();
        try {
            if (patientLogsRepository.updatepatientlogs(model.getHeight(), model.getWeight() , model.getBmi(), model.getGeneralHealth(), model.getOnDiet(), model.getTakingDrugs(), model.getComents(),model.getStatus(), firtName, lastName)){
                ;
            map.put("message", "Request executed succesfully");
            map.put("succesful", true);
            map.put("messageCode", "200");
            map.put("", "");
            return ResponseEntity.ok(map);
        }else{

                map.put("message", "Customer does not exist");
                map.put("succesful", false);
                map.put("messageCode", "400");
                return ResponseEntity.ok(map);

            }


        }catch(Exception el){
            el.printStackTrace();
            map.put("message", "Failed to execute");
            map.put("succesful", false);
            map.put("messageCode", "400");
            return ResponseEntity.ok(map);
        }
    }
    public  ResponseEntity<?>getAll(){
        List<ResponseDate> list=patientLogsRepository.patientsList();
        return ResponseEntity.ok(list);
    }

}
