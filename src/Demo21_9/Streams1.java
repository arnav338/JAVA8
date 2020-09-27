package Demo21_9;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

class example{
	
	int a = 10;
	Function<Integer, String> demo = a -> { return "hello"; };
	
}

public class Streams1 {
	
	public static void twice(int i) {
		System.out.println(2*i);
	}
	
	public static void main(String[] args) {
		
		List<Integer> num = Arrays.asList(1,2,3,6,5,4);
		
		// External iterations 
		// iterable interface (forEach)
		Iterator<Integer> i = num.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		// Internal Iteration
		// by method reference
		num.stream().forEach(System.out::println);
		
		System.out.println("----");
		num.forEach(j -> System.out.println(j));
		
		System.out.println("---");
		num.forEach(a -> twice(a));
		
		System.out.println("---");
		num.forEach(Streams1::twice);
		
		System.out.println("---");
		example e = new example();
		String s = e.demo.apply(1);
		System.out.println(s);
		
	}	
}