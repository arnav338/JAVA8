package Lambda_19_9;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.Supplier;


import Demo1_15_9.Employee;

public class MethodReference {
	
	
	public static void main(String[] args) {
		
		// static method reference
		Supplier<Thread> s1 = Thread::currentThread;
		
		Employee e =new Employee("ram", 5000);
		
		Integer i = e.getSalary();
		
		// we can also get salary by using this code
		// this is instance method reference, instance specified
		Supplier<Integer> s2 = e::getSalary;
		System.out.println(s2.get());
		
		// instance method reference, instance not specified
		Function<Employee, Integer> f1 = Employee::getSalary;
		Integer ramSalary = f1.apply(e);
		System.out.println(ramSalary);
		
		Comparator<Employee> byName = Comparator.comparing(Employee::getName);
		
	}
	
	
}