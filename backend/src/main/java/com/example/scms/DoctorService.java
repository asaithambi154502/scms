
package com.example.scms;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DoctorService {
    private final DoctorRepository repo;
    public DoctorService(DoctorRepository repo) { this.repo = repo; }
    public Doctor create(Doctor d){ return repo.save(d); }
    public List<Doctor> search(String q){ return repo.findByNameContainingIgnoreCase(q==null?"":q); }
    public List<Doctor> all(){ return repo.findAll(); }
}
