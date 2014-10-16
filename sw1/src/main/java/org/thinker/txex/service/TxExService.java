package org.thinker.txex.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.thinker.txex.mapper.TxExMapper;

@Service
public class TxExService {

	@Inject
	TxExMapper mapper;
	
	public void addData(String codeValue, String strValue)throws Exception{
		
		mapper.insertMain(codeValue);
		
		mapper.insertSub(strValue);
		
	}
	
	public void updateData(Integer num, String value)throws Exception{
		
		
		mapper.insertMain(value);
		
		mapper.update1(num, value);
		
		
	}
	
	
	
}
