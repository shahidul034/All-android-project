package practise2;

public class CoffeeCup {
	private Liquid innerLiquid;
	void addLiquid(Liquid liq)
	{
		innerLiquid=liq;
		//swirl clockwise
		innerLiquid.swirl(false); 
	}

}
