package com.nt.test;

import com.nt.car.Car;
import com.nt.car.SportsCar;

public class Fatory_DP_Problem {

	public static void main(String[] args) {
		Car car = new SportsCar();
		car.assemble();
		car.roadTest();
		car.transportation();
		System.out.println("Sports car is ready for the compitation...");
	}
}
