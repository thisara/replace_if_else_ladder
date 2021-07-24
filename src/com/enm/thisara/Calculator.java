package com.enm.thisara;

import java.util.Scanner;

import com.enm.thisara.operator.Operator;

public class Calculator {
	
	public static void main(String args[]) {
		
		int result = -1;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Input first number : ");
		int a = scanner.nextInt();
		
		System.out.println("Input second number : ");
		int b = scanner.nextInt();
		
		System.out.println("Input command : ");
		String command = scanner.next();
		
		try {

			Operator operator = Operator.valueOf(command);
			
			if ((a > 0 && b > 0)) {
				result = operator.apply(a, b);
			}else {
				System.out.println("Invalid input numbers!");
			}
			
		} catch (IllegalArgumentException e) {
			System.out.println("Invalid command!");
		}

		System.out.println("Output : " + result);
		
		scanner.close();
	}
}
