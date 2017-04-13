package pattern.com;

public class FactoryPatternApplication {

	public static void main(String[] args) {

		Employee emp = Employee.getEmployee("Partho");		
		System.out.println("This is object no: " +Employee.count);
		System.out.println(emp);
		
		Employee emp1 = Employee.getEmployee("Shabaz");
		System.out.println("This is object no: " +Employee.count);
		System.out.println(emp1);
		
		Employee emp2 = Employee.getEmployee("Nadem");
		System.out.println("This is object no: " +Employee.count);
		System.out.println(emp2);
		
		Employee emp3 = Employee.getEmployee("Zaheer");
		System.out.println("This is object no: " +Employee.count);
		System.out.println(emp3);
		
		Employee emp4 = Employee.getEmployee("Sachin");
		System.out.println("This is object no: " +Employee.count);
		System.out.println(emp4);
		
		Employee emp5 = Employee.getEmployee("Saurav");
		System.out.println("This is object no: " +Employee.count);
		System.out.println(emp5);
		
		Employee emp6 = Employee.getEmployee("Kohli");
		System.out.println("This is object no: " +Employee.count);
		System.out.println(emp6.toString());
		

		
	}
}
