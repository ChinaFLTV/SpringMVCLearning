package controller;

/*
 ** @author LiGuanda
 ** @date  AM 10:21:23
 ** @description This is a description of Day4Controller
 ** @params
 ** @return
 ** @since version-1.0  */


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author Lenovo
 */
@Controller
public class Day4Controller {


    @RequestMapping("/")
    public String index() {

        return "index";

    }


    @RequestMapping("/heiheihei")
    public String heiheihei(Map<String, Object> map) {

        map.put("wife", "JuJingyi");
        return "ScopeParametersTest";

    }


    @RequestMapping("/hahaha")
    public String hahaha(ModelMap model) {

        model.addAttribute("husband", "Dage");
        return "ScopeParametersTest";

    }


    @RequestMapping("/xixixi")
    public String xixixi(HttpSession session) {

        session.setAttribute("wife2", "IU");
        return "ScopeParametersTest";

    }


    @RequestMapping("/hehehe")
    public String hehehe(HttpSession session) {

        ServletContext application = session.getServletContext();
        application.setAttribute("wife", "JuJingyi");
        application.setAttribute("wife2", "IU");
        return "ScopeParametersTest";

    }


    @RequestMapping("/aha")
    public String aha() {

        return "forward:/hehehe";

    }


    @RequestMapping("/ati")
    public String ati(){

        return "redirect:/aha";

    }


    @RequestMapping("/aihei")
    public String aihei(){

        return "ji";

    }


}
