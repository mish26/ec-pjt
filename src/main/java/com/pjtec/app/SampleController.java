package com.pjtec.app;

import com.pjtec.domain.service.repository.SampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @Autowired
    SampleRepository sampleRepository;

    @GetMapping("/")
    public int test() {
        return sampleRepository.select();
    }

}
