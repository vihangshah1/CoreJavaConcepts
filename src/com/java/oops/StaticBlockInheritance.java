package com.java.oops;

public class StaticBlockInheritance {
	static int i = 0; // Step 1,12
	static { // Step 2
		m1(); // Step 13
		System.out.println("Base Static Block"); // Step 15
	}

	public static void main(String[] args) { // Step 3
		m1();
		System.out.println("Base Main");
	}

	public static void m1() {// Step 4
		System.out.println(j); // Step 14
	}

	static int j = 20; // Step 5,16
}

class Derived extends StaticBlockInheritance {
	static int x = 100; // Step 6,17
	static { // Step 7
		m2(); // Step 18
		System.out.println("Derived First Static Block"); // Step 20
	}

	public static void main(String args[]) // Step 8
	{
		m2(); // Step 23
		System.out.println("Derived Main"); // Step 25
	}

	public static void m2() // Step 9
	{
		System.out.println(y); // Step 19,24
	}

	static { // Step 10
		System.out.println("Derived second Static Block"); // Step 21
	}
	static int y = 200; // Step 11,22
}