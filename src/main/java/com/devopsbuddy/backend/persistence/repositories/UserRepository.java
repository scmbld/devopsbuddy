/**
 * 
 */
package com.devopsbuddy.backend.persistence.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.devopsbuddy.backend.persistence.domain.backend.User;

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
