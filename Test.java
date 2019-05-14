package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rocket.Rocket;

public class Test {
public static void main(String[] args) {
	ApplicationContext ctx= new ClassPathXmlApplicationContext("com/cfg/Beans.xml");
	Rocket r=ctx.getBean("rocket",Rocket.class);
	System.out.println(r);
System.out.println("aarvi");

	
}
}
