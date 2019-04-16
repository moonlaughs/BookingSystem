package application;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.text.DateFormatter;

public class Room {

	private int roomId;
	private RoomState roomState;
	private RoomType roomType;
	private Boolean isBooked;
	private List<Booking> bookings;
	private Register register;
	
	public int getRoomId()
	{
		return roomId;
	}
	
	public RoomState getRoomState()
	{
		return roomState;
	}
		
	public RoomType getRoomType()
	{
		return roomType;
	}
	
	public Boolean getIsBooked()
	{
		return isBooked;
	}	
	
	public List<Booking> getBookings()
	{		
		bookings = new ArrayList<>();
		
		//bokings.add(new Booking(1, this.getRoomId(), 1,2016-05-01, 2016-05-01, 400.00, false, State.current));
		
		return bookings;
	}
	
	public Room(int roomId, RoomState roomState, RoomType roomType, Boolean isBooked, List<booking> bookings)
	{
		this.roomId = roomId;
		this.roomState = roomState;
		this.roomType = roomType;
		this.isBooked = isBooked;
		this.bookings = bookings;
	}
	
	public void upadateState(int roomId, RoomState roomState)
	{		
		for(Booking b: bookings)
		{
			if(b.getRoomId() == roomId)
			{
				List<Room> allRooms = register.getRooms();  //In the future add list of all Rooms to Register class
				Room room = allRooms.get(roomId);
				RoomState rs = room.getRoomState();
				rs = roomState;
			}
		}		
	}
	
	public List<Room> free(Date startDate, Date endDate, RoomType roomType)
	{
		//search through bookings
		List<Room> freeRooms = new ArrayList<>();
		
		for(Room r: register.getRooms())
		{
			if(roomType == r.getRoomType()) //in the future add period that is free and check
			{
				freeRooms.add(r);
			}
		}
		
		return freeRooms;
	}
	
	public void removeBooking(int bookingId)
	{
		bookings.remove(bookingId);
	}
}
