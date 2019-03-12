package Interface;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaymentEngine paymentengine = new PaymentEngine();
		BkashPayment bkashpayment=new BkashPayment();
		paymentengine.accept(bkashpayment);
		CashPayment cashpayment=new CashPayment();
		paymentengine.accept(cashpayment);

	}

}
