package practise5;

public class Container<T> {
	private static final int MAX_LENGTH=10;
	private T[] items;
	private int current_index=0;
	public Container(){
		items=(T[]) new Object[MAX_LENGTH];
	}
	public void addItem(T item){
		if(current_index<MAX_LENGTH){
			items[current_index++]=item;
		}
		else{
			System.out.println("Container is full");
		}
	}
	public T getItem(int index){
		if(index>MAX_LENGTH){
			throw new IllegalArgumentException("Index can not be larger than max");
		}
		return items[index];
	}
	public void printAll(){
		for(int i=0;i<current_index;i++){
			System.out.print(items[i]+", ");
		}
	}
}
