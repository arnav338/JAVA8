package Lambda20_9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Stream;

import Demo1_15_9.Employee;

public class StreamEx {
	
	final Random rando = new Random();
	Stream<Integer> randoms = Stream.generate(rando::nextInt);
	
	
	public static void main(String[] args) {
		
	    ArrayList<Employee> emp = new ArrayList<>();
	    Employee e1 = new Employee("Ravi", 50000);
	    Employee e2 = new Employee("Sohan", 70000);
	    emp.add(e1);
	    emp.add(e2);
	    
	    
	    Boolean b = emp.stream().allMatch(e -> e.getSalary()>42000);
	    System.out.println(b);
	    
	    Stream<String> num = Stream.of("hi","hello","bonjour");
	    int a = (int) num.count();
		System.out.println(a);
		
		Stream<Integer> fib = Stream.of(1,1,2,2,3);
		fib.forEach(System.out::println);
		// if we try to call the same stream again, it will give an error
		// as the stream has already been used
		fib.forEach(System.out::println);
		
	}
	
	 
	
	
}
