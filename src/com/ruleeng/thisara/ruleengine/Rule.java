package com.ruleeng.thisara.ruleengine;

import com.ruleeng.thisara.expression.Expression;
import com.ruleeng.thisara.result.Result;

public interface Rule {

	boolean evaluate(Expression expression);
	Result getResult();
}
