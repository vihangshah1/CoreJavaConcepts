package com.java.oops;

class Test {
	public void m1(int i) {
		System.out.println(i);
	}

	public void m1(float f) {
		System.out.println(f);
	}

}

public class OverloadingPromotionC1 {

	public static void main(String[] args) {
		Test t = new Test();
		t.m1(10);// will consider int arg method
		t.m1(10.5f); // will consider float arg method
		t.m1('v'); // will consider char arg method
		t.m1(10l); // will consider float arg method
		//t.m1(10.5); // will give CE:: cannot find symbol

	}

}
	