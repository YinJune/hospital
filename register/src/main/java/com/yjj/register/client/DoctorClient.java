package com.yjj.register.client;

import com.yjj.register.dto.client.TreatmentDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "doctor")
@RequestMapping("/doctor")
public interface DoctorClient {
    @GetMapping("hi")
    String hi();

    @PostMapping("treatment")
    String treatment(@RequestBody TreatmentDTO treatmentDTO);
}
