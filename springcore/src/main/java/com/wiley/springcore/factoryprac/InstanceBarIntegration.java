package com.wiley.springcore.factoryprac;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

public class InstanceBarIntegration {
	@RunWith(SpringJUnit4ClassRunner.class)
	@ContextConfiguration("com/wiley/springcore/factoryprac/configCi.xml")
	public class InstanceBarFactoryIntegrationTest {

	    @Autowired
	    private Bar instance;
	    
	    @Test
	    public void givenValidInstanceFactoryConfig_whenCreateInstance_thenNameIsCorrect() {
	        assertNotNull(instance);
	        assertEquals("someName", instance.getName());
	    }
	}
}
