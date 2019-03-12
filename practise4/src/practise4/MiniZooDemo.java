package practise4;

public class MiniZooDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal[] animals=new Animal[3];
		animals[0]=new Tiger(4);
		animals[1]=new Lion(4);
		animals[2]=new Deer(4);
		MiniZoo minizoo=new MiniZoo(animals);
		minizoo .putThemOnSleep();
		minizoo.printDietAllAnimal();
		B b=new B(45);
		
		

	}

}
