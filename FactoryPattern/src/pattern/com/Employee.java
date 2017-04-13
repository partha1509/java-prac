package pattern.com;

public class Employee {

	private String name;
	public static int count;
	private static Employee emp;
	
	{
		count++;
	}

	public static Employee getEmployee(String name) {
		emp = new Employee(name);
		return emp;
	}

	private Employee(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	public String toString(){
		return name;
		
	}

}
