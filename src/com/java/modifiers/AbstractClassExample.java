package com.java.modifiers;
abstract class AbstractClassExample {
	abstract public int getNoOfWheels();

}
class Vehicle extends AbstractClassExample {
	public int getNoOfWheels() {
		return 7;
	}
}
class Bike extends AbstractClassExample {
	public int getNoOfWheels() {
		return 2;
	}
}