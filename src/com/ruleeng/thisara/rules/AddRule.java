package com.ruleeng.thisara.rules;

import com.ruleeng.thisara.expression.Expression;
import com.ruleeng.thisara.result.Result;
import com.ruleeng.thisara.ruleengine.Rule;


public class AddRule implements Rule{

	private Integer output;
	
	@Override
	public boolean evaluate(Expression expression) {
		output = expression.getA() + expression.getB();
		return true;
	}

	@Override
	public Result getResult() {
		Result result = new Result();
		result.setResult(output);
		return result;
	}

}
