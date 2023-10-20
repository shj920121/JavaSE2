package access;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee e1 = new Employee("100","홍길등",200,"Jva");
			
//		e1.salary = -1000; // 외부에서 변경가능 -> private으로 외부에 공개 변경 x
		e1.setSalary(20000);
		System.out.println(e1.getSalary());
		e1.printEmployeeInfo();	
	}
}
