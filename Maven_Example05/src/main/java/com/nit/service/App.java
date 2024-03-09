package com.nit.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App 
{	private static Logger logger=LoggerFactory.getLogger(App.class);
    public static void main( String[] args )
    { logger.debug("main is started");
    	int a=30;
    	int b=20;
    	logger.debug("a , b is initialized");
    	logger.info("add");
    	logger.info("sub");
    	logger.info("mul");
    	System.out.println(add(a,b)+" "+sub(a,b)+" "+mul(a,b));
    	
    	logger.info("main is ended");
    	
    }
    public static int add(int i,int j) {
    	return i+j;
    }
    public static int sub(int i,int j) {
    	return i-j;
    }
    public static int mul(int i,int j) {
    	return i*j;
    }
}
