package generic;

public class TestGenericDriver {

	public static void main(String[] args) {
		
		TestGeneric<String> testString=new TestGeneric<String>("Hello This is test");
		testString.showType();
		
		TestGeneric<Integer> testInteger=new TestGeneric<Integer>(20);
		testInteger.showType();
	}
}
