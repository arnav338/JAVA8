package Lambda_16_9;

import java.util.Comparator;

import Demo1_15_9.Employee;

public class LambdaDemo {
	
	
	// this is anonymous class concept of implementing functional interfaces 
	// which takes a lot of unnecessary code, which is avoided by using lambda expression
	Comparator<Employee> e1 = new Comparator<Employee>() {
		
		@Override
		public int compare(Employee o1, Employee o2) {
			return o1.getName().compareTo(o2.getName());
		}
	};
	
	// the above code will be replaced by this single line of code by using lambda expression ' -> ' 
	Comparator<Employee> e2 = (a,b) -> a.getName().compareTo(b.getName());
	
	// lambda expression may have multiple lines inside its body
	Comparator<Employee> e3 = (a,b) -> { a.getName().compareTo(b.getName());
	return 0;
	};
	
	// this will lead to compilation error
	// Comparator<Employee> e3 = (a,b) -> return a.getName().compareTo(b.getName());
	
	
}
