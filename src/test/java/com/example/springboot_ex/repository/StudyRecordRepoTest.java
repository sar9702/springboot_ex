package com.example.springboot_ex.repository;

import com.example.springboot_ex.entity.Study_record;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudyRecordRepoTest {
    @Autowired
    StudyRecordRepo repo;

    @Test
    public void  testSelectAll() {
        List<Study_record> list = repo.findAll();

        for (Study_record record : list) {
            System.out.println(record.getKey_id());
            System.out.println(record.getStudy_day());
            System.out.println(record.getContents());
            System.out.println(record.getReg_day());
        }
    }
}