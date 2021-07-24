package com.factory.thisara;

import java.util.Scanner;

import com.factory.thisara.operator.factory.OperatorFactory;

public class Calculator {

	public static int caculate(int a, int b, String command) {
		return (command!=null && a > 0 && b > 0) ? OperatorFactory.getOperator(command).apply(a, b) : -1;
	}
	
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Input first number : ");
		int a = scanner.nextInt();
		
		System.out.println("Input second number : ");
		int b = scanner.nextInt();
		
		System.out.println("Input command : ");
		String command = scanner.next();
		
		int result = Calculator.caculate(a, b, command);
		
		System.out.println("Output : " + result);
		
		scanner.close();
	}
}
