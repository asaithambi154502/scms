
package com.example.scms;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/appointments")
public class AppointmentController {
    private final AppointmentService service;
    public AppointmentController(AppointmentService service){ this.service = service; }

    @PostMapping
    public Appointment create(@RequestBody Appointment a){ return service.create(a); }

    @GetMapping("/doctor/{id}")
    public List<Appointment> forDoctor(@PathVariable Long id){ return service.forDoctor(id); }
}
