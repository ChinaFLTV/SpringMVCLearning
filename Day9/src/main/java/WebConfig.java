/*
 ** @author LiGuanda
 ** @date  AM 11:08:10
 ** @description This is a description of WebConfig
 ** @params
 ** @return
 ** @since version-1.0  */


import interceptors.Day9Interceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

import java.util.List;
import java.util.Properties;

/**
 * @author Lenovo
 */
@Configuration
@ComponentScan(basePackages = {"controller", "dao", "interceptors"})
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {


    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {

        configurer.enable();

    }


    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        Day9Interceptor interceptor = new Day9Interceptor();
        registry.addInterceptor(interceptor).addPathPatterns("/");

    }


    @Override
    public void addViewControllers(ViewControllerRegistry registry) {

        registry.addViewController("/").setViewName("index");

    }


    @Bean
    public MultipartResolver MultipartResolver() {

        return new CommonsMultipartResolver();

    }


    @Override
    public void configureHandlerExceptionResolvers(List<HandlerExceptionResolver> resolvers) {

        SimpleMappingExceptionResolver resolver = new SimpleMappingExceptionResolver();
        Properties properties = new Properties();
        properties.setProperty("java.lang.ArithmeticException", "error");
        resolvers.add(resolver);
        resolver.setExceptionAttribute("exception");

    }


}
