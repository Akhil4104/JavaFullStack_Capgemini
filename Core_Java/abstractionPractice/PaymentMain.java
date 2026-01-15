package abstractionPractice;

public class PaymentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payment p;
		p=new CreditCardPayment();
		p.processPayment(250);
		p=new UPIPayment();
		p.processPayment(300);
		p=new NetBankingPayment();
		p.processPayment(150);
		

	}

}
