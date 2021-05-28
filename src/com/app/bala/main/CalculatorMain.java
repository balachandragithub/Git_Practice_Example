package com.app.bala.main;

import com.app.bala.ICalculator;
import com.app.bala.impl.CalculatorImpl;

public class CalculatorMain {
	
	public static void main(String[] args) {
		
		ICalculator iCalculator = new CalculatorImpl();
		iCalculator.addTwoNumbers(10, 20);
		
	}

}
