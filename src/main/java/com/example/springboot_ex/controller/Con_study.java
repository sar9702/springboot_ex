package com.example.springboot_ex.controller;

import com.example.springboot_ex.entity.Study_record;
import com.example.springboot_ex.service.StudyRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/study")
public class Con_study {

    @Autowired
    StudyRecordService studyRecordService;

    @GetMapping("/list")
    public String doStudyList(Model model) {
        List<Study_record> list = studyRecordService.doSelectAll();
        model.addAttribute("list", list);
        return "/study/study_list";
    }
}