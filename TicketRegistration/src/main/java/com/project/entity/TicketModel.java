package com.project.entity;

public class TicketModel {
	private String firstName;
	private String lastName;
	private String boardingplace;
	private String destination;
	private String section;
	private String seatNo;
	private double price;
	private String emailid;
	public TicketModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public TicketModel(String firstName, String lastName, String boardingplace, String destination, String section,
			String seatNo, double price, String emailid) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.boardingplace = boardingplace;
		this.destination = destination;
		this.section = section;
		this.seatNo = seatNo;
		this.price = price;
		this.emailid = emailid;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBoardingplace() {
		return boardingplace;
	}
	public void setBoardingplace(String boardingplace) {
		this.boardingplace = boardingplace;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(String seatNo) {
		this.seatNo = seatNo;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	@Override
	public String toString() {
		return "TicketModel [firstName=" + firstName + ", lastName=" + lastName + ", boardingplace=" + boardingplace
				+ ", destination=" + destination + ", section=" + section + ", seatNo=" + seatNo + ", price=" + price
				+ ", emailid=" + emailid + "]";
	}

	
}

