package com.nt.car;

public class SportsCar extends Car {

	@Override
	public void assemble() {
		System.out.println("Sports Car is assembled completely");
	}

	@Override
	public void roadTest() {
		System.out.println("Sports Car is tested successfully");

	}

	@Override
	public void transportation() {
		System.out.println("Sports Car transportation completed");

	}

}
