package com.bridgelabz.OOP;

public class InventoryDataManagement {
	
	public String cerealName;
	public double pricePerKg;
	public double weight;
	InventoryDataManagement list[] = new InventoryDataManagement[3];
	
	public InventoryDataManagement(String cerealName, double pricePerKg, double weight) {
		this.cerealName = cerealName;
		this.pricePerKg = pricePerKg;
		this. weight = weight;
	}
	
	public InventoryDataManagement() {
		cerealList();
	}

	public void cerealList() {
		list[0] = new InventoryDataManagement("Rice",100.0,60.0);
		list[1] = new InventoryDataManagement("Pulses",120.0,70.0);
		list[2] = new InventoryDataManagement("Wheat",90.0,50.0);	
	}
	
	public void displayList() {
		int i;
		for(i=0;i<list.length;i++) {
			System.out.println(list[i].cerealName + " is " + list[i].pricePerKg + " Rupee/Kg " + "and " + list[i].weight + "Kg is available."); 
		}
	}
	
	public static void main(String[] args) {
		InventoryDataManagement b1 = new InventoryDataManagement();
		b1.cerealList();
		b1.displayList();
	}
}
