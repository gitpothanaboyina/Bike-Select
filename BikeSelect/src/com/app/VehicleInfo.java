package com.app;

public class VehicleInfo {

	private int model;
	private String name;
	private String manufacturer;
	private int price;
	
	
	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model = model;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "VehicleInfo [model=" + model + ", name=" + name
				+ ", manufacturer=" + manufacturer + ", price=" + price + "]";
	}
	
	public static void printDetails(VehicleInfo vi){
		
		System.out.println(vi.getModel()+"  -  "+vi.getName()+"  -  "+vi.getManufacturer()+"  -  "+vi.getPrice());
	}
	
	
}
