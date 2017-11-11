/**
 * 
 */
package com.devopsbuddy.configs;

/**
 * @author scmbld on 06-Nov-2017
 *
 */


 

import com.devopsbuddy.backend.service.EmailService;
import com.devopsbuddy.backend.service.MockEmailService;

import org.h2.server.web.WebServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

 
@Configuration
@Profile("dev")
@PropertySource("classpath:application-dev.properties")
public class DevelopmentConfig {

    @Bean
    public EmailService emailService() {
        return new MockEmailService();
    }
    
    



    @Bean

    public ServletRegistrationBean h2ConsoleServletRegistration() {

        ServletRegistrationBean bean = new ServletRegistrationBean(new WebServlet());

        bean.addUrlMappings("/console/*");

        return bean;

    }
    
    
    
}