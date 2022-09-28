package controller;

/*
 ** @author LiGuanda
 ** @date  AM 9:04:49
 ** @description This is a description of Day8Controller
 ** @params
 ** @return
 ** @since version-1.0  */


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Day8Controller {


    @RequestMapping("/**/heihei")
    public String heihei() {

        return "success";

    }


    @GetMapping("/hehehe")
    public String hehehe() {

        int num = 666 / 0;
        return "hehe";

    }


}
