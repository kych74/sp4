package org.thinker.member.test;

import javax.inject.Inject;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;
import org.thinker.member.mapper.MemberMapper;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class MapperTest {
	
	static Logger logger = Logger.getLogger(MapperTest.class);
	
	@Inject
	MemberMapper mapper;

	@Test
	public void test1(){
		
		
		Assert.notNull(mapper);
		
		logger.info(mapper.testAll());
		
	}
	
}















