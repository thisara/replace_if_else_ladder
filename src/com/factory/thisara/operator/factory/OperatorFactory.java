package com.factory.thisara.operator.factory;

import java.util.Map;
import java.util.TreeMap;

import com.factory.thisara.operator.Operator;
import com.factory.thisara.operator.impl.Addition;
import com.factory.thisara.operator.impl.Division;
import com.factory.thisara.operator.impl.Multiply;
import com.factory.thisara.operator.impl.Substract;

public class OperatorFactory {

	public static Map<String, Operator> operatorMap = new TreeMap<String, Operator>();
	
	static {
		operatorMap.put("add", new Addition());
		operatorMap.put("sub", new Substract());
		operatorMap.put("dev", new Division());
		operatorMap.put("mul", new Multiply());
	}
	
	public static Operator getOperator(String operator) {
		return operatorMap.get(operator);
	}
}
