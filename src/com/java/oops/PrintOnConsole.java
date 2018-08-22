package com.java.oops;

//Below are multiple ways to print message on console without main and static block
//till 1.6 Version

public class PrintOnConsole {
	static int x = m1();

	public static int m1() {
		System.out.println("Hello I can print");
		System.exit(0);
		return 1;
	}

}

class PrintOnConsole1 {
	static PrintOnConsole1 pc = new PrintOnConsole1();
	{
		System.out.println("Hello");
		System.exit(0);
	}
}

class PrintOnConsole2 {
	static PrintOnConsole2 pc = new PrintOnConsole2();

	public PrintOnConsole2() {
		System.out.println("Hello");
		System.exit(0);
	}
}