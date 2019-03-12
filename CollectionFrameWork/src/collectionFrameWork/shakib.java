package collectionFrameWork;

public class shakib<Int,string> extends sss{
	Int a;
	string s;
	public shakib(Int d,string s, String dd){
		this.a=d;
		this.s=s;
		this.name=dd;
	}
	public void show(){
		System.out.println("instance variable: ");
		System.out.println(a+" "+s);
		super.show();
	}
     
}
