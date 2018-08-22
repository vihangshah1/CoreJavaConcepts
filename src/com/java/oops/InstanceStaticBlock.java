package com.java.oops;

public class InstanceStaticBlock {

	{
		System.out.println("First Instance Block");
	}
	static {
		System.out.println("First Static Block");
	}

	InstanceStaticBlock() {
		System.out.println("Constructor");
	}

	public static void main(String[] args) {
		InstanceBlockBasic isb = new InstanceBlockBasic();
		System.out.println("main");
		InstanceBlockBasic isb2 = new InstanceBlockBasic();

	}

	static {
		System.out.println("Second Static Block");
	}
	{
		System.out.println("Second Instance Block");
	}

}
