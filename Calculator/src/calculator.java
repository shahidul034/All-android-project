import java.util.Scanner;
public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array={3,4,5,6,7,8,7,9};
		System.out.println("Enhanced for loop: ");
		for(int a:array){
			System.out.print(a+" ");
		}
		calculate cal=new calculate();
		calculator2 cal2=new calculator2();
		Scanner sc=new Scanner(System.in);
		while(true){
		System.out.println("Enter your operation : add(1),sub(2),multiplication(3),Division(4),(0) to break:\n");
		int op=sc.nextInt();
		if(op==5)break;
		if(op==1){
			System.out.println("Addition: "+cal.add());
		}
		else if(op==2){
			System.out.println("Subtraction: "+cal.sub());
		}
		else if(op==3){
			System.out.println("multiplication: "+cal.multiplication());
		}
		else if(op==4){
			System.out.println("Division: "+cal.Division());
		}
		System.out.println("Enter your marks: ");
		System.out.println("your total mark: "+cal2.Total_marks());
		System.out.println("set roll&pass: \n");
		roll_pass r_l=new roll_pass();
		r_l.set(1507034,902354);
		r_l.show();
		

	}

}
}
