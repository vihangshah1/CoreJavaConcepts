package com.java.oops;
class P4
{
	public void m1(int... a)
	{
		System.out.println("Parent");
	}
}
class C4 extends P4
{
	public void m1(int a) // it is not overriding it is
	// overloading 
	{
		System.out.println("Child"); 
	}
}
public class OverridingVArgMethods {

	public static void main(String[] args) {
		
		P4 p = new P4();
		p.m1(10); // Parent method calling
		
		C4 c = new C4();
		c.m1(10); //Child method calling
		
		P4 p1 = new P4();
		p1.m1(10); // Parent method calling
		
	

	}

}
