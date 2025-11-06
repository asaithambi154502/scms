import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// Simple Doctor class
class Doctor {
    private Long id;
    private String name;
    private String email;
    private String password;
    private List<LocalDate> availableDates;

    public Doctor(Long id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.availableDates = new ArrayList<>();
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getPassword() { return password; }
    public List<LocalDate> getAvailableDates() { return availableDates; }
}

// Simple DoctorService (no Spring Boot)
public class DoctorService {

    private List<Doctor> doctors = new ArrayList<>();

    // Add a doctor
    public Doctor saveDoctor(Doctor doctor) {
        doctors.add(doctor);
        return doctor;
    }

    // Get all doctors
    public List<Doctor> getAllDoctors() {
        return doctors;
    }

    // Get doctor by ID
    public Doctor getDoctorById(Long id) {
        for (Doctor d : doctors) {
            if (d.getId().equals(id)) return d;
        }
        return null;
    }

    // Delete doctor by ID
    public void deleteDoctor(Long id) {
        doctors.removeIf(d -> d.getId().equals(id));
    }

    // Check doctor availability by date
    public boolean isDoctorAvailable(Long doctorId, LocalDate date) {
        Optional<Doctor> doctorOpt = doctors.stream()
                .filter(d -> d.getId().equals(doctorId))
                .findFirst();
        if (doctorOpt.isEmpty()) return false;
        Doctor doctor = doctorOpt.get();
        return doctor.getAvailableDates().contains(date);
    }

    // Validate login
    public Doctor validateLogin(String email, String password) {
        for (Doctor d : doctors) {
            if (d.getEmail().equals(email) && d.getPassword().equals(password)) {
                return d;
            }
        }
        return null;
    }

    // Main method to test the program
    public static void main(String[] args) {
        a service = new a();

        // Add doctors
        service.saveDoctor(new Doctor(1L, "Dr. Rajesh", "rajesh@clinic.com", "1234"));
        service.saveDoctor(new Doctor(2L, "Dr. Priya", "priya@clinic.com", "abcd"));

        // Display all doctors
        System.out.println("All Doctors:");
        for (Doctor d : service.getAllDoctors()) {
            System.out.println("- " + d.getName() + " (" + d.getEmail() + ")");
        }

        // Find by ID
        Doctor doc = service.getDoctorById(1L);
        System.out.println("\nDoctor with ID 1: " + (doc != null ? doc.getName() : "Not Found"));

        // Validate login
        Doctor login = service.validateLogin("priya@clinic.com", "abcd");
        System.out.println("\nLogin Result: " + (login != null ? "Success" : "Invalid Credentials"));

        // Delete one doctor
        service.deleteDoctor(1L);
        System.out.println("\nAfter deletion:");
        for (Doctor d : service.getAllDoctors()) {
            System.out.println("- " + d.getName());
        }
    }
}
