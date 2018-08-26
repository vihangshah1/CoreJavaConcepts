package com.java.modifiers;

public class FinalLocalVariable {

	public static void main(String[] args) {
		final int x;
		System.out.println("Hie");

	}

}

class Test {
	public static void main(String[] args) {
		m1(10, 20);
	}

	public static void m1(final int x, final int y) {

	}
}