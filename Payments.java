package week3.day1;

import org.testng.annotations.Test;

public interface Payments {
	
	//non implemented methods-we cannot create method with body
	public void cashOnDelivery();
	public void upiPayments();
	public void cardPayments();
	public void internetBanking();

	//Cannot have main method in Interface
	//Cannot create any object
}
