/**
 * 
 */
package com.devopsbuddy.backend.persistence.repositories;

import org.jboss.logging.Param;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.devopsbuddy.backend.persistence.domain.backend.User;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author scmbld on 11-Nov-2017
 *
 */
 
 
 
@Repository
@Transactional(readOnly = true)
public interface UserRepository extends CrudRepository<User, Long> {

    /**
     * Returns a User given a username or null if not found.
     * @param username The username
     * @return a User given a username or null if not found.
     */
    User findByUsername(String username);

    /**
     * Returns a User for the given email or null if none was found.
     * @param email The user's email
     * @return a User for the given email or null if none was found.
     */
    User findByEmail(String email);

   

}