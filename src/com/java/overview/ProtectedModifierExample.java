package com.java.overview;

import com.java.modifiers.A1;

public class ProtectedModifierExample {

}

class C1 extends A1 {

}

class D1 extends C1 {
	public static void main(String[] args) {

		A1 a1 = new A1();
		// a1.m1(); Not Valid Will Give CE "The method m1() from the type A1 is not
		// visible"
		C1 c1 = new C1();
		// c1.m1(); Not Valid Will Give CE "The method m1() from the type C1 is not
		// visible"
		D1 d1 = new D1();
		d1.m1();  //valid 
		A1 a2 = new A1();
		// a2.m1(); Not Valid Will Give CE "The method m1() from the type A1 is not
		// visible"
		A1 a3 = new A1();
		// a3.m1(); Not Valid Will Give CE "The method m1() from the type A1 is not
		// visible"
		C1 c2 = new C1();
		// c2.m1(); Not Valid Will Give CE "The method m1() from the type C1 is not
		// visible"

	}
}
