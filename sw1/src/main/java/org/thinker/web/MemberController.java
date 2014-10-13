package org.thinker.web;

import javax.inject.Inject;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thinker.member.service.MemberService;
import org.thinker.member.vo.MemberException;

@Controller
@RequestMapping("/member/*")
public class MemberController {
	
	private static Logger logger = Logger.getLogger(MemberController.class);
	
	@Inject
	private MemberService service;
	
	@RequestMapping("/doA")
	public void doA(@RequestParam("value") String value)throws MemberException{
		
		logger.info("doA" + value);
		
		logger.info(service);
		
		if(value.equals("AAA")){
			throw new MemberException("value is null");
		}
		
	}
	
	@RequestMapping("/listAll")
	public void listAll(Model model)throws MemberException{
		
		logger.info("---------------------");
		logger.info(service.getListAll());
		logger.info("---------------------");
		
		
		model.addAttribute(service.getListAll());
		
	}
	
	
	@ExceptionHandler(MemberException.class)
	public String handleException(MemberException e){
		
		return "member/error";
	}
	
}
