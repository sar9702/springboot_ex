package com.example.springboot_ex.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDateTime;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Study_record {
    @Id
    private int key_id;
    private String study_day;
    private String contents;
    private LocalDateTime reg_day;
}
