package com.ruleeng.thisara.ruleengine;

import java.util.ArrayList;
import java.util.List;

import com.ruleeng.thisara.expression.Expression;
import com.ruleeng.thisara.result.Result;
import com.ruleeng.thisara.rules.AddRule;

public class RuleEngine {

	private static List<Rule> rules = new ArrayList<Rule>();
	
	static {
		rules.add(new AddRule());
	}
	
	public Result process(Expression expression) {
		
		Rule rule = rules
				.stream()
				.filter(r -> r.evaluate(expression))
				.findFirst()
				.orElseThrow(() -> new IllegalArgumentException("Expression is not matched with any rules!"));
		
		return rule.getResult();
	}
} 
