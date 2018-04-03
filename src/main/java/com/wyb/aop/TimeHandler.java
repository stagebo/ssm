package com.wyb.aop;

import org.apache.ibatis.binding.MapperMethod.MethodSignature;
import org.aspectj.apache.bcel.classfile.Method;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Aspect  
@Component  
public class TimeHandler {  
    private final Logger logger = LoggerFactory.getLogger(TimeHandler.class);  
    public TimeHandler(){
    	System.out.println("aop in constructor=============================================!");
    }
    @Pointcut("execution(* com.wyb.web.*.*(..))")    
    public void pointcutName(){}

    @Before("pointcutName()")
    public void befoer(){
        System.out.println("before web===========================");
    }
    
    @After("pointcutName()")
    public void after(){
        System.out.println("after web===========================");
    }
    
    
  
}  