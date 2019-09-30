package com.test.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping("/test")
    public String goIndex()
    {
        return "index";
    }
}
