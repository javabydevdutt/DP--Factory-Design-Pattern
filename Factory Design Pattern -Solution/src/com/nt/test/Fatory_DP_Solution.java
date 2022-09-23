package com.nt.test;

import com.nt.car.Car;
import com.nt.factory.CarFactory;

public class Fatory_DP_Solution {

	public static void main(String[] args) {
		Car car = null;
		// get the object of the car
		car = CarFactory.carFactory("sports");
		System.out.println("Sports Car is ready for the market");
		System.out.println("============================================");
		car = CarFactory.carFactory("simple");
		System.out.println("Simple Car is ready for the market");
		System.out.println("============================================");
		car = CarFactory.carFactory("Luxury");
		System.out.println("Luxury Car is ready for the market");

	}
}
