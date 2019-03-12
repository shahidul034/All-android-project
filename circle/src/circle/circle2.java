package circle;
import java.lang.Math;
import java.lang.String;
public  class circle2 {
	double radius;
	String color;
	public  circle2(double radius,String color)
	{
		this.radius=radius;
		this.color=color;
	}
	public circle2()
	{
		this.radius=1.0;
		this.color="red";
	}
	public double getArea()
	{
		System.out.println("circle");
		return radius*radius*Math.PI;
	}
	
}
