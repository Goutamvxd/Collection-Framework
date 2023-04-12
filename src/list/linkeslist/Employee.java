package list.linkeslist;


public class Employee {

	long employee_id;
	String fullname;
	int age;
	
	public Employee(long employee_id, String fullname, int age) {
		super();
		this.employee_id = employee_id;
		this.fullname = fullname;
		this.age = age;
	}

	@Override
	public String toString() {
		return String.valueOf(employee_id);
	}
	
	
	
}
