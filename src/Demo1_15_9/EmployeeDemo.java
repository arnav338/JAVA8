package Demo1_15_9;

import java.util.Comparator;

public class EmployeeDemo {

	public static void main(String[] args) {
		Employee mike = new Employee("Mike", 2000);
		Employee dave = new Employee("Dave", 3000);

		Comparator<Employee> c = new Comparator<Employee>() {
			public int compare(Employee o1, Employee o2) {
				return o1.getName().compareTo(o2.getName());
			}
		};

		System.out.println("hi");
		System.out.println(c.compare(mike, dave));
		
		// this will give null pointer exception as the method c.compare() tries to implement null.getName()
		//System.out.println(c.compare(mike, null));
		
		
		// Returns a null-friendly comparator that considers null to be greater than non-null. 
		// When both are null, they are consideredequal. 
		// If both are non-null, the specified Comparator is usedto determine the order.
		// basically we are creating a comparator c1 that accepts null and if no input is null,then acts according to comparator 'c'
		Comparator<Employee> c1 = Comparator.nullsLast(c);
		System.out.println(c1.compare(mike, null));
		
		
	}

}
