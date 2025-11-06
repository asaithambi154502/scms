
package com.example.scms;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity @Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Appointment {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne private Patient patient;
    @ManyToOne private Doctor doctor;

    private LocalDateTime startTime;
    private String reason;
    private String status; // scheduled, done, cancelled
}
