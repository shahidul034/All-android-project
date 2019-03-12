package generics;

public class Container<T> {
	private static final int MAX_LENGTH = 10;
	private T[] items;
	private int curindex = 0;

	public Container() {
		items = (T[]) new Object[MAX_LENGTH];
	}

	public void additem(T item) {
		if (curindex < MAX_LENGTH) {
			items[curindex++] = item;
		} else {
			System.out.println("container is full\n");
		}
	}

	public T getitem(int index) {
		if (index < MAX_LENGTH) {
			throw new IllegalArgumentException("Index not found\n");
		}
		return items[index];
	}

	public void printall() {
		for (int i = 0; i < curindex; i++) {
			System.out.print(items[i] + " ");

		}
		System.out.println();
	}
}
