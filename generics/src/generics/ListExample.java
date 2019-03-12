package generics;

import java.util.*;

public class ListExample {
	public static void main(String[] args) {
		student<Integer,student<Integer,String > >iobj=new student<>(45,new student<>(34,"shakib"));
		//iobj.show();
		student<String,Integer >iobj2=new student<String,Integer >("Shakib",34);
		//iobj2.show();
		Container<Integer>Int=new Container<Integer>();
		Int.additem(23);
		Int.additem(67);
		Int.additem(77);
		//Int.printall();
		Container<String>string=new Container<>();
		Container<Object>ob=new Container<>();
		ob.additem(new Object());
		//String item=string.getitem(0);
		String str=new String();
		Object ob2 =str;
		List<Object>objlist=new ArrayList<Object>() ;
		objlist.add(new Integer(55));
		printList(objlist);
		List<String >strlst=new ArrayList<String>();
		strlst.add("one");
		printList(strlst);
		
		Container <String>places=new Container<>();
			
		
	}
	
	public static void printList(List<?>list){
		for(Object o:list){
			System.out.println(o);
		}
	}
}
