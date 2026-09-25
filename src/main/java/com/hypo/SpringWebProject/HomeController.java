package com.hypo.SpringWebProject;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String start() {
        System.out.println("in home");
        return "index";
    }

    @RequestMapping("add")
    public String add(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model){
        int result = num1 + num2;
        System.out.println(result);

        model.addAttribute("result", result);

        return "result";
    }

}
