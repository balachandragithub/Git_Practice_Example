package com.app.bala.impl;

import com.app.bala.ICalculator;

public class CalculatorImpl implements ICalculator{

	@Override
	public int addTwoNumbers(int a, int b) {
		int c=a+b;
		return c;
	}

	@Override
	public int substracktTwonumbers(int a, int b) {
		int c=a-b;
		return c;
	}

	@Override
	public int multiplyTwoNumbers(int a, int b) {
		int c=a*b;
		return c;
	}
	
	

}
