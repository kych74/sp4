package org.thinker.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class SampleAOP {
	
	static Logger logger = Logger.getLogger(SampleAOP.class);
	
	@Pointcut("execution(public * org.thinker.member.service.*.*(..))")
	public void aop1(){	}
	
	@Around("aop1()")
	public Object allLog(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("*");
		System.out.println("**");
	  
		try{
			Object ret = joinPoint.proceed();
			return ret;
		}finally{
			System.out.println("***");
			System.out.println("****");
		}
	}
}
