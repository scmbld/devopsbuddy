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
}