package com.example.springboot_ex.service;

import com.example.springboot_ex.entity.Study_member;
import com.example.springboot_ex.entity.Study_record;
import com.example.springboot_ex.repository.StudyMemberRepo;
import com.example.springboot_ex.repository.StudyRecordRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudyMemberService {
    @Autowired
    StudyMemberRepo studyMemberRepo;

    /* 전체 Row Select */
    public List<Study_member> doSelectAll() {
        return studyMemberRepo.findAll();
    }

    /* One Row Select */
    public Study_member doSelectOne(int keyId) {
        return studyMemberRepo.findById(keyId).get();
    }

    /* Insert */
    public void doInsert(Study_member studyRecord) {
        studyMemberRepo.save(studyRecord);
    }

    /* Update */
    public void doUpdate(Study_member studyRecord) {
        studyMemberRepo.save(studyRecord);
    }

    /* Delete */
    public void doDelete(int keyId) {
        studyMemberRepo.deleteById(keyId);
    }
}
