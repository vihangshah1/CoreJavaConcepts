package com.java.oops;
class Test3 {
	public void m1(int i) {
		System.out.println(i);
	}

	public void m1(int... sb) {
		System.out.println(sb);
	}

	
}
public class OverloadingPromotionC4 {

	public static void main(String[] args) {
		Test3 t = new Test3();
		t.m1();  // will consider Var arg method
		t.m1(10,20);  // will consider Var arg method
		t.m1(10);  // will consider General method

	}

}
