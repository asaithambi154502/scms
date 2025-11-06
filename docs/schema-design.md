
# Schema Design (MySQL compatible)

Tables: users, patients, doctors, appointments, prescriptions.

```sql
CREATE TABLE doctors (
  id BIGINT PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(120) NOT NULL,
  specialization VARCHAR(120),
  email VARCHAR(160) UNIQUE
);

CREATE TABLE patients (
  id BIGINT PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(120) NOT NULL,
  phone VARCHAR(40)
);

CREATE TABLE appointments (
  id BIGINT PRIMARY KEY AUTO_INCREMENT,
  patient_id BIGINT NOT NULL,
  doctor_id BIGINT NOT NULL,
  start_time DATETIME NOT NULL,
  reason VARCHAR(255),
  status VARCHAR(20) DEFAULT 'scheduled',
  FOREIGN KEY (patient_id) REFERENCES patients(id),
  FOREIGN KEY (doctor_id) REFERENCES doctors(id),
  INDEX(doctor_id),
  INDEX(start_time)
);
```
