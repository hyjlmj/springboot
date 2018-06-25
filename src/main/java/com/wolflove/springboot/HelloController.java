package com.wolflove.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public  String  sayhello(Model m){
        m.addAttribute("test","test");
        return "hello";
    }
}
