package com.java.oops;

class Animal {
}
class Monkey extends Animal {
}

class Test4 {
	public void m1(Animal a) {
		System.out.println("Animal");
	}

	public void m1(Monkey m) {
		System.out.println("Monkey");
	}
}
public class OverloadingPromotionC5 {

	public static void main(String[] args) {
		Test4 t =new Test4();
		System.out.println("Output Is::-\n");
		Animal a = new Animal();
		t.m1(a);
		Monkey m = new Monkey();
		t.m1(m);
		Animal am = new Monkey();
		t.m1(am);

	}

}
