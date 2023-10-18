package field;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.employeeNo = "1231233";
		e1.name = "홍길동";
		e1.department = "총무부";
		e1.salary = 2000;
		
		System.out.println(e1.employeeNo + " " + e1.name + " " + e1.department + " " + e1.salary);
		
		Scanner sc = new Scanner(System.in);
		Employee e2 = new Employee();
		//사원 정보를 입력 받아서 출력
		//문자열은 nextLine()으로 입력
		//숫자는 nextInt()로 입력
		//사번, 이름, 급여, 부서명 순으로 입력
		System.out.print("사번 입력 > ");
		e2.employeeNo = sc.nextLine();
		System.out.print("이름 입력 > ");
		e2.name = sc.nextLine();
		System.out.print("급여 입력 > ");
		e2.salary = sc.nextInt();
		sc.nextLine();
		System.out.print("부서명 입력 > ");
		e2.department = sc.nextLine();
		
		//출력
		System.out.println(e2.employeeNo + " " + e2.name + " " + e2.department + " " + e2.salary);
	}

}









