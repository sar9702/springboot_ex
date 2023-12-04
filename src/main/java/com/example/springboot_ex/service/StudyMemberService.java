package com.example.springboot_ex.service;

import com.example.springboot_ex.comm.Cm_encrypt;
import com.example.springboot_ex.entity.Study_member;
import com.example.springboot_ex.repository.StudyMemberRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudyMemberService {
    @Autowired
    StudyMemberRepo studyMemberRepo;

    @Value("${encrypt.key16}")  // application.yml 파일에서 키값을 가져온다.
    private String strKey16;

    /* 전체 Row Select */
    public List<Study_member> doSelectAll() throws Exception {
        Cm_encrypt cmEncrypt = new Cm_encrypt();

        List<Study_member> list = studyMemberRepo.findAll();

        /* 복호화 */
        for(Study_member member : list) {
            member.setEmail(cmEncrypt.decryptAes(member.getEmail(), strKey16));
        }

        return list;
    }

    /* One Row Select */
    public Study_member doSelectOne(int keyId) {
        return studyMemberRepo.findById(keyId).get();
    }

    /* Insert */
    public void doInsert(Study_member studyMember) throws Exception {
        Cm_encrypt cmEncrypt = new Cm_encrypt();

        studyMember.setPassword(cmEncrypt.encryptSha256(studyMember.getPassword()));
        studyMember.setEmail(cmEncrypt.encryptAes(studyMember.getEmail(), strKey16));
        studyMemberRepo.save(studyMember);
    }

    /* Update */
    public void doUpdate(Study_member studyMember) {
        studyMemberRepo.save(studyMember);
    }

    /* Delete */
    public void doDelete(int keyId) {
        studyMemberRepo.deleteById(keyId);
    }
}
