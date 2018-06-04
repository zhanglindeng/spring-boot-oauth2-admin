package com.dzlin.oauth2.admin.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping(value = "/")
    public String index() {

        this.logger.info("[home]");

        return "home";
    }

}
