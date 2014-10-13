package org.thinker.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thinker.member.vo.MemberException;

@Controller
@RequestMapping("/member")
public class MemberController {
	
	

	public void doA(@RequestParam("value") String value)throws MemberException{
		
		if(value == null){
			throw new MemberException("value is null");
		}
		
	}
	
	
	@ExceptionHandler(MemberException.class)
	public String handleException(MemberException e){
		
		return "member/error";
	}
	
}
