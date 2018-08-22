package com.java.oops;

public class StaticVariableRWO {

	static int i = 0;
	static {
		m1();
		System.out.println(i); // Direct Read
	}

	public static void m1() {
		System.out.println(i); // Indirect Read

	}

}
