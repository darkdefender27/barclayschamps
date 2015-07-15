package com.cg.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx = new GenericXmlApplicationContext("beanconfig.xml");
    	
        System.out.println(ctx.getBean("a1") );
        System.out.println(ctx.getBean("a2") );
       
    }
}
