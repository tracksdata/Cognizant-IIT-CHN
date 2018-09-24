package com;

public class Car implements Vehicle {

	@Override
	public String printName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void printData() {
		System.out.println("---- Car class printData");
		Vehicle.super.printData();
		Vehicle.f2();
	}

}
