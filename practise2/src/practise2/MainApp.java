package practise2;

public class MainApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CoffeeCup mycup=new CoffeeCup();
		Liquid genericLiquid=new Liquid();
		Coffee coffee=new Coffee();
		Milk milk=new Milk();
		mycup.addLiquid(genericLiquid);
		mycup.addLiquid(milk);
		mycup.addLiquid(coffee);
		

	}


}
