class Employee {
	private String name;
	private int idNumber;
	private String department;
	private double salary;
	
	public String getName() {
		return name;
	}
	public int getIdNumber() {
		return idNumber;
	}
	public String getDepartment() {
		return department;
	}
	public double getSalary() {
		return salary;
	}
	public void setName(String x) {
		this.name = x;
	}
	public void setIdNumber(int x) {
		this.idNumber = x;
	}
	public void setDepartment(String x) {
		this.department = x;
	}
	public void setSalary(double x) {
		this.salary = x;
	}
}
public class EmployeeTest {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		e1.setName("Jerin");
		e1.setIdNumber(1001);
		e1.setDepartment("Front-end");
		e1.setSalary(75000);
		e2.setName("Vivek");
		e2.setIdNumber(1004);
		e2.setDepartment("Back-end");
		e2.setSalary(70000);
		System.out.print(e1.getName() + " ");
		System.out.println(e1.getIdNumber());
		System.out.println(e1.getDepartment());
		System.out.println(e1.getSalary());
		System.out.print(e2.getName() + " ");
		System.out.println(e2.getIdNumber());
		System.out.println(e2.getDepartment());
		System.out.println(e2.getSalary());
	}

}
