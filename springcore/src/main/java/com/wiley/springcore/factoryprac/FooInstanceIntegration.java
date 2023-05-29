package com.wiley.springcore.factoryprac;

import static org.junit.Assert.assertNotNull;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.ContextConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

public class FooInstanceIntegration {
	@RunWith(SpringJUnit4ClassRunner.class)
	@ContextConfiguration("com/wiley/springcore/factoryprac/configCi.xml")
	public class InstanceFooFactoryIntegrationTest {

	    @Autowired
	    private Foo foo;
	    
	    @Test
	    public void givenValidInstanceFactoryConfig_whenCreateFooInstance_thenInstanceIsNotNull() {
	        assertNotNull(foo);
	    }
	}
}
