
package com.example.scms;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/prescriptions")
public class PrescriptionController {
    // Demo stub to satisfy file requirement
    @PostMapping
    public String create(@RequestBody String payload){
        return "PRESCRIPTION_CREATED";
    }
}
