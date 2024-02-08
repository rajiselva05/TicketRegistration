package com.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.entity.Ticket;
import com.project.entity.TicketModel;
import com.project.entity.ViewTicket;
import com.project.service.TicketService;

@RestController
@RequestMapping("/api")
public class TicketController {
	@Autowired
	private TicketService ticketService;
	
	@PostMapping("/bookticket")
	public ResponseEntity<String> bookTicket(@RequestBody TicketModel ticket){
		String msg=ticketService.bookTickets(ticket);
		return ResponseEntity.ok(msg);
	}
	
	@GetMapping("/viewticket")
	public ResponseEntity<ViewTicket> viewTicket(@RequestParam String emailid){
		ViewTicket ticket=ticketService.viewTickets(emailid);
		return ResponseEntity.ok(ticket);
	}
	@DeleteMapping("/remove")
	public ResponseEntity<String> removeTicket(@RequestParam Integer ticketno){
		String msg=ticketService.removeTicket(ticketno);
		return ResponseEntity.ok(msg);
		}
	@PutMapping("/update/{emailid}")
	public ResponseEntity<String> updateSeat(@PathVariable String emailid,@RequestBody Ticket ticketDetails){
		String msg=ticketService.updateSeat(emailid, ticketDetails);
		return ResponseEntity.ok(msg);
	}
}
	
