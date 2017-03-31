package com.example.project.service;

import com.example.project.domain.InquiryEntity;
import com.example.project.domain.InquiryRepository;
import com.example.project.web.InquiryForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InquiryService {
    @Autowired
    private InquiryRepository inquiryRepository;

    /**
     * 入力された値をデータベースに保存します。
     *
     * @param inquiryForm 送信されたフォーム
     */
    public void save(InquiryForm inquiryForm) {
        InquiryEntity inquiryEntity = new InquiryEntity();
        inquiryEntity.setName(inquiryForm.getName());
        inquiryEntity.setEmail(inquiryForm.getEmail());
        inquiryEntity.setContent(inquiryForm.getContent());
        inquiryRepository.saveAndFlush(inquiryEntity);
    }
}
