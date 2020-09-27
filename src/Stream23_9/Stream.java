package Stream23_9;

interface Actor{
	
	void act();
	void sing();
	
	// since java 8, we can define default methods in interface
	default void comedy() {
		System.out.println("comedy ");
	}
	
}


public class Stream implements Actor{

	@Override
	public void act() {
		System.out.println("acting");
	}

	@Override
	public void sing() {
		System.out.println("singing");
	}
	
	public void dance() {
		System.out.println("dancing");
	}
	
	
	
}
