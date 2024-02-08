package com.project.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.entity.Ticket;
import com.project.entity.TicketModel;
import com.project.entity.User;
import com.project.entity.ViewTicket;
import com.project.repository.TicketRepository;
import com.project.repository.UserRepository;

@Service
public class TicketService {
	@Autowired
	private TicketRepository ticketRepository;

	@Autowired
	private UserRepository userRepository;
	
	public String bookTickets(TicketModel ticket) {
		Ticket newTicket=new Ticket();
		newTicket.setEmailid(ticket.getEmailid());
		newTicket.setBoardingplace(ticket.getBoardingplace());
        newTicket.setDestination(ticket.getDestination());
        newTicket.setSeatNo(ticket.getSeatNo());
        newTicket.setSection(ticket.getSection());
        newTicket.setPrice(20);
        ticketRepository.save(newTicket);
        
        User user=new User();
        user.setEmailid(ticket.getEmailid());
        user.setFirstName(ticket.getFirstName());
        user.setLastName(ticket.getLastName());
        userRepository.save(user);
		return "Ticket Booked Successfully";
	}

	public ViewTicket viewTickets(String emailid) {
		Ticket ticket=ticketRepository.getByEmailid(emailid);
		Optional<User> user=userRepository.findById(emailid);
		ViewTicket newticket =new ViewTicket();
		newticket.setFirstName(user.get().getFirstName());
		newticket.setLastName(user.get().getLastName());
		newticket.setBoardingplace(ticket.getBoardingplace());
		newticket.setDestination(ticket.getDestination());
		newticket.setSection(ticket.getSection());
		newticket.setSeatNo(ticket.getSeatNo());
		newticket.setPrice(ticket.getPrice());
		newticket.setMsg("Have a safe journey");
		return newticket;
}

	public String removeTicket(Integer ticketno) {
		ticketRepository.deleteById(ticketno);
		return "Ticket has been deleted";
	}

	public String updateSeat(String emailid,Ticket ticket) {
		ticketRepository.save(ticket);
		return "SeatNo has been changed";
	}
	
}
