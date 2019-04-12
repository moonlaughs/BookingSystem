package application;

public class PriceTable {

	private double price;
	
	private Season season;
	
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
	
	@Override
	public String toString()
	{
		return season + ": " + price;
	}
}