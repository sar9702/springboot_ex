package com.example.springboot_ex.repository;

import com.example.springboot_ex.entity.Study_member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StudyMemberRepoTest {

    @Autowired
    StudyMemberRepo studyMemberRepo;

    @Test
    void findByLoginId() {

        Study_member studyMember = studyMemberRepo.findByLoginId("id3");
        System.out.println(studyMember);
    }
}