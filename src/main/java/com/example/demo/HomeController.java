package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class HomeController {

   @GetMapping("/resumeform")
    public String loadFormPage(Model model) {
        model.addAttribute("resume", new Resume());
        return "resumeform";}


      @PostMapping("/resumeform")
         public String loadFromPage(@Valid @ModelAttribute("resume") Resume resume, BindingResult result){
         if(result.hasErrors()){
        return "resumeform";
        }
         return "resumec";
    }
}