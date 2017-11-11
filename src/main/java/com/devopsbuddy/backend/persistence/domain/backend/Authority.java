/**
 * 
 */
package com.devopsbuddy.backend.persistence.domain.backend;

import org.springframework.security.core.GrantedAuthority;

/**
 * @author scmbld on 12-Nov-2017
 *
 */
public class Authority implements GrantedAuthority {

	private   final String authority;
	
	public Authority(String authority) {
		this.authority=authority;
	}
	
	
	/* (non-Javadoc)
	 * @see org.springframework.security.core.GrantedAuthority#getAuthority()
	 */
	@Override
	public String getAuthority() {
		// TODO Auto-generated method stub
		return authority;
	}

}
