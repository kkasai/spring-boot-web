package com.example.project.web;

import org.hibernate.validator.constraints.NotBlank;

public class InquiryForm {
    @NotBlank
    private String name;
    @NotBlank
    private String email;
    @NotBlank
    private String content;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
