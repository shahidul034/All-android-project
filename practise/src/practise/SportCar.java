package practise;

public class SportCar extends Car {
	int speed=100;
	public Engine engine;
	public Door[] door;
	
	SportCar()
	{
		engine=new Engine();
		door=new Door[4];
	}
	
	public void printSpeed(){
		System.out.println("Speed: "+speed);
		System.out.println(super.speed);
	}

}
