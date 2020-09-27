package Lambda_19_9;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Demo2 {

	/*
	 * A lambda expression is said to be capturing if it either access instance
	 * variables of it's enclosing class or local variables (final or effectively
	 * final) from it's enclosing scope.
	 * 
	 * We could say that a variable is effectively final if the compiler wouldn't
	 * complain were we to declare it final.
	 * 
	 * A non-capturing lambda doesn't use any variables from outside.
	 * 
	 * 
	 * Non-capturing lambdas generally are considered more efficient than the
	 * capturing ones as they are evaluated only once.
	 * 
	 * 
	 */

	public static void main(String[] args) {
		Demo2 test = new Demo2();
		test.returnConsumer().accept("Hello");
		test.returnConsumerWithInstanceVariable().accept("Hello");
		test.returnConsumerWithLocalFinalVariable().accept("Hello");
	}

	final String string = " world!";

	Consumer<String> returnConsumer() {
		return ((s) -> {
			System.out.println(s);
		});
	}

	Consumer<String> returnConsumerWithInstanceVariable() {
		return ((s) -> {
			System.out.println(s + string);
		});
	}

	Consumer<String> returnConsumerWithLocalFinalVariable() {

		String foo = " you there!";
		// foo = "";
		// if now we change value of foo, it will give error

		return ((s) -> {
			System.out.println(s + foo);
		});
	}
	
	/*
	Supplier<Integer> incrementer(int start) {
		  return () -> start++;
		}
	
	 * The basic reason this won't compile is that the lambda is capturing the value of start, meaning making a copy of it
	 * start is a local variable, and we are trying to modify it inside of a lambda expression.
	 * 
	 * To make this run 
	 * private int start = 0;
 
      Supplier<Integer> incrementer() {
          return () -> start++;
        }
	 * 
	 * */
	
}
