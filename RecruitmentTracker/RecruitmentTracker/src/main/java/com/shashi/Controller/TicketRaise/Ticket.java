package com.shashi.Controller.TicketRaise;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Ticket {

    @Id
    
    private int TicketRaiseId;

    private String TicketRaiseName;

    
    private String JobTitle;

    private String Description;

    private int NumberOfOpenings;

    public Ticket() {
    	
    }

	public Ticket(int ticketRaiseId, String ticketRaiseName, String jobTitle, String description,
			int numberOfOpenings) {
		super();
		TicketRaiseId = ticketRaiseId;
		TicketRaiseName = ticketRaiseName;
		JobTitle = jobTitle;
		Description = description;
		NumberOfOpenings = numberOfOpenings;
	}

	public int getTicketRaiseId() {
		return TicketRaiseId;
	}

	public void setTicketRaiseId(int ticketRaiseId) {
		TicketRaiseId = ticketRaiseId;
	}

	public String getTicketRaiseName() {
		return TicketRaiseName;
	}

	public void setTicketRaiseName(String ticketRaiseName) {
		TicketRaiseName = ticketRaiseName;
	}

	public String getJobTitle() {
		return JobTitle;
	}

	public void setJobTitle(String jobTitle) {
		JobTitle = jobTitle;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public int getNumberOfOpenings() {
		return NumberOfOpenings;
	}

	public void setNumberOfOpenings(int numberOfOpenings) {
		NumberOfOpenings = numberOfOpenings;
	}

	@Override
	public String toString() {
		return "TicketRaise [TicketRaiseId=" + TicketRaiseId + ", TicketRaiseName=" + TicketRaiseName + ", JobTitle="
				+ JobTitle + ", Description=" + Description + ", NumberOfOpenings=" + NumberOfOpenings + "]";
	}
    


    
    
}
