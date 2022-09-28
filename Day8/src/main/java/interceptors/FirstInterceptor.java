package interceptors;

/*
 ** @author LiGuanda
 ** @date  AM 9:09:50
 ** @description This is a description of FirstInterceptor
 ** @params
 ** @return
 ** @since version-1.0  */


import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Lenovo
 */
@Component
public class FirstInterceptor implements HandlerInterceptor {


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {

        System.out.println("Before operating the controller method--->");
        return true;

    }


    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) {

        System.out.println("After operating the controller method<---");

    }


    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {

        System.out.println("After rendering the view--->");

    }


}
