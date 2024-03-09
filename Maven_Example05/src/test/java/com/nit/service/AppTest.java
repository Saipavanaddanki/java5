package com.nit.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class AppTest 
{
	private static App app;
	@BeforeAll
    public static void setUp() {
    	app=new App();
    }
	@Test
	public void add() {
		int actual=app.add(20, 30);
		int expected=20+30;
		assertEquals(expected,actual);
	}
	@Test
	public void sub() {
		int actual=app.sub(20, 30);
		int expected=20-30;
		assertEquals(expected,actual);
	}
	@Test
	public void mul() {
		int actual=app.mul(20, 30);
		int expected=20*30;
		assertEquals(expected,actual);
	}
	
	
	@AfterAll
	public static void afterEnd() {
		app=null;
	}
}
