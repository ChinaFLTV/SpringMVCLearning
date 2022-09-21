package controller;

/*
 ** @author LiGuanda
 ** @date  AM 9:58:48
 ** @description This is a description of HahaController
 ** @params
 ** @return
 ** @since version-1.0  */


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Lenovo
 */
@Controller
public class HahaController {


    @RequestMapping("/")
    public String haha() {

        return "index";

    }


    @RequestMapping(value = {"/success", "/success1"}, method = {RequestMethod.GET, RequestMethod.POST})
    public String success() {

        return "success";

    }


    @GetMapping("/hehehe")
    public String hehehe() {

        return "success";

    }


    @RequestMapping(value = "/hahaha", params = {"username", "password=123456"})
    public String hahaha() {

        return "success";

    }


    @RequestMapping(value = "/xixixi", method = {RequestMethod.GET}, params = {"username", "password=123456"}, headers = {"host=localhost:8080"})
    public String xixixi() {

        return "success";

    }


}
