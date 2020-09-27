package Demo1_15_9;

public interface Example2 {
	
	// this is not allowed in interface in java 8;
	// i.e, we cant have intance fields in interfaces 
	// public int a;
	
	// however a class can have instance fields 
	public class Car{
		private int tyre;
	}
	
	// by default, it is public static
	void sample(int number);
	
	// by default, it is public static final
	double number2 = 2.0;
	
	// if we do not declare it static, java prompts us to declare it static or default 
	// Since java 8 we can now declare body of methods along with its signature 
	static void example() {
		System.out.println("hi");
	}
	
	// default method can also have body
	// when a class will inherit this interface, the keyword 'default' may or may not be written while overriding this method
	// as shown in example3 file
	default void exampe2() {
		
	}
	
}
