package Lambda_16_9;

import java.util.function.Consumer;

public class TypeInference2{
	
	//type inference can help identify the type of Functional Interface being implemented
	// it automatically identifies that the 'Object' type refers to String
	Object o1 = (Consumer<String>) ( (String msg) -> System.out.println(msg.length())); 
	
	// the context of lambda expression must contain enough info to identify the receiving FI
	
	
	/* *************************** */
	
	// type inference can be used to identify type of parameter
	
	// this will compile but under the hood, the type of parameter will be object(by default) and not string
	Consumer<?> c2 = msg -> System.out.println(msg);
	
	// this will give error as msg is of type length and type of msg will be assigned as object, as explained above
	// and object does not have a function length()
	// Consumer<?> c3 = msg -> System.out.println(msg.length());
	
	
	// this willbe perfect solution
	Consumer<?> c4 = (String msg) -> System.out.println(msg.length());
	
	
	
	
}
