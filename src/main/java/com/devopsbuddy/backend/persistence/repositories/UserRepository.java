/**
 * 
 */
package com.devopsbuddy.backend.persistence.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.devopsbuddy.backend.persistence.domain.backend.User;

/**
 * @author scmbld on 11-Nov-2017
 *
 */
@Repository
public interface UserRepository  extends CrudRepository<User, Long>{
	
	

}
