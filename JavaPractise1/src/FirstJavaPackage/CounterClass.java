package FirstJavaPackage;

public class CounterClass {
	 int i = 1;
	static int j = 0;
	
	public CounterClass(){
		i++;
		j++;
		
		System.out.println("Value of i " + i);
		System.out.println("Value of j " + j);
	}

	public static void main(String[] args) {
		
		CounterClass counter = new CounterClass();
		CounterClass counter1 = new CounterClass();
		CounterClass counter2 = new CounterClass();
		
//		System.out.println(counter.i);
//					System.out.println(j);
	}

}