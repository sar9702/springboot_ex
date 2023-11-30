package com.example.springboot_ex.service;

import com.example.springboot_ex.entity.Study_record;
import com.example.springboot_ex.repository.StudyRecordRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class StudyRecordService {
    @Autowired
    StudyRecordRepo studyRecordRepo;

    /* 전체 Row Select */
    public List<Study_record> doSelectAll() {
        return studyRecordRepo.findAll();
    }

    /* One Row Select */
    public Study_record doSelectOne(int keyId) {
        return studyRecordRepo.findById(keyId).get();
    }

    /* Insert */
    public void doInsert(Study_record studyRecord) {
        studyRecord.setReg_day(LocalDateTime.now());
        studyRecordRepo.save(studyRecord);
    }

    /* Update */
    public void doUpdate(Study_record studyRecord) {
        studyRecord.setReg_day(LocalDateTime.now());
        studyRecordRepo.save(studyRecord);
    }

    /* Delete */
    public void doDelete(int keyId) {
        studyRecordRepo.deleteById(keyId);
    }
}
