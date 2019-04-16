package application;

import java.util.Date;

public class Guest {

	private int guestId;
	private String firstname;
	private String surname;
	private String emailAddress;
	private int idCardNo;
	private int accountNo;
	private Date expiryDate;
	private int seureCode;
	
	public int getGuestId() {
		return guestId;
	}
	public void setGuestId(int guestId) {
		this.guestId = guestId;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public int getIdCardNo() {
		return idCardNo;
	}
	public void setIdCardNo(int idCardNo) {
		this.idCardNo = idCardNo;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	public int getSeureCode() {
		return seureCode;
	}
	public void setSeureCode(int seureCode) {
		this.seureCode = seureCode;
	}

	public Guest(int guestId, String firstname, String surname, String emailAddress, int idCardNo, int accountNo,
			Date expiryDate, int seureCode) {
		this.guestId = guestId;
		this.firstname = firstname;
		this.surname = surname;
		this.emailAddress = emailAddress;
		this.idCardNo = idCardNo;
		this.accountNo = accountNo;
		this.expiryDate = expiryDate;
		this.seureCode = seureCode;
	}
	
	@Override
	public String toString() {
		return "Guest [guestId=" + guestId + ", firstname=" + firstname + ", surname=" + surname + ", emailAddress="
				+ emailAddress + ", idCardNo=" + idCardNo + ", accountNo=" + accountNo + ", expiryDate=" + expiryDate
				+ ", seureCode=" + seureCode + "]";
	}
	
}
