package com.qa.main;

public class Runner {
	
	public static double numberFun(double num1, double num2, boolean mybool) {
		if (mybool == true) {
			double result = num1 + num2;
			return result;
		}
		else if (mybool == false) {
			double result = num1 * num2;
			return result;
		}
		else {
			System.out.println("No option chosen");
			return 0d;
		}
	}

	public static void main(String[] args) {
		System.out.println(numberFun(1, 2, true));
		System.out.println(numberFun(3, 3, false));
		System.out.println(numberFun(1, 1, true));
	}

}
