package com.hypo.SpringWebProject;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        System.out.println("in home");
        return "index.jsp";
    }

    @RequestMapping("add")
    public String add(HttpServletRequest req){
        System.out.println("add Called");
        int num1 = Integer.parseInt(req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));
        int result = num1 + num2;
        System.out.println(result);
        return "result.jsp";
    }

}
