package controller;

/*
 ** @author LiGuanda
 ** @date  AM 11:04:40
 ** @description This is a description of Haha
 ** @params
 ** @return
 ** @since version-1.0  */


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Lenovo
 */
@Controller
public class Haha {


    @RequestMapping("/")
    public String haha() {

        return "index";

    }

    @RequestMapping(value = "/user", method = {RequestMethod.GET})
    public String getAllUsers() {

        System.out.println("Get all users' information!");
        return "success";

    }


    @RequestMapping(value = "/user/{id}", method = {RequestMethod.GET})
    public String getUserById(@PathVariable("id") String id) {

        System.out.println("select user whose id is " + id);
        return "success";

    }


    @RequestMapping(value = "/user", method = {RequestMethod.POST})
    public String createOneUser(@RequestParam("username") String username, @RequestParam("password") String password) {

        System.out.println("Create a new user whose username is " + username + " and password is " + password);
        return "success";

    }


}
