package com.picsartacademy.leetcodeclone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RootController {

    @GetMapping("/")
    public String rootPage() {
        return "index";
    }
}
