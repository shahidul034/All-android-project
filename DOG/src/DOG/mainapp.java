package DOG;

public class mainapp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog1=new Dog();
		Dog dog2=new DesiDog();
		Dog dog3=new BidesiDog();
		if(dog3 instanceof BidesiDog){
		BidesiDog bidesiDog=(BidesiDog)dog3;
		System.out.println(bidesiDog.getName());
		}
		dog1.getType();
		dog2.getType();
		dog3.getType();
		

	}
}
