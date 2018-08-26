package com.java.modifiers;

public class StaticVariableExample {
	static int x = 10;
	int y = 20;

	public static void main(String[] args) {
		StaticVariableExample s1 = new StaticVariableExample();
		s1.x = 88;
		s1.y = 99;
		System.out.println(s1.x + " " + s1.y);
		StaticVariableExample s2 = new StaticVariableExample();
		System.out.println(s2.x + " " + s2.y);
	}

}
