package com.epam.tddjunit.tdddemo;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;

public class RemoveFirstTwoTest 
{
	
	@Test
	void test()
	{
		RemoveFirstTwo rmt=new RemoveFirstTwo();
		String act=rmt.remove("ABCD");
		assertEquals("BCD",act);
	}
	@Test
	void test1()
	{
	RemoveFirstTwo rmt=new RemoveFirstTwo();
		String act=rmt.remove("AACD");
		assertEquals("CD",act);
	}
	@Test
	void test2()
	{
	RemoveFirstTwo rmt=new RemoveFirstTwo();
		String act=rmt.remove("BACD");
		assertEquals("BCD",act);
	}
	@Test
	void test3()
	{
	RemoveFirstTwo rmt=new RemoveFirstTwo();
		String act=rmt.remove("BBAA");
		assertEquals("BBAA",act);
	}
	@Test
	void test4()
	{
	RemoveFirstTwo rmt=new RemoveFirstTwo();
		String act=rmt.remove("AABAA");
		assertEquals("BAA",act);
	}
	}
