package com.java.basics;

class Car {
	
	//declaring variable static
	public static double carspeed = 34;
}

public class StaticVariable {

	public static void main(String[] args) {

		//Here we are accessing variable of Car class without using object of class. we can access it using Class name only
		System.out.println("Car Speed Is:" + Car.carspeed + "/Hr");
	}

}
