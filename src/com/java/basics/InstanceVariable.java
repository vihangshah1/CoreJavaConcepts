package com.java.basics;

class Marks {
	// These variables are instance variables.
	// These variables are in a class and are not inside any function
	int english;
	int maths;
	int science;
}

public class InstanceVariable {

	public static void main(String[] args) {
		Marks m = new Marks();
		m.english = 50;
		m.science = 60;
		m.maths = 70;

		System.out.println("Object 1 English Science Maths Marks ::- " + m.english + m.science + m.maths);

		Marks m1 = new Marks();
		m1.english = 10;
		m1.science = 20;
		m1.maths = 30;
		System.out.println("Object 2 English Science Maths Marks ::- " + m1.english + m1.science + m1.maths);
	}

}
