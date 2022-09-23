package com.nt.test;

import com.nt.car.Car;
import com.nt.car.LuxuryCar;

public class Fatory_DP_Problem3 {

	public static void main(String[] args) {
		Car car = new LuxuryCar();
		car.assemble();
		car.roadTest();
		car.transportation();
		System.out.println("luxury car is ready for the market and enjoy for the conforts...");
	}
}
