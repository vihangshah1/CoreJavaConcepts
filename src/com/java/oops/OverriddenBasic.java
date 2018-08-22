package com.java.oops;

class Parent {
	public void property() {
		System.out.println("CASH+GOLD+LAND");
	}

	public void marry() { // this method is called overridden method
		System.out.println("Girl");
	}
}

class Child extends Parent {
	public void marry() { // this method is called overriding method
		System.out.println("Dream Gril");
	}
}

public class OverriddenBasic {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.marry(); // -->	Parent Method

		Child c = new Child();
		c.marry(); //--> Child Method 

		Parent p1 = new Child();
		p1.marry(); //--> Child Method 
	}

}
