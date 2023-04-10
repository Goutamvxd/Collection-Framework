package interfaceDemo;

public interface Interface1 {

	boolean push(int n);
	int pop();
	int top();
	
	default void displayElements() {
		System.out.println("The class needs to implement it's version,"+""
				+ "This message is from Interface code, This message will be displayed"+
				"if class object call me without implementngme");
	}
}
