
package com.example.scms;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AppointmentService {
    private final AppointmentRepository repo;
    public AppointmentService(AppointmentRepository repo) { this.repo = repo; }
    public Appointment create(Appointment a){ return repo.save(a); }
    public List<Appointment> forDoctor(Long id){ return repo.findByDoctorId(id); }
}
