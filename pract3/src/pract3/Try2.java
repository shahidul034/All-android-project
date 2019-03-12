package pract3;

import java.util.Random;
class table {
	 public void print(int n){
		for(int i=1;i<=n;i++)System.out.println(n*i);
	}
}
public class Try2 {
	public static void main(String[] args) {
		table t = new table();
		Thread t1=new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				t.print(5);

			}
		});
		Thread t2=new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				t.print(4);

			}
		});
		t1.start();
		t2.start();

	}

}
