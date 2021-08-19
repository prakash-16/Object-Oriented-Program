package com.bridgelabz.OOP;

import java.util.*;

public class Investor {

	public String companyName;
	public int stockQuant;
	public int i;
	Investor dematAcc[] = new Investor[10];

	public static int funds = 1000;
	StockExchange shareList = new StockExchange();
	Scanner sc = new Scanner(System.in);
	

	public Investor(String companyName, int stockQuant) {
		this.companyName = companyName;
		this.stockQuant = stockQuant;
	}

	public void buyStocks() {
		System.out.println("you want to buy stocks");
		String ans = sc.nextLine();
		if (ans.equals("yes")) {
			for (i = 0; i < shareList.stocks.length; i++) {
				if (companyName.equals(shareList.stocks[i].companySym)) {
					if (shareList.stocks[i].shareQuant > 0) {
						if(funds >= stockQuant*shareList.stocks[i].sharePrice) {
							funds = funds + shareList.stocks[i].sharePrice;
							dematAcc[i] = new Investor(companyName, stockQuant);
							shareList.stocks[i].shareQuant++;
							System.out.println("Stocks Purchased");
							break;
						}
						else {
							System.out.println("Out of funds");
							break;
						}
						
					} 
					else {
						System.out.println("Out of Stock");
						break;
					}
					

				   } 
				}
			
			}
			else {
			System.out.println("Thank you");
		}

		
	}

	public void sellStocks() {
		System.out.println("you want to sell stocks");
		String ans = sc.nextLine();
		if (ans.equals("yes")) {
			for (i = 0; i < shareList.stocks.length; i++) {
				if (companyName.equals(shareList.stocks[i].companySym)) {
					if(dematAcc[i] != null) {
						funds = funds + shareList.stocks[i].sharePrice;
						dematAcc[i] = new Investor(companyName, 0);
						shareList.stocks[i].shareQuant++;
						System.out.println("Stocks Selled");
						break;
					}
					else {
						System.out.println("you don't have stocks in yout holding");
						break;
					}
					
					}
										
			}
				
				
		} 
		else {
			System.out.println("Thank you");
		}
	}

	public void displayStocks() {
		for (i = 0; i < dematAcc.length; i++) {
			if(dematAcc[i] != null) {
				System.out.println(dematAcc[i].companyName + " with " + dematAcc[i].stockQuant + " quantity of stock");
			}
		}
	}	

	public static void main(String[] args) {
		
		Investor b1 = new Investor("REL", 2);
		b1.buyStocks();
		b1.displayStocks();
		b1.sellStocks();
		b1.displayStocks();
		
		
	}

}
