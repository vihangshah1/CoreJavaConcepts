package com.java.oops;

public class WithOutMainStaticBlock1 {

	static int x = m();

	public static int m() {
		System.out.println("I can Print.");
		System.exit(0);
		return 10;
	}

}

class WithOutMainStaticBlock2 {
	static WithOutMainStaticBlock2 t = new WithOutMainStaticBlock2();
	{
		System.out.println("I can Print.");
		System.exit(0);
	}
}

class WithOutMainStaticBlock3 {
	static WithOutMainStaticBlock3 t = new WithOutMainStaticBlock3();

	WithOutMainStaticBlock3() {
		System.out.println("I can Print.");
		System.exit(0);
	}
}
