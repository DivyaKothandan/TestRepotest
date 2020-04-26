package utils;

import org.testng.annotations.Test;

public class TestngConcepts {
	
	@Test(priority=1,groups="A")
	public void book() {
		System.out.println("booking test");
	}
	
	@Test(priority=0,description="Registration of the application",groups="A")
	public void register() {
		System.out.println("Registration test");
	}
	
	@Test(priority=-3, enabled=false)
	public void cancel() {
		System.out.println("Canceling test");
	}
	
	@Test(priority=2)
	public void ticketDetails() {
		System.out.println("TicketDetails test");
	}

}
