package com.example.project.web;

import com.example.project.service.InquiryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class FormController {
    @Autowired
    private InquiryService inquiryService;

    @RequestMapping("/form")
    public String form(InquiryForm inquiryForm, Model model){
        return "form";
    }

    @RequestMapping(value = "/confirm", method = RequestMethod.POST)
    public String confirm(@Validated InquiryForm inquiryForm, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model){
        if (bindingResult.hasErrors()) {
            //バリデーションエラー時の処理
            redirectAttributes.addFlashAttribute(inquiryForm);
            return "redirect:form";
        }
        model.addAttribute(inquiryForm);
        return "confirm";
    }

    @RequestMapping(value = "/save", params = "save", method = RequestMethod.POST)
    public String save(@Validated InquiryForm inquiryForm, BindingResult bindingResult, Model model){
        inquiryService.save(inquiryForm);
        return "complete";
    }

    @RequestMapping(value = "/save", params = "back", method = RequestMethod.POST)
    public String back(InquiryForm inquiryForm, RedirectAttributes redirectAttributes){
        redirectAttributes.addFlashAttribute(inquiryForm);
        return "redirect:form";
    }
}
