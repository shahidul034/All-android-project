package practise5;

public class Stats<T extends Number> {
	T[] nums;
	public Stats(T[] nums){
		this.nums=nums;
	}
	double average(){
		double sum=0.0;
		for(T num :nums){
			sum+=num.doubleValue();
		}
		return sum/nums.length;
	}  

}
