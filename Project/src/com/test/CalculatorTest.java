package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest { //***테스트 실행 순서보기
	@Test
	public void testSum() {
		Calculator cal=new Calculator();
		assertEquals(30, cal.sum(10,20));
		System.out.println("test1");
	}
	@Test
	public void testSum1() {
		Calculator cal=new Calculator();
		assertEquals(60, cal.sum(50, 10));
		System.out.println("test2");
	
	}
	
	@Test
	public void testSub() {
		Calculator cal=new Calculator();
		assertEquals(40, cal.sub(50, 10));
		System.out.println("test3");
	
	}
	
	@BeforeClass
	public static void beforeTest() {
		System.out.println("BeforeClass");
	}
	
	@AfterClass
	public static void afterTest() {
		System.out.println("AfterClass");
	}
	
	@Before
	public void setUp() {
		System.out.println("Before");
	}
	
	@After
	public void setAfter() {
		System.out.println("After");
	}
	
	

}
