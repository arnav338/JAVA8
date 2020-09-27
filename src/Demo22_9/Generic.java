package Demo22_9;

import java.util.ArrayList;

// T is any generic class 
class Container<T>{
	
	T value;
	
	void show() {
		System.out.println(value.getClass().getName());
	}
	
}

// this means this class will accept any object which extends Number (like Integer, Double)
class Container1<T extends Number>{
	
	T value;
	
	void show() {
		System.out.println(value.getClass().getName());
	}
	
	// this means obj can be of any type but it has to extend Number class
	void show1(ArrayList<? extends Number> obj) {
		System.out.println(value.getClass().getName());
	}
	
}

class Container2<T extends Integer>{
	
	T value;
	
	void show() {
		System.out.println(value.getClass().getName());
	}
	
	// this means obj can be of any type that is a super class of Integer (i.e. Number)
	void demo(ArrayList<? super Integer> obj) {
		
	}
	
}

public class Generic {
	
	
	public static void main(String[] args) {
		
		Container<Integer> obj = new Container<>();
		obj.value = 10;
		obj.show();
		
		Object aray[] = new Object[5];
		aray[0] = 1;
		aray[1] = "hello";
		System.out.println(aray[1]);
		
	}
	
}
