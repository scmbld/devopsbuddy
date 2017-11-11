/**
 * 
 */
package com.devopsbuddy.backend.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.devopsbuddy.backend.persistence.domain.backend.User;
import com.devopsbuddy.backend.persistence.repositories.UserRepository;

/**
 * @author scmbld on 12-Nov-2017
 *
 */
@Service
public class UserSecurityService implements UserDetailsService {
	



    /** The application logger */

    private static final Logger LOG = LoggerFactory.getLogger(UserSecurityService.class);



    @Autowired
    private UserRepository userRepository;
	

	/* (non-Javadoc)
	 * @see org.springframework.security.core.userdetails.UserDetailsService#loadUserByUsername(java.lang.String)
	 */
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
		 User user = userRepository.findByUsername(username);

	        if (null == user) {

	            LOG.warn("Username {} not found", username);

	            throw new UsernameNotFoundException("Username " + username + " not found");

	        }

	        return user;
	}

}
