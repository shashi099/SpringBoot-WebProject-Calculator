package com.hypo.SpringWebProject;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        System.out.println("in home");
        return "index.jsp";
    }

    @RequestMapping("add")
    public String add(@RequestParam("num1") int num1, @RequestParam("num2") int num2, HttpSession session){
        System.out.println("add Called");
        int result = num1 + num2;
        System.out.println(result);

        session.setAttribute("result", result);

        return "result.jsp";
    }

}
