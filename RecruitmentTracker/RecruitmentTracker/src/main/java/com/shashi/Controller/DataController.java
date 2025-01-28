package com.shashi.Controller;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shashi.Controller.TicketRaise.Ticket;

import com.shashi.Controller.TicketRaiseRepository.TicketRaiseRepository;
import com.shashi.Controller.Users.Users;
import com.shashi.Controller.UsersRepository.UsersRepository;

@RestController
@CrossOrigin("http://localhost:4200")
public class DataController {
	
	@Autowired
	UsersRepository usersRepo;
	
	@Autowired
	TicketRaiseRepository ticketRepo;
	
	@PostMapping("/Verify")
	public ResponseEntity<?> checkUsers(@RequestBody Users user ) {
		
		Users founduser=usersRepo.findByEmailAndPassword(user.getEmail(),user.getPassword());
		if(founduser!=null) {

			System.out.println("Shahsi");
					System.out.println(founduser);
					System.out.println("post method called");
					return ResponseEntity.ok().body(founduser);
		}
		else 
		{
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("{\"error\":\"Invalid credentials\"}");
		}
		
	}
	@PostMapping("/Ticket")
	public ResponseEntity<?> storeTicketRaise(@RequestBody Ticket ticketRaise) {
	    try {
	        // Save the TicketRaise object to the database
	        Ticket savedTicketRaise = ticketRepo.save(ticketRaise);

	        // Get the count of distinct TicketRaiseName values
	        long distinctCount = ticketRepo.countDistinctJobTitle();

	        System.out.println("ticketraise");

	        // Return the count along with the saved object
	        return ResponseEntity.ok(Map.of(
//	            "savedTicketRaise", savedTicketRaise,
	            "distinctTicketRaiseNameCount", distinctCount
	        ));
	    } catch (Exception e) {
	        // Handle exceptions and return an error response
	        return ResponseEntity.status(500).body("An error occurred while saving the ticket: " + e.getMessage());
	    }
	}
	 @GetMapping("/allTickets")
	    public ResponseEntity<List<Ticket>> getAllTickets() {
	        try {
	            // Fetch all tickets from the database
	            List<Ticket> tickets = ticketRepo.findAll();

	            // Return the tickets in the response
	            return ResponseEntity.ok(tickets);
	        } catch (Exception e) {
	            // Handle exceptions and return an error response
	            e.printStackTrace();
	            return ResponseEntity.status(500).body(null);
	        }
	    }


}
