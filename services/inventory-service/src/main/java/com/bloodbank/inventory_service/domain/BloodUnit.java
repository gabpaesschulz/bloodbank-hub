package com.bloodbank.inventory_service.domain;

import lombok.*;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity @Table(name = "blood_units")
@Getter @Setter @Builder @NoArgsConstructor @AllArgsConstructor
public class BloodUnit {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String bloodType;
    private LocalDate expiresAt;
    @Enumerated(EnumType.STRING)
    private Status status;

    public enum Status { AVAILABLE, RESERVED, USED, DISCARDED }
}