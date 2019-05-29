package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.person.Person;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/cfg/Beans.xml");
		Person p1=ctx.getBean("person1",Person.class);
		Person p2=ctx.getBean("person2",Person.class);
		System.out.println(p1);
		System.out.println(p2);
System.out.println("this is master branch moved from develop branch and made changes from git web repo");

	}

}
