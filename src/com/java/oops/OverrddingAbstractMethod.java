package com.java.oops;

abstract class Parent3 {
	public abstract void m1();

}

public class OverrddingAbstractMethod extends Parent3 {

	public void m1() {

	}
}

class Parent4 {
	public void m2() {

	}
}

abstract class Child2 extends Parent4 {
	public abstract void m2();
}
