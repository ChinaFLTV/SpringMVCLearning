
/*
 ** @author LiGuanda
 ** @date  AM 11:03:41
 ** @description This is a description of WebInit
 ** @params
 ** @return
 ** @since version-1.0  */


import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

/**
 * @author Lenovo
 */
public class WebInit extends AbstractAnnotationConfigDispatcherServletInitializer {


    @Override
    protected Class<?>[] getRootConfigClasses() {

        return new Class[]{SpringConfig.class};

    }


    @Override
    protected Class<?>[] getServletConfigClasses() {

        return new Class[]{WebConfig.class};

    }


    @Override
    protected String[] getServletMappings() {

        return new String[]{"/"};

    }


    @Override
    protected Filter[] getServletFilters() {

        CharacterEncodingFilter filter = new CharacterEncodingFilter();
        filter.setEncoding("UTF-8");
        filter.setForceRequestEncoding(true);
        return new Filter[]{filter};

    }


}
