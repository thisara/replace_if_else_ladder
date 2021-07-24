package com.factory.thisara.operator.impl;

import com.factory.thisara.operator.Operator;

public class Substract implements Operator{

	@Override
	public int apply(int a, int b) {
		return a - b;
	}

}
