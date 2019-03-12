package Interface;

public class PaymentEngine {
	public void accept(payment Payment){
		System.out.println("Accepting payment: "+Payment.getAmount());
	} 

}
