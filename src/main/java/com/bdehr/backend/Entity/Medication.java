package com.bdehr.backend.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@Entity
@Table(name="medication_table")
public class Medication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="user_id")
    private int user_id;

    @Column(name="hospital_id")
    private int hospital_id;

    @Column(name="doctor_id")
    private int doctor_id;

    @Column(name="created_at",columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date created_at;

    @Column(name="prescription")
    private String prescription;

    public Medication(int user_id, int hospital_id, int doctor_id, String prescription) {
        this.user_id = user_id;
        this.hospital_id = hospital_id;
        this.doctor_id = doctor_id;
        this.prescription = prescription;
    }

}