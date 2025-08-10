public class TicketInTicketOut implements Payment {
	public String toString() {
		return "Ticket-in, ticket-out payment system";
	}
	
	@Override
	public String getType() {
		return "ticketinticketout";
	}
	
	@Override
	public String getDescription() {
		return "Ticket-in, ticket-out payment system";
	}
}
