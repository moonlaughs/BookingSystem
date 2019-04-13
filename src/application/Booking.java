package application;

import java.util.Date;

public class Booking {
	
	private int bookingId;
	private int roomId;
	private int guestId;
	private Date startDate;
	private Date endDate;
	private double totalPrice;
	private Boolean isReady;
	private State state;

	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public int getRoomId() {
		return roomId;
	}
	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}
	public int getGuestId() {
		return guestId;
	}
	public void setGuestId(int guestId) {
		this.guestId = guestId;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public Boolean getIsReady() {
		return isReady;
	}
	public void setIsReady(Boolean isReady) {
		this.isReady = isReady;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}

	public Booking(int bookingId, int roomId, int guestId, Date startDate, Date endDate, double totalPrice,
			Boolean isReady, State state) {
		super();
		this.bookingId = bookingId;
		this.roomId = roomId;
		this.guestId = guestId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.totalPrice = totalPrice;
		this.isReady = isReady;
		this.state = state;
	}
	
	public void makeBooking(int roomId, int guestId, Date startDate, Date endDate, double totalPrice) {
		
	}
	
	public Boolean isPaid(int bookingId) {
		return true;
	}
	
	public void Cancel(int bookingId) {
		
	}
	
	public void CheckIn(int bookingId) {
		
	}
	
	public void CheckOut(int bookingId) {
		
	}
	
	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", roomId=" + roomId + ", guestId=" + guestId + ", startDate="
				+ startDate + ", endDate=" + endDate + ", totalPrice=" + totalPrice + ", isReady=" + isReady
				+ ", state=" + state + "]";
	}
}
