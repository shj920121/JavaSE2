package constructor;
//사번, 이름, 부서, 급여
//생성자, toString
public class Employee {
	String emplyoyeeNo;
	String name;
	String department;
	int salary;
	public Employee(String emplyoyeeNo, String name, String department, int salary) {
		
		this.emplyoyeeNo = emplyoyeeNo;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	
	public Employee() {}
	
	@Override
	public String toString() {
		return "Employee [emplyoyeeNo=" + emplyoyeeNo + ", name=" + name + ", department=" + department + ", salary="
				+ salary + "]";
	}
	
	
	
	
}
