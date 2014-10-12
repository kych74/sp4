package org.thinker.member.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.thinker.member.mapper.MemberMapper;
import org.thinker.member.vo.MemberVO;

@Service
public class MemberService {

	@Inject
	MemberMapper mapper;
	
	
	public List<MemberVO> getListAll(){
		 
		return mapper.testAll();
		
	}
}
