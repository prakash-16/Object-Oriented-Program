package com.bridgelabz.OOP;

public class StockExchange {

	public String companySym;
	public int sharePrice;
	public int shareQuant;
	StockExchange stocks[] = new StockExchange[10];

	public StockExchange(String companySym, int sharePrice, int shareQuant) {
		this.companySym = companySym;
		this.sharePrice = sharePrice;
		this.shareQuant = shareQuant;

	}
	public StockExchange() {
		StockList();
	}

	public void StockList() {

		stocks[0] = new StockExchange("REL", 2, 10);
		stocks[1] = new StockExchange("TATA STEEL", 3, 12);
		stocks[2] = new StockExchange("Zomato", 116, 500);
		stocks[3] = new StockExchange("ASHOKA BUILDCON", 30, 12);
		stocks[4] = new StockExchange("HP", 50, 15);
		stocks[5] = new StockExchange("DELL", 300, 12);
		stocks[6] = new StockExchange("MRF", 3000, 12);
		stocks[7] = new StockExchange("ADANI PORTS", 300, 50);
		stocks[8] = new StockExchange("ADANI ELEC", 350, 100);
		stocks[9] = new StockExchange("TATA MOTORS", 356, 200);

	}

	public void displayStocks() {
		int i;
		for(i=0;i<stocks.length;i++) {
			System.out.println(stocks[i].companySym + " stock price is " + stocks[i].sharePrice + " and " + stocks[i].shareQuant + " quantities are avaliable");
		}
		
	}

	public static void main(String[] args) {
		StockExchange b1 = new StockExchange();
		b1.StockList();
		b1.displayStocks();
	

	}

}
