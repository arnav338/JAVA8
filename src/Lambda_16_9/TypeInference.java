package Lambda_16_9;

public class TypeInference {
	
	
	// example of type inference 
	// we have no where specified the type of 'T'
	// but still in main function, when we assign the output of function to 's'
	// it automatically converts it into string
	public static <T> T sample1(T[] array) {
		return array[0];
	}
	
	public static void main(String[] args) {
		
		
		String[] array = {"1","2"};
		// we have specified output of function 'sample1' as 'T'
		// but the compiler automatically knows what to assign to s
		// and typecasts the output to string automatically 
		String s = sample1(array);
		System.out.println(s);
		
		
	}
	
	
}
