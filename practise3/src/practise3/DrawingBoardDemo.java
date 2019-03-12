package practise3;

public class DrawingBoardDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DrawingBoard drawingboard=new DrawingBoard();
		Circle circle=new Circle();
		Square square=new Square();
		drawingboard.draw(circle);
		drawingboard.draw(square);
	}

}
