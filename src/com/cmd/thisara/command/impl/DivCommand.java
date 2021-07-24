package com.cmd.thisara.command.impl;

import com.cmd.thisara.command.Command;

public class DivCommand implements Command{

	private Integer a;
	private Integer b;
	
	public DivCommand(Integer a, Integer b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public Integer execute() {
		return a / b;
	}

}
