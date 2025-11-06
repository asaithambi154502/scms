
# SCMS – Smart Clinic Management System (Starter)

This folder contains the Java Spring Boot backend and mock screenshots for your submission.
Replace `<username>` below with your GitHub ID after uploading.

## Direct file paths you will need to paste as public links
- Issues (user stories): `https://github.com/<username>/scms/blob/main/docs/issues.md`
- Schema design: `https://github.com/<username>/scms/blob/main/docs/schema-design.md`
- Doctor.java: `https://github.com/<username>/scms/blob/main/backend/src/main/java/com/example/scms/Doctor.java`
- Appointment.java: `https://github.com/<username>/scms/blob/main/backend/src/main/java/com/example/scms/Appointment.java`
- DoctorController.java: `https://github.com/<username>/scms/blob/main/backend/src/main/java/com/example/scms/DoctorController.java`
- AppointmentService.java: `https://github.com/<username>/scms/blob/main/backend/src/main/java/com/example/scms/AppointmentService.java`
- PrescriptionController.java: `https://github.com/<username>/scms/blob/main/backend/src/main/java/com/example/scms/PrescriptionController.java`
- PatientRepository.java: `https://github.com/<username>/scms/blob/main/backend/src/main/java/com/example/scms/PatientRepository.java`
- TokenService.java: `https://github.com/<username>/scms/blob/main/backend/src/main/java/com/example/scms/TokenService.java`
- DoctorService.java: `https://github.com/<username>/scms/blob/main/backend/src/main/java/com/example/scms/DoctorService.java`
- Dockerfile: `https://github.com/<username>/scms/blob/main/backend/Dockerfile`
- GitHub Actions workflow: `https://github.com/<username>/scms/blob/main/backend/.github/workflows/ci.yml`

## Mock screenshots
Found in `/ui`: `admin_login.png`, `doctor_login.png`, `patient_login.png`, `admin_add_doctor.png`, `patient_search_doctor.png`, `doctor_appointments.png`.

## Run locally
```bash
cd backend
./mvnw spring-boot:run   # or 'mvn spring-boot:run' if Maven is installed
# App runs on http://localhost:8080
```

## Docker
```bash
cd backend
docker build -t scms:latest .
docker run -p 8080:8080 scms:latest
```
