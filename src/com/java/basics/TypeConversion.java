package com.java.basics;

public class TypeConversion {

	public static void main(String args[]) {
		int k = 0;

		// automatic type conversion
		long l = k;
		float f1 = l;

		System.out.println("Int Value::-" + k);
		System.out.println("Long Value::-" + l);
		System.out.println("Float Value::-" + f1);

		char c1 = 'c';
		int num = 88;
		// c1 = num; incompatible data
		// type for explicit type conversion

		// Type promotion in Expressions
		byte b = 42;
		char c = 'a';
		short s = 1024;
		int i = 50000;
		float f = 5.67f;
		double d = .1234;

		// The Expression
		double result = (f * b) + (i / c) - (d * s);

		// Result after all the promotions are done
		System.out.println("result = " + result);

	}

}
