package com.xll.xjc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/staff")
public class StaffController {

    @RequestMapping("/list")
    public String show() {
        return "staff/stafflist";
    }

}
