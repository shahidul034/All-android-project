import java.util.Scanner;

public class calculate {
	Scanner sc=new Scanner(System.in);
	int add(){
		//System.out.println("Enter your number\n");
		int n,ans=0;
		while(true){
			System.out.println("\nenter 0 to finish: ");
			n=sc.nextInt();
			if(n==0)return ans; 
			ans+=n;
		}
	}
		int sub(){
			System.out.println("Enter two number\n");
			int n,n1,ans=0;
			while(true){
				//System.out.println("\nenter 0 to finish: ");
				n=sc.nextInt();
				n1=sc.nextInt();
				ans=n-n1;
				return ans;
			}
			
		}
		int multiplication(){
			System.out.println("Enter two number\n");
			int n1,ans1=1;
			while(true){
				System.out.println("\nEnter 0 to finish: ");
				n1=sc.nextInt();
				if(n1==0)return ans1; 
				ans1=ans1*n1;
			}
			
		}
		float Division(){
			System.out.println("Enter two number\n");
			float n,n1,ans=0;
			while(true){
				//System.out.println("\nenter 0 to finish: ");
				n=sc.nextFloat();
				n1=sc.nextFloat();
				ans=n/n1;
				return ans;
			}	
		}		
}
