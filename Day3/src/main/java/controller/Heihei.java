package controller;

/*
 ** @author LiGuanda
 ** @date  PM 3:50:20
 ** @description This is a description of Heihei
 ** @params
 ** @return
 ** @since version-1.0  */


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Lenovo
 */
@Controller
public class Heihei {


    @RequestMapping("/ahaa")
    public String aha(HttpServletRequest request) {

        request.setAttribute("wife", "JuJingyi");
        return "RequestAttributesShow";

    }


    @RequestMapping("/abcd")
    public ModelAndView abcd() {

        ModelAndView nav = new ModelAndView();
        nav.addObject("wife2", "JuJingyi");
        nav.setViewName("RequestAttributesShow");
        return nav;

    }


    @RequestMapping("/abcdef")
    public String abcdef(Model model) {

        model.addAttribute("wife", "JuJingyi");
        model.addAttribute("wife2", "IU");
        return "RequestAttributesShow";

    }


}
