package controller;

/*
 ** @author LiGuanda
 ** @date  PM 7:37:47
 ** @description This is a description of HelloController
 ** @params
 ** @return
 ** @since version-1.0  */


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Lenovo
 */
@Controller
public class HelloController {


    @RequestMapping(value = "/")
    public String index() {

        // 返回视图名称
        return "index";

    }

    @RequestMapping("/target")
    public String toTarget(){

        return "target";

    }


}
