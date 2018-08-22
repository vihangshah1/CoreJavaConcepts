package com.java.modifiers;

public class FinalMethod {
	public void m1() {
		System.out.println("Method M");
	}

	public final void m2() {
		System.out.println("Final Method M2");
	}

}

class FinaleMethodChild extends FinalMethod {
	// public void m2() {
	// System.out.println("Inheri Final Method M2");
	// }
}
