
public final class roll_pass implements interfaced{
	private int roll;
	private int password;
	void set(int roll){//polymorphism
		roll=roll;
	}
	@Override
	public void set(int roll, int pass) {
		// TODO Auto-generated method stub
		roll=roll;
		password =pass;
		
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("roll: "+roll+" "+"password: :"+password+"\n");
	}
	
	
}
