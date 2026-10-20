package com.dipak.job.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    public String HomeController(){
        return "Job Portal User Services";
    }
}