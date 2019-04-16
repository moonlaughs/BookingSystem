package application;

import java.util.Date;

public class Payment {

	private int paymentId;
	private Date date;
	
	public int getPaymentId()
	{
		return paymentId;
	}
	
	public Date getDate()
	{
		return date;
	}
	
	public Payment(int paymentId, Date date)
	{
		this.paymentId = paymentId;
		this.date = date;
	}
	
	public void pay(int bookingId)
	{
		
	}
}
