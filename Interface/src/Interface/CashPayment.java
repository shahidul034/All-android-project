package Interface;

public class CashPayment implements payment {

	@Override
	public long getAmount() {
		// TODO Auto-generated method stub
		System.out.println("Taking cash payment");
		return 500;
	}

}
