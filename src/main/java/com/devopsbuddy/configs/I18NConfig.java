/**
 * 
 */
package com.devopsbuddy.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

/**
 * @author scmbld on 05-Nov-2017
 *
 */
@Configuration
public class I18NConfig {

@Bean
public ReloadableResourceBundleMessageSource messageSource()
{
	ReloadableResourceBundleMessageSource resourceBundleMessageSource = new ReloadableResourceBundleMessageSource();
	resourceBundleMessageSource.setBasename("classpath:i18n/messages");
	resourceBundleMessageSource.setCacheSeconds(1800);
	
	return resourceBundleMessageSource;
	
}

}
