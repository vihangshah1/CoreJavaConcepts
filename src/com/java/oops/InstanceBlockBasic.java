package com.java.oops;

public class InstanceBlockBasic {
	int i = 10; //step 3,9
	{ //step 4
		m1();  //step 10
		System.out.println("First Instance Block"); //step 12
	}

	InstanceBlockBasic() { //step 5
		System.out.println("Constructor"); //step 15
	}

	public static void main(String[] args) { //step 1
		InstanceBlockBasic ib = new InstanceBlockBasic(); //step 2
		System.out.println("Main"); //step 16
	}

	public void m1() { //step 6
		System.out.println(j); //step 11
	}

	{ //step 7
		System.out.println("Second Instance Block"); //step 13
	}
	int j = 0; //step 8,14
}
