
public class thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1=new Thread(){
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=1;i<=10;i++){
				System.out.println("printing..."+i*5+"\n");
				try {
					sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			}
			
		};
		t1.start();

	}

}
