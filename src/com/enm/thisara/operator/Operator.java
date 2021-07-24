package com.enm.thisara.operator;

public enum Operator {
	ADD {
		
		@Override
		public int apply(int a, int b) {
			return a + b;
		}
		
	}, MUL {

		@Override
		public int apply(int a, int b) {
			return a * b; 
		}
		
	}, SUB {

		@Override
		public int apply(int a, int b) {
			return a - b;
		}
		
	}, DIV {

		@Override
		public int apply(int a, int b) {
			return a/b;
		}
		
	};
	
	public abstract int apply(int a, int b);
}

