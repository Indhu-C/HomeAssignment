package week2.day4;

public class Amazon extends CanaraBank implements Payments{

	public static void main(String[] args) {
		Amazon amazon= new Amazon();
		
		amazon.cardPayments();
		amazon.cashOnDelivery();
		amazon.internetBanking();
		amazon.upiPayments();
		
		amazon.recordPaymentDetails();
	}

	@Override
	public void cashOnDelivery() {
		System.out.println("Cash On Delivery accepted");
	}

	@Override
	public void upiPayments() {
		System.out.println("upiPayments accepted");
	}

	@Override
	public void cardPayments() {
		System.out.println("cardPayments accepted");
	}

	@Override
	public void internetBanking() {
		System.out.println("internetBanking accepted");
	}

	@Override
	void recordPaymentDetails() {
		System.out.println("Payment Dtl recorded");
	}

}
