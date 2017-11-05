/**
 * 
 */
package com.devopsbuddy.web.i18n;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;

/**
 * @author scmbld on 05-Nov-2017
 *
 */
@Service
public class I18NService {
	
	private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(I18NService.class);
	
	
	
	@Autowired
	private MessageSource messageSource;
	
	// returns a message for the given message id and the default locale in the session contet
	// @param messgaId the key to the message resource file
	
	public String getMessage( String messageId) {
		LOG.info("Returning i18n text for messageId()",messageId);
		Locale locale = LocaleContextHolder.getLocale();
		return getMessage(messageId, locale);
	}
	
	//returns a message for the given message id and locale
	//@param messageId the key to the message resources file
	// @param locale The Locale
	
	public String getMessage(String messageId, Locale locale) {
		return messageSource.getMessage(messageId, null,locale);
	}
	
	
}
