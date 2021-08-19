package com.bridgelabz.OOP;

import java.util.Scanner;

public class InventoryManagementProgram {
	
	public String cerealName;
	public double weight;
	public double pricePerCereal;
	public int i;
	
	InventoryDataManagement consumer = new InventoryDataManagement();
	InventoryManagementProgram customerList[] = new InventoryManagementProgram[10];
	Scanner sc = new Scanner(System.in);
	
	public InventoryManagementProgram(String cerealName, double weight) {
		this.cerealName = cerealName;
		this.weight = weight;
	}
	public InventoryManagementProgram(String cerealName, double weight, double pricePerCereal) {
		this.cerealName = cerealName;
		this.weight = weight;
		this.pricePerCereal = pricePerCereal;
	}
	
	
	public void billing() {
		for(i=0;i<consumer.list.length;i++) {
			if(cerealName.equals(consumer.list[i].cerealName)) {
				if(consumer.list[i].weight > weight) {
					pricePerCereal = consumer.list[i].weight * weight;
					customerList[i] = new InventoryManagementProgram(cerealName, weight, pricePerCereal);
					System.out.println("Cereal added");
				}
			}
		}
	}
	
	public void displayCereals() {
		for (i = 0; i < customerList.length; i++) {
			if(customerList[i] != null) {
				System.out.println("The price of " + cerealName + " of weight " +  weight +" Kg is " + pricePerCereal + " Rupee.");
			}
		}
	}
	
	public static void main(String[] args) {
		InventoryManagementProgram b1 = new InventoryManagementProgram("Rice", 2.0);
		b1.billing();
		b1.displayCereals();
		
		
	}

}
