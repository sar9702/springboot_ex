package com.example.springboot_ex.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "STUDY_MEMBER")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Study_member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private int memberId;

    @Column(name = "login_id")
    private String loginId;

    private String password;

    private String name;

    private String email;

    private String role ;

    // DB의 시간에 의존하게 됨
    @Generated(GenerationTime.ALWAYS)
    @Column(name = "reg_day", updatable = false)
    private LocalDateTime regDay;
}
