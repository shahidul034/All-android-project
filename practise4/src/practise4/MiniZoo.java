package practise4;

public class MiniZoo {
	private Animal[] animals;
	public MiniZoo(Animal[] animals){
		this.animals=animals;
	}
	public void putThemOnSleep(){
		for(Animal animal:animals){
			animal.sleep();
		}
	}
	public void printDietAllAnimal(){
		for(Animal animal:animals ){
			String diets=animal.getDiets();
			String name=animal.getClass().getSimpleName();
			System.out.println(name+" eats "+diets+".");
		}
	}


}
