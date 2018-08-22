package com.java.oops;

class Test2 {
	public void m1(int i, float f) {
		System.out.println(i);
	}

	public void m1(float f, int i) {
		System.out.println(f);
	}
}

public class OverloadingPromotionC3 {

	public static void main(String[] args) {

		Test2 t = new Test2();
		//t.m1(10, 10);// will give CE:The method m1(int, float) is ambiguous for the type Test2
		//t.m1(10f, 10f);// will give CE:	The method m1(float, int) in the type Test2 is not 
		//applicable for the arguments (float, float)
	}

}
