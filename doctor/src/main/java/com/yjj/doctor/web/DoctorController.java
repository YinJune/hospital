package com.yjj.doctor.web;

import com.yjj.doctor.dto.TreatmentDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorController {
    @Value("${server.port}")
    private String port;

    @GetMapping("/hi")
    public String hi(){
        System.out.println("hi~ I am doctor");
        return "hi";
    }

    @PostMapping("treatment")
    public String treatment(@RequestBody TreatmentDTO treatmentDTO){
        System.out.println(treatmentDTO.toString());
        return "ok";
    }
}
