package com.slokam.da.hc.service.impl;

import com.slokam.da.hc.service.ICalculator;

public class CalculatorImpl implements ICalculator{

	@Override
	public int calc(int a, int b, String ope) throws Exception{
		int c =0;
		switch(ope) {
		  case "ADD" : c = a+b; break;
		  case "SUB" : c = a-b; break;
		  case "MUL" : c = a*b; break;
		  case "DIV" : c = a/b; break;
		  case "MODU" : c =a%b ;break;
		  default : throw new Exception("Operation Not Supported");
		}
		return c ;
	}
}
