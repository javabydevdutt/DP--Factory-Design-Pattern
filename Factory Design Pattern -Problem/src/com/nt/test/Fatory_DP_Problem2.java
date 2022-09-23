package com.nt.test;

import com.nt.car.Car;
import com.nt.car.SimpleCar;

public class Fatory_DP_Problem2 {

	public static void main(String[] args) {
		Car car = new SimpleCar();
		car.assemble();
		car.roadTest();
		car.transportation();
		System.out.println("Simple car is ready for the market....");
	}
}
