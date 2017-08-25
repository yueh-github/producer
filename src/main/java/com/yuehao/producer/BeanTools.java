package com.yuehao.producer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;

/**
 * Created by yuehao on 2017/8/24.
 */
@Configuration
public class BeanTools implements ApplicationContextAware {
    private static ApplicationContext applicationContext;


    public void setApplicationContext(ApplicationContext context) {
        applicationContext = context;
    }

    public static Object getBean(Class classname) {
        try {
            Object _restTemplate = applicationContext.getBean(classname);
            return _restTemplate;
        } catch (Exception e) {
            return "";
        }
    }

    public static void setApplicationContext1(ApplicationContext context) {
        applicationContext = context;
    }
}
