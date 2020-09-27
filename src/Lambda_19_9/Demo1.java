package Lambda_19_9;

public class Demo1 {
	
	// final on the other hand indicates that a particular variable cannot change after it is initialized.
    // classes can be declared final which indicates that they cannot be extended:
	public static final int n = 20;
	
	// static fields are fields that do not belong to any particular instance of a class.
	// the static field n isn't associated with any particular instance of C but with the entire class in general 
	// (which is why Demo1.n can be used to access it).
	// When we apply "static" keyword to a method,it means the method can be accessed without creating any instance of the class
	// it belongs to the class and not any instance of the class
	public static int a = 200;
	
	public static void main(String[] args) {
		
		// we can not reassign value to a final variable 
		// hence below code will give error 
		// n=30*40;
		
		// static does not mean that its value cant change 
		// final on the other hand indicates that a particular variable cannot change after it is initialized.
		a = 900;
		System.out.println(a);
		
	}
	
	public static void exmaple() {
		System.out.println("hi");
	}
	
	/*
	Static Keyword:

		* Static keyword is used to do better memory management.
		* You can use static keyword with variable, method, class.
		* If you declare method using static keyword then you don't need to create an object to call that method.
		* If you declare variable as a static then only once memory is created for that variable in class area and not every time when object is created. e.g. in student database you can declare "collage name" as because it common for all students.

		Final Keyword:

		* Final Keyword is used to restrict the user. It means:
		* If you declare variable as final then you cannot change its value.
		* If you declare method as final then you cannot override that method.
		* If you make any class as final, you cannot extend it.
	*/
	
}
