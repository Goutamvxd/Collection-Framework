package generic;

public class TestGeneric<T> {

	T ob;

	public TestGeneric(T o) {
		this.ob = o;
	}
	
	public T value() {
		return this.ob;
	}
	
	public void showType() {
		System.out.println("Type of variable is:"+ob.getClass().getName());
	}
	
	
}
