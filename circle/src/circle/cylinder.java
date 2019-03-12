package circle;

public class cylinder extends circle2{
	double height;
	public cylinder()
	{
		height=1.0;
	}
	public cylinder(double radius,String color,double height) 
	{
		super(radius,color);
		
		this.height=height;
		
	}
	
	public double getArea()
	{
		System.out.println("cylinder");
		return 2*Math.PI;
	}
	public double getvolume()
	{
		return super.getArea()*height ;
	}
	void show()
	{
		System.out.print("sub class: ");
		System.out.println(this.radius+" "+this.color+" "+this.height+"\n");
		System.out.println("super class: "+ super.radius+" color:" +super.color);
	}
	
}
