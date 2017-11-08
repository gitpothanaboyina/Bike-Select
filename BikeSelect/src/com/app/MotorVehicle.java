package com.app;

import java.util.ArrayList;
import java.util.Iterator;

public class MotorVehicle {
	
	public MotorVehicle() {
		setVehicles();
	}

	private ArrayList<VehicleInfo> vehicles=null;

	public ArrayList<VehicleInfo> getVehicles() {
		return vehicles;
	}

	public void setVehicles() {
		
		VehicleInfo v1=new VehicleInfo();
		v1.setModel(2005);
		v1.setName("CB Shine");
		v1.setManufacturer("Honda");
		v1.setPrice(69000);
		
		VehicleInfo v2=new VehicleInfo();
		v2.setModel(2000);
		v2.setName("Pulsar 150");
		v2.setManufacturer("Bajaj");
		v2.setPrice(80000);
		
		VehicleInfo v3=new VehicleInfo();
		v3.setModel(1990);
		v3.setName("Chetak");
		v3.setManufacturer("Bajaj");
		v3.setPrice(50000);
		
		VehicleInfo v4=new VehicleInfo();
		v4.setModel(2000);
		v4.setName("Passion");
		v4.setManufacturer("Hero Honda");
		v4.setPrice(64000);
		

		vehicles=new ArrayList<VehicleInfo>();
		vehicles.add(v1);
		vehicles.add(v2);
		vehicles.add(v3);
		vehicles.add(v4);
		
	}
	
	
	public void checkOnPrice(int price) throws InterruptedException{
		
		System.out.println("Checking for the list of bikes under Rs."+price +" Category :");
		Thread.sleep(3000);
		Iterator<VehicleInfo> itr=vehicles.iterator();
		while (itr.hasNext()) {
			VehicleInfo vehicleInfo = (VehicleInfo) itr.next();
			
			if(vehicleInfo.getPrice()<=price)
			{
				VehicleInfo.printDetails(vehicleInfo);
			}
		
		}
		
	}
	
	public void checkOnManufacturer(String manufacturer) throws InterruptedException{
		
		System.out.println("Checking for the list of bikes by"+ manufacturer +" manufacturer :");
		Thread.sleep(3000);
		Iterator<VehicleInfo> itr=vehicles.iterator();
		while (itr.hasNext()) {
			VehicleInfo vehicleInfo = (VehicleInfo) itr.next();
			
			if(vehicleInfo.getManufacturer().equals(manufacturer))
			{
				VehicleInfo.printDetails(vehicleInfo);
			}
		
		}
		
	}
	
	
}
