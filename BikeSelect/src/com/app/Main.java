package com.app;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		new MotorVehicle().checkOnPrice(80000);
		System.out.println("====================================");
		new MotorVehicle().checkOnManufacturer("Bajaj");
		System.out.println("====================================");
	}

}
