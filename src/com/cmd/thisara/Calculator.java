package com.cmd.thisara;

import com.cmd.thisara.command.Command;
import com.cmd.thisara.command.impl.AddCommand;

public class Calculator {

	public int calculate(Command command) {
		return command.execute();
	}
	
	public static void main(String []args) {
		
		Calculator calculator = new Calculator();
		
		int result = calculator.calculate(new AddCommand(4, 5));
		
		System.out.println("Output : " + result);
	}
}
