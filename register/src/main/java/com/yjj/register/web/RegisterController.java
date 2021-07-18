package com.yjj.register.web;

import com.yjj.register.client.DoctorClient;
import com.yjj.register.dto.RegisterDTO;
import com.yjj.register.dto.client.TreatmentDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {

    @Autowired
    private DoctorClient doctorClient;

    @GetMapping("hi")
    public String hi(){
        System.out.println("hi");
        return "hi";
    }

    @PostMapping("/unhappy")
    public String register(@RequestBody TreatmentDTO treatmentDTO){
        System.out.println(treatmentDTO.toString());
        String resp=doctorClient.treatment(treatmentDTO);
        System.out.println(resp);
        return "ok";
    }
}
