package com.java.oops;

class Parent1 {
	private void m1() {

	}
}

class Child1 extends Parent1 {
	private void m1() { // It is not an overriding

	}

}

public class OverridingPrivateMethods extends Parent1 {
	public static void main(String[] args) {
		Parent1 p = new Parent1();
		
	}

}
