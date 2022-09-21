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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

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

    @RequestMapping(value = "/a?a/aha", method = {RequestMethod.GET}, params = "username", headers = {"host=localhost:8080"})
    public String eee() {

        return "success";

    }


    @RequestMapping(value = "/he*tui", method = {RequestMethod.GET}, params = {"username=Dage"}, headers = {"host=localhost:8080"})
    public String hetui() {

        return "success";

    }


    @RequestMapping(value = "/**/ati", method = {RequestMethod.GET}, params = {"username=Dage"}, headers = {"host=localhost:8080"})
    public String ati() {

        return "success";

    }

    @RequestMapping(value = "/hehehe*/hehe/{username}/{password}", method = {RequestMethod.GET}, params = {"!username"}, headers = {"host=localhost:8080"})
    public String placeholderTest(@PathVariable("username") String username, @PathVariable("password") String password) {

        System.out.println("username = " + username + " password = " + password);
        return "success";

    }


    @RequestMapping(value = "/abc")
    public String abc() {

        return "testParams";

    }


    @RequestMapping(value = "/aihei")
    public String aihei(HttpServletRequest request) {

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username = " + username + " password = " + password);
        return "success";

    }

    @RequestMapping(value = "/abcdef")
    public String abcdef(String username, String password) {

        System.out.println("username = " + username + " password = " + password);
        return "success";

    }


    @RequestMapping(value = "/abcdefgh", method = {RequestMethod.POST})
    public String abcdefgh(String username, String password, String hobby) {

        System.out.println("username = " + username + " password = " + password + " hobby = " + hobby);
        return "success";

    }


}
