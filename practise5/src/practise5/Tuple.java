package practise5;

public class Tuple<X,Y> {
	private X x;
	private Y y;
	public Tuple(X x,Y y){
		this.x=x;
		this.y=y;
	}
	public X getX(){
		return x;
	}
	public Y getY(){
		return y;
	}
	public void showTypes(){
		System.out.println("Type of X is: "+x.getClass().getSimpleName()+ " and Value : "+x);
		System.out.println("Type of Y is : "+y.getClass().getSimpleName()+" and Value: "+y);
	}

}
