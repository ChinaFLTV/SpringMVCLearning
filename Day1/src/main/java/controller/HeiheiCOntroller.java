package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HeiheiCOntroller {


    @RequestMapping("/")
    public String heihei(){

        System.out.println("Pass by heihei controller");
        return "index";

    }


}
