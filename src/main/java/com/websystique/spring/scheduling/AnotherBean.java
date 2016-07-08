package com.websystique.spring.scheduling;

import org.springframework.stereotype.Component;

@Component("anotherBean")
public class AnotherBean {
	
	public void printAnotherMessage(){
		Long date = new java.util.Date().getTime();
		
		System.out.println("Date in long "+date+"  , Trigger time : "+new java.util.Date());
			
			System.out.println("I am****** called by Quartz jobBean using CronTriggerFactoryBean");
		
	}
	
}
