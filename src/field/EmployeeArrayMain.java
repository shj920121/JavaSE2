package field;
/*
 * 길이가 5인 Employee형 배열을 생성
 *배열에 Em ployee 데이터를 Scanner를 이용해서 입력을 받아서 저장한 후에 
 * 배열에 저장된 모든 데이터를 출력
 * 
 */

import java.util.Scanner;

public class EmployeeArrayMain {
	public static void main(String[] args) {
//		길이가 5인 Employee형 배열을 생성
		Employee[] arr = new Employee[3];
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		//배열에 Em ployee 데이터를 Scanner를 이용해서 입력을 받아서 저장한 후에 
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < arr.length; i++) {
			//1. 객체 생성
			arr[i] = new Employee();
			//2. 데이터 입력
			System.out.print("사번 : ");
			arr[i].employeeNo = sc.nextLine();
			System.out.print("이름 : ");
			arr[i].name = sc.nextLine();
			System.out.print("부서 : ");
			arr[i].department = sc.nextLine();
			System.out.print("급여 : ");
			arr[i].salary = sc.nextInt();
			sc.nextLine();
		}
		// 배열에 저장된 모든 데이터를 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].employeeNo + " " + arr[i].name 
					+ " " + arr[i].salary + " " + arr[i].department);
		}
		
		
	

		
	}
}
