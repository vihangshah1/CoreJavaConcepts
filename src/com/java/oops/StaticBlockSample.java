package com.java.oops;

public class StaticBlockSample {

	static int i = 10; // step 1,7
	static { // step 2
		m1(); // step 8
		System.out.println("First Static Block");

	}

	public static void main(String[] args) { // step 3
		m1(); // step 13
		System.out.println("Main Method"); // step 15

	}

	public static void m1() { // step 4
		System.out.println(j); // step 9,14
	}

	static { // step 5

		System.out.println("Second Static Block");

	}
	static int j = 20; // step 6
}
