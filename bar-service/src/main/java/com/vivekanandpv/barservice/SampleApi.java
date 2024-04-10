package com.vivekanandpv.barservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/sample")
public class SampleApi {

    @GetMapping
    public String get() {
        return "Hello from bar service";
    }
}
