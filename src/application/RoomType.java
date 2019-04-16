package application;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RoomType {

	private double nightPrice;
	private NoOfBeds noOfBeds;
	private RoomQuality roomQuality;
	private List<String> facilities;
	
	public double getNightPrice()
	{
		return nightPrice;
	}
	
	public NoOfBeds getNoOfBeds()
	{
		return noOfBeds;
	}
	
	public RoomQuality getRoomQuality()
	{
		return roomQuality;
	}
	
	public List<String> getFacilities()
	{
		return facilities;
	}
	
	public RoomType(double nightPrice, NoOfBeds noOfBeds, RoomQuality roomQuality, List<String> facilities)
	{
		allFacilities();
		this.nightPrice = nightPrice;
		this.noOfBeds = noOfBeds;
		this.roomQuality = roomQuality;
		this.facilities = facilities;
	}
	
	public List<String> allFacilities()
	{
		facilities = new ArrayList<>();
		facilities.add("TV");
		facilities.add("WiFi");
		facilities.add("Parking");
		return facilities;
	}
	
	public Room getDetails(Date startDate, Date endDate)
	{
		//?????????
	}
}
