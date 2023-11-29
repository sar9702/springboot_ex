package com.example.springboot_ex.service;

import com.example.springboot_ex.entity.Study_record;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class StudyRecordServiceTest {

    @Autowired
    StudyRecordService studyRecordService;

    @Test
    void doInsert() {
        Study_record study_record = Study_record.builder()
                .study_day("2023-11-29")
                .contents("Test Insert 진행")
                .reg_day(LocalDateTime.now())
                .build();

        studyRecordService.doInsert(study_record);
    }

    @Test
    void doUpdate() {
        Study_record study_record = studyRecordService.doSelectOne(3);
        study_record.setContents("Test Update 진행");

        studyRecordService.doUpdate(study_record);
    }

    @Test
    void doDelete() {
        studyRecordService.doDelete(3);
    }
}