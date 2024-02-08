package com.project.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ticketdetails")
public class Ticket {
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private Integer ticketno;
		private String boardingplace;
		private String destination;
		private String section;
		private String seatNo;
		private double price;
		private String emailid;
		public Integer getTicketno() {
			return ticketno;
		}
		public void setTicketno(Integer ticketno) {
			this.ticketno = ticketno;
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
		public Ticket(Integer ticketno, String boardingplace, String destination, String section, String seatNo,
				double price, String emailid) {
			super();
			this.ticketno = ticketno;
			this.boardingplace = boardingplace;
			this.destination = destination;
			this.section = section;
			this.seatNo = seatNo;
			this.price = price;
			this.emailid = emailid;
		}
		public Ticket() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "Ticket [ticketno=" + ticketno + ", boardingplace=" + boardingplace + ", destination=" + destination
					+ ", section=" + section + ", seatNo=" + seatNo + ", price=" + price + ", emailid=" + emailid + "]";
		}
		
		
		
	}
