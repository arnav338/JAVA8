package Lambda20_9;

import java.util.function.IntBinaryOperator;
import java.util.function.Predicate;

public class FI {
	

	// using functional operator for primitive type
	IntBinaryOperator sum = (a,b) -> a+b;
	
	
	public static void main(String[] args) {
		
		FI f = new FI();
		int c = f.sum.applyAsInt(2,5);
		System.out.println(c);
		
		
	}
	
}
