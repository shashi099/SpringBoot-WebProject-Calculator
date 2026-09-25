package com.hypo.SpringWebProject;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @ModelAttribute("course")
    public String course(){
        return "java";
    }

    @RequestMapping("/")
    public String home() {
        System.out.println("in home");
        return "index";
    }

    @RequestMapping("add")
    public ModelAndView add(@RequestParam("num1") int num1, @RequestParam("num2") int num2, ModelAndView mv){
        int result = num1 + num2;
        System.out.println(result);
        mv.addObject("result", result);
        mv.setViewName("result"); // mapping name of the jsp page result.jsp
        return mv;
    }

    @RequestMapping("addAlien")
    public String addAlien(@ModelAttribute() Alien alien){  // @ModelAttribute("") it's optional
        System.out.println("in alien");
        return "result";
    }

}
