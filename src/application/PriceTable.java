package application;

import java.util.Date;

public class PriceTable {

	private Season season;
	private double price;
	
	public double getPrice()
	{
		return price;
	}
	
	public Season getSeason()
	{
		return season;
	}
	
	public PriceTable(Season season ,double price)
	{
		this.price = price;
		this.season = season;
	}
	
	public double getTotalPrice(Date startDate, Date endDate)
	{
		double totalPrice = 0;
		
		
		
		return totalPrice;
	}
	
	@Override
	public String toString()
	{
		return season + ": " + price;
	}
}