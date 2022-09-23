package com.nt.car;

public class SimpleCar extends Car {

	@Override
	public void assemble() {
		System.out.println("Simple Car is assembled completely");

	}

	@Override
	public void roadTest() {
		System.out.println("Simple Car testing  complete");
	}

	@Override
	public void transportation() {
		System.out.println("Simple Car transportation  completely");

	}

}
