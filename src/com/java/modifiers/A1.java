package com.java.modifiers;

public class A1 {
	protected void m1() {
		System.out.println("hiee");
	}
}
class B1 extends A1 {
	public static void main(String[] args) {
		A1 a1 = new A1();
		a1.m1();

		B1 b = new B1();
		b.m1();

		A1 a2 = new A1();
		a2.m1();
	}
}