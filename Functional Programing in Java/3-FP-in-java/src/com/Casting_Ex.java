package com;

class Vehicle {
}

class Car extends Vehicle {

}

class Bike extends Vehicle {

}

public class Casting_Ex {

	public static void main(String[] args) {

//		Car car=new Car();
//		Bike bike=new Bike();

//		Car car=new Bike();

//		Vehicle vehicle = new Car(); // implicit casting..
//		vehicle = new Bike();

		Vehicle vehicle = new Car();

		if (vehicle instanceof Car) {
			Car car = (Car) vehicle;
			// ...
		}

	}

}
