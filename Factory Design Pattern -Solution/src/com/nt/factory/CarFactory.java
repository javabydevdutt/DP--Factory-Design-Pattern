package com.nt.factory;

import com.nt.car.Car;
import com.nt.car.LuxuryCar;
import com.nt.car.SimpleCar;
import com.nt.car.SportsCar;

public class CarFactory {

	public static Car carFactory(String name) {
		Car car = null;
		if (name.equalsIgnoreCase("simple")) {
			car = new SimpleCar();
		} else if (name.equalsIgnoreCase("sports")) {
			car = new SportsCar();
		} else if (name.equalsIgnoreCase("luxury")) {
			car = new LuxuryCar();
		} else {
			throw new IllegalArgumentException("Invalid car name");
		}

		car.assemble();
		car.roadTest();
		car.transportation();

		return car;
	}// method
}// Factory class
