package com.shashi.Controller.TicketRaiseRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.shashi.Controller.TicketRaise.Ticket;


public interface TicketRaiseRepository extends JpaRepository<Ticket, Integer>{
	@Query("SELECT COUNT(DISTINCT t.JobTitle) FROM Ticket t")
    long countDistinctJobTitle();

}
