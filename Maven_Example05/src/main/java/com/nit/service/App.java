package com.nit.service;

public class App 
{
    public static void main( String[] args )
    {
    	int a=30;
    	int b=20;
    	System.out.println(add(a,b)+" "+sub(a,b)+" "+mul(a,b));
    	
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
