/**
 * 
 */
package com.devopsbuddy.backend.persistence.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.devopsbuddy.backend.persistence.domain.backend.Plan;

/**
 * @author scmbld on 11-Nov-2017
 *
 */
@Repository
public interface PlanRepository extends CrudRepository<Plan, Integer> {

}
