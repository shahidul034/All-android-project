package generics;

public class student <T,T2>{
	private T obj;
	private T2 s;
	public student(T obj,T2 ob){
		this.obj=obj;
		this.s=ob;
	}
	public T getobj(){
		return obj;
	}
	public void show(){
		System.out.println("Type of T is: "+obj.getClass().getName()+"\n"+"Type of T is: "+s.getClass().getName());
	}

}
