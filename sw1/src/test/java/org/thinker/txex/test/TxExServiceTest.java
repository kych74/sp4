package org.thinker.txex.test;

import static org.junit.Assert.fail;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.thinker.txex.service.TxExService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})

public class TxExServiceTest {

	@Inject
	TxExService service;
	
	@Test
	public void testInsert() throws Exception{
		
		String codeValue = "ccc";
		String strValue = "cccc"; 
		
		service.addData(codeValue, strValue);
		
	}
	
	@Test
	public void testUpdate() throws Exception{
		
		Integer num = 2;
		String strValue = "zzz"; 
		
		service.updateData(num, strValue);
	}	

}
