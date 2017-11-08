/**
 * 
 */
package com.devopsbuddy.configs;

import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 * @author scmbld on 08-Nov-2017
 *
 */
 

 
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
 
@Configuration
@EnableJpaRepositories(basePackages = "com.devopsbuddy.backend.persistence.repositories")
@EntityScan(basePackages = "com.devopsbuddy.backend.persistence.domain.backend")
@EnableTransactionManagement
public class ApplicationConfig {
}