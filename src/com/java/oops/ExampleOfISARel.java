package com.java.oops;

class P {
	public void m1() {
		System.out.println("Parent");
	}
}

class C extends P {
	public void m2() {
		System.out.println("Child");
	}
}

public class ExampleOfISARel {

	public static void main(String[] args) {
		P p = new P();
		p.m1(); // It is Valid
		// p.m2(); // Not Valid Will Give CE::Cannot Find Symbol

		C c = new C();
		c.m1(); // Valid
		c.m2(); // Valid

		P p1 = new P();
		p1.m1(); // Valid
		// p1.m2(); // Not Valid Will Give CE::Cannot Find Symbol

		// C c1 = new P(); // itself is not valid
	}
}