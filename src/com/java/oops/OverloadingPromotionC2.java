package com.java.oops;

class Test1 {
	public void m1(String i) {
		System.out.println(i);
	}

	public void m1(StringBuffer sb) {
		System.out.println(sb);
	}

	public void m1(Object f) {
		System.out.println(f);
	}
}

public class OverloadingPromotionC2 {

	public static void main(String[] args) {
		Test1 t = new Test1();
		t.m1("ABC");// will consider String arg method
		t.m1(new Object()); // will consider Object arg method
		//t.m1(null); // will give CE:: The method m1(String) is ambiguous for the type Test1
	}

}
