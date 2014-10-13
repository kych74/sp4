package org.thinker.member.test;

import javax.inject.Inject;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;
import org.thinker.member.service.MemberService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})

public class ServiceTest {

	static Logger logger = Logger.getLogger(ServiceTest.class);
	
	@Inject
	MemberService service;
	
	@Test
	public void testExist(){
		
		Assert.notNull(service);
		
	}
	

	@Test
	public void testAOP(){
		
		logger.info("-----------------------");
		
		logger.info(service.getListAll());
		
		logger.info("-----------------------");
		
	}	
}



