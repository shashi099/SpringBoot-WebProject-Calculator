package com.hypo.SpringWebProject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    public String home() {
        System.out.println("in home");
        return "index.jsp";
    }
}
