package week3.day1;

public class Amazon extends CanaraBank{

	@Override
	public void cashOnDelivery() {	
		System.out.println("cashOnDelivery");//
	}

	@Override
	public void internetBanking() {
			
	}
	
	public void testClass() {
		System.out.println("testClass");
	}
	
	public static void main(String[] args) {
		Amazon objAmazon = new Amazon();
		objAmazon.cashOnDelivery();
		objAmazon.upiPayments();
		objAmazon.Test1();
		objAmazon.testClass();
	}
}
