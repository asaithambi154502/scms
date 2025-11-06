
package com.example.scms;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/doctors")
public class DoctorController {
    private final DoctorService service;
    public DoctorController(DoctorService service){ this.service = service; }

    @PostMapping
    public Doctor create(@RequestBody Doctor d){ return service.create(d); }

    @GetMapping
    public List<Doctor> search(@RequestParam(required=false) String q){ return service.search(q); }
}
