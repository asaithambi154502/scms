package com.example.scms.services;

import com.example.scms.models.Doctor;
import com.example.scms.repositories.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    // ✅ 1. Create or update doctor
    public Doctor saveDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    // ✅ 2. Get all doctors
    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }

    // ✅ 3. Get doctor by ID
    public Doctor getDoctorById(Long id) {
        return doctorRepository.findById(id).orElse(null);
    }

    // ✅ 4. Delete doctor by ID
    public void deleteDoctor(Long id) {
        doctorRepository.deleteById(id);
    }

    // ✅ 5. Check doctor availability by date (new)
    public boolean isDoctorAvailable(Long doctorId, LocalDate date) {
        Optional<Doctor> doctorOpt = doctorRepository.findById(doctorId);
        if (doctorOpt.isEmpty()) {
            return false;
        }
        Doctor doctor = doctorOpt.get();
        // Example logic — replace with your real data model
        return doctor.getAvailableDates() != null && doctor.getAvailableDates().contains(date);
    }

    // ✅ 6. Validate doctor login (new)
    public Doctor validateLogin(String email, String password) {
        Doctor doctor = doctorRepository.findByEmail(email);
        if (doctor != null && doctor.getPassword().equals(password)) {
            return doctor; // Login success
        }
        return null; // Invalid login
    }
}
