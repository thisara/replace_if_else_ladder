package com.ruleeng.thisara;

import com.ruleeng.thisara.expression.Expression;
import com.ruleeng.thisara.expression.Operator;
import com.ruleeng.thisara.result.Result;
import com.ruleeng.thisara.ruleengine.RuleEngine;

public class Calculator {

	public static void main(String []args) {
		
		Expression expression = new Expression();
		
		expression.setA(5);
		expression.setB(6);
		
		expression.setOperator(Operator.ADD);
		
		RuleEngine ruleEngine = new RuleEngine();
		
		Result result = ruleEngine.process(expression);
		
		System.out.println("Output : " + result.getResult());
		
	}
}
