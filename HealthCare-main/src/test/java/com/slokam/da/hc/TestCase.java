package com.slokam.da.hc;

import  org.junit.Assert;

import org.junit.Test;

import com.slokam.da.hc.service.ICalculator;
import com.slokam.da.hc.service.impl.CalculatorImpl;

public class TestCase {

	@Test
	public void addTest() {
		ICalculator icalc = new CalculatorImpl();
		
		int result=0;
		try {
			result = icalc.calc(10, 10, "ADD");
			Assert.assertEquals(20, result);
		} catch (Exception e) {
			Assert.assertFalse(true);
		}
		
	}
	
	@Test
	public void subTest() {
		ICalculator icalc = new CalculatorImpl();
		int result=0;
		try {
			result = icalc.calc(10, 10, "SUB");
			Assert.assertEquals(0, result);
		} catch (Exception e) {
			Assert.assertFalse(true);
		}
		
	}
	
	@Test
	public void mulTest() {
		ICalculator icalc = new CalculatorImpl();
		int result=0;
		try {
			result = icalc.calc(10, 10, "MUL");
			Assert.assertEquals(100, result);
		} catch (Exception e) {
			Assert.assertFalse(true);
		}
		
	}
	@Test
	public void divTest() {
		ICalculator icalc = new CalculatorImpl();
		int result=0;
		try {
			result = icalc.calc(10, 10, "DIV");
			Assert.assertEquals(1, result);
		} catch (Exception e) {
			Assert.assertFalse(true);
		}
		
	}
	
	@Test
	public void moduTest() {
		ICalculator icalc = new CalculatorImpl();
		int result=0;
		try {
			result = icalc.calc(10, 10, "MODU");
			Assert.assertEquals(0, result);
		} catch (Exception e) {
			Assert.assertFalse(true);
		}
		
	}
	
	@Test
	public void negTest() {
		ICalculator icalc = new CalculatorImpl();
		int result=0;
		try {
			result = icalc.calc(10, 10, "ASDF");
			Assert.assertTrue(false);
		} catch (Exception e) {
			Assert.assertTrue(true);
		}
		
	}
}
