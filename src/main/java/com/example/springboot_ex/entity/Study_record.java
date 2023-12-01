package com.example.springboot_ex.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;

import java.time.LocalDateTime;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Study_record {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int key_id;
    private String study_day;
    private String contents;

    // DB의 시간에 의존하게 됨
    @org.hibernate.annotations.Generated(GenerationTime.ALWAYS)
    @Column(name = "reg_day", updatable = false)
    private LocalDateTime reg_day;

    // DB의 시간에 의존하게 됨
    @org.hibernate.annotations.Generated(GenerationTime.ALWAYS)
    @Column(name = "mod_day")
    private LocalDateTime mod_day;
}
