/**
 * 
 */
package com.devopsbuddy.test.integration;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.devopsbuddy.DevopsbuddyApplication;
import com.devopsbuddy.backend.persistence.domain.backend.Plan;
import com.devopsbuddy.backend.persistence.domain.backend.Role;
import com.devopsbuddy.backend.persistence.repositories.PlanRepository;
import com.devopsbuddy.backend.persistence.repositories.RoleRepository;
import com.devopsbuddy.backend.persistence.repositories.UserRepository;
/**
 * @author scmbld on 11-Nov-2017
 *
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes=DevopsbuddyApplication.class)
public class RepositoriesIntegrationTest {


	private static final Integer BASIC_PLAN_ID = 1;

	private static final Integer BASIC_ROLE_ID = 1;

	@Autowired
	private PlanRepository planRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
	private UserRepository userRepository;

	@Before
	public void init() {
		Assert.assertNotNull(planRepository);
		Assert.assertNotNull(roleRepository);
		Assert.assertNotNull(userRepository);
		
		
	}
	
	


    @Test

    public void testCreateNewPlan() throws Exception {

        Plan basicPlan = createBasicPlan();

        planRepository.save(basicPlan);

        Plan retrievedPlan = planRepository.findOne(BASIC_PLAN_ID);

        Assert.assertNotNull(retrievedPlan);

    }



    /**
	 * @return
	 */
	private Plan createBasicPlan() {

		Plan plan = new Plan();
		plan.setId(BASIC_PLAN_ID);
		plan.setName("Basic");
		
		return plan;
	}





    @Test

    public void testCreateNewRole() throws Exception {

        Role basicRole = createBasicRole();

        roleRepository.save(basicRole);

        Role retrievedRole = roleRepository.findOne(BASIC_ROLE_ID);

        Assert.assertNotNull(retrievedRole);

    }



    /**
	 * @return
	 */
	private Role createBasicRole() {

		Role role = new Role();
		role.setId(BASIC_ROLE_ID);
		role.setName("ROLE_USER");
		
		return role;
	}


	

    }





 
	
	

