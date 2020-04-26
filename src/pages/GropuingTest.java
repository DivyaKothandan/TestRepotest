package pages;

import org.testng.annotations.Test;

public class GropuingTest {
	@Test(priority=1,groups="A")
	public void Gbook() {
		System.out.println("Grouping booking test");
	}
	
	@Test(priority=0,description="Registration of the application",groups="A")
	public void Gregister() {
		System.out.println("Grouping Registration test");
	}
	
	@Test(priority=-3, enabled=false,groups="B")
	public void Gcancel() {
		System.out.println("Grouping Canceling test");
	}
	
	@Test(priority=2,groups="Regression")
	public void GticketDetails() {
		System.out.println("Grouping TicketDetails test");
	}
}
