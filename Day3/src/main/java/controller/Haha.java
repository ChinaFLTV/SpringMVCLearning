package controller;

/*
 ** @author LiGuanda
 ** @date  AM 9:53:47
 ** @description This is a description of Haha
 ** @params
 ** @return
 ** @since version-1.0  */


import bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author Lenovo
 */
@Controller
public class Haha {


    @RequestMapping(value = "/")
    public String haha() {

        System.out.println("Pass by haha controller~");
        return "welcome";

    }


    @RequestMapping("/heiheihei")
    public String heiheihei(@RequestParam(value = "username", required = false, defaultValue = "JuJingyi") String username, @RequestParam(value = "password", required = true) int password) {

        System.out.println("username = " + username + " password = " + password);
        return "success";

    }


    @RequestMapping("/hahaha")
    public String hahaha(@RequestHeader(value = "host", required = false, defaultValue = "JuJingyi") String host) {

        System.out.println("host = " + host);
        return "success";

    }


    @RequestMapping("/xixixi")
    public String xixixi(HttpServletRequest request) {

        HttpSession session = request.getSession();
        return "success";

    }


    @RequestMapping("/aha")
    public String aha(@CookieValue(value = "JSESSIONID", required = true, defaultValue = "暂时没有报文QAQ") String JSESSIONID) {

        System.out.println("JSESSIONID = " + JSESSIONID);
        return "success";

    }


    @RequestMapping("/hetui")
    public String hetui(User user) {

        System.out.println(user);
        return "success";

    }


}
