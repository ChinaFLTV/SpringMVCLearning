package controller;

/*
 ** @author LiGuanda
 ** @date  AM 10:44:59
 ** @description This is a description of ExceptionHandlerPro
 ** @params
 ** @return
 ** @since version-1.0  */


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author Lenovo
 */
@ControllerAdvice
public class ExceptionHandlerPro {


    @ExceptionHandler(value = {ArithmeticException.class})
    public String heiheihei(Exception ex, Model model) {

        model.addAttribute("error", ex);
        return "hehe";

    }


}
