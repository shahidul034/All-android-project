package practise4;

public abstract class Animal {
	private int legs;
	public Animal(){}
	public Animal (int legs){
		this.legs=legs;
	}
	public void sleep()
	{
		String name=this.getClass().getSimpleName();
		System.out.println(name +" Sleeping ... dont disturb!!!!");
	}
	public abstract String getDiets();
	
}
