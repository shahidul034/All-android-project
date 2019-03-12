package practise5;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args){
		/*Container<Object>ob2=new Container<Object>();
		Container<String>str=new Container<String>();
		String s=new String();
		Object object=s;
		Object ob=new Object();
	}
		//ArrayList<object>lst=new ArrayList<String>();
		//List<String>strLst=new ArrayList<String>();
		//List<Object>objLst=strList;
}
	public static void printList(List<Object>lst){
		for(Object o:lst){
			System.out.println(o);
		}
	}*/
		
		ArrayList<Integer>ArrayInt=new ArrayList<Integer>();
		ArrayList<Integer>ArrayInt2=new ArrayList<Integer>();
		ArrayInt2.add(67);
		ArrayInt2.add(34);
		ArrayInt2.add(98);
		ArrayInt.add(34);
		ArrayInt.add(74);
		ArrayInt.add(78);
		ArrayInt.addAll(ArrayInt2);
		for(Integer a:ArrayInt){
			System.out.println(a);
		}
		ArrayInt.remove(98);
		for(Integer a:ArrayInt){
			System.out.println(a);
		}
	
	
}
	
}