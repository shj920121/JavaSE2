package field;

import java.util.Scanner;

public class WorkerMain {
	public static void main(String[] args) {
		Worker w1 = new Worker();
		w1.no = "1";
		w1.name = "SHJ";
		w1.department = "Java";
		w1.wage = 500;
		System.out.println(w1.no + " " + w1.name + " " + w1.department + " " + w1.wage);
		
		Scanner sc = new Scanner(System.in);
		Worker w2 = new Worker();
		//사원 정보를 입력받아서 출력
		//문자열은 nextLine()으로 입력
		//숫자는 nextInt()로 입력
		//사번, 이름, 급여, 부서명 순으로 입력
		//출력
		System.out.print("사번 입력 > ");
		w2.no = sc.nextLine();
		System.out.print("이름 입력 > ");
		w2.name = sc.nextLine();
		System.out.print("급여 입력 > ");
		w2.wage = sc.nextInt(); // 숫자입력시 enter가 메모리
		sc.nextLine();			// 
		System.out.print("부서 입력 > ");
		w2.department = sc.nextLine();
		
		
		System.out.println(w2.no + " " + w2.name + " " + w2.wage + " " + w2.department);
		
	}
}
