package com.example.springboot_ex.repository;

import com.example.springboot_ex.entity.Study_record;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudyRecordRepo extends JpaRepository<Study_record, Integer>{
}
