package com.java.oops;

public class SingletoneClassA1 {
	private static SingletoneClassA1 s = new SingletoneClassA1();

	private SingletoneClassA1() {

	}

	public static SingletoneClassA1 getTest() {
		return s;
	}

}

class SingletoneClassA2 {
	private static SingletoneClassA2 s1 = new SingletoneClassA2();

	private SingletoneClassA2() {

	}

	public static SingletoneClassA2 getTest() {
		return s1;
	}

}

class SingletoneClassA3 {
	

	private SingletoneClassA3() {

	}

	
}
