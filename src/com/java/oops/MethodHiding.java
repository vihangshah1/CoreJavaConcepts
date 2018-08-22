package com.java.oops;
class P1
{
	public static void m1()
	{
		System.out.println("Parent");
	}
}
class C1 extends P1
{
	public static void m1()
	{
		System.out.println("Child");
	}
}
public class MethodHiding {
	public static void main(String[] args)
	{
		P1 p= new P1();
		p.m1(); // parent
		C1 c = new C1();
		c.m1(); // child
		P1 p2 = new P1();
		p2.m1(); // Parent
	}

}
