package com.ll.tagging.domain.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @Value("${custom.jwt.secretKey}")
    private String jwtSecretKey;

    @GetMapping("/")
    @ResponseBody
    public String home() {
        return "홈2";
    }

    @GetMapping("/jwtSecretKey")
    @ResponseBody
    public String showJwtSecretKey() {
        return jwtSecretKey;
    }
}
