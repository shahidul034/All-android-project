package Interface;

public class BkashPayment implements payment,OtherInterface {

	@Override
	public long getAmount() {
		// TODO Auto-generated method stub
		System.out.println("Taking Bkash payment");
		return 100;
	}

	@Override
	public void sayBye() {
		// TODO Auto-generated method stub
		System.out.println("say bye");
	}

}
