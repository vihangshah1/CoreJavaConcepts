package com.java.oops;

public class InstanceBlockInheritance {
	int i = 10; // Step 4,15
	{ // Step 5
		m1(); // Step 16
		System.out.println("Parent Instance Block"); // Step 18
	}

	InstanceBlockInheritance() {// Step 6
		System.out.println("Parent Constructor"); // Step 20
	}

	public static void main(String[] args) { // Step 1
		InstanceBlockBasic ib = new InstanceBlockBasic();
		System.out.println("Parent Main");
	}

	public void m1() { // Step 7
		System.out.println(j); // Step 17
	}

	int j = 20; // Step 8,19
}

class Inheri1 extends InstanceBlockBasic {
	int x = 10; // Step 9,21
	{ // Step 10
		m2(); // Step 22
		System.out.println("Child First Instance Block"); // Step 24
	}

	Inheri1() { // Step 11
		System.out.println("Child Constructor"); // Step 27
	}

	public static void main(String[] args) { // Step 2
		Inheri1 ih = new Inheri1(); // Step 3
		System.out.println("Child Main"); // Step 28
	}
	public void m2() {// Step 12
		System.out.println(y); // Step 23
	}
	{ // Step 13
		System.out.println("Child Second Instance Block"); // Step 25
	}
	int y = 200; // Step 14,26
}