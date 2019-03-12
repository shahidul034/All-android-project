package practise3;

public class DrawingBoard {
	public void draw(Shape shape){
		System.out.println("Drawing a shape: "+ shape.getName());
		String typename=shape.getClass().getTypeName();
		String superclassType=shape.getClass().getSuperclass().getTypeName();
		System.out.println("Typename: "+typename);
		System.out.println("superclassType: "+superclassType);
	}

}
