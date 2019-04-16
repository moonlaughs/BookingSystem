package application;

import java.util.ArrayList;
import java.util.List;

public class Room {

	private int roomId;
	private RoomState roomState;
	private RoomType roomType;
	private Boolean isBooked;
	private List<Booking> bookings;
	
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
		
		//bokings.add
		
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
		Booking booking = bookings.contains(roomId);
		
		Room room = booking.getRoom();
		
		RoomState rs = room.getRoomState();
		rs = roomState;
	}
	
	public List<Room> free(Date startDate, Date endDate, RoomType roomType)
	{
		//search through bookings
		List<Room> freeRooms = new ArrayList<>();
		
		for(Room r: bookings.getRoom())
		{
			if(r.)
		}
	}
	
	//isbooked 
	
	public void removeBooking(int bookingId)
	{
		bookings.remove(bookingId);
	}
}
