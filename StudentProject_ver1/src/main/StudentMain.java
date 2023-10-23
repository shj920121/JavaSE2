package main;

import java.util.Scanner;

import service.StudentService;

public class StudentMain {
	/*
	 * -----학적관리프로그램----- 1. 학생정보 등록 2. 학생정보 검색 3. 학생정보 수정 4. 학생정보 삭제 5. 학생정보 전체 조회
	 * 0. 프로그램 종료 원하시는 번호를 입력하세요 :
	 * 
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentService service = new StudentService(); // StudentService 다른 패키지라서 임포트 해줘야한다

		while (true) {
			// 메뉴출력
			System.out.println("-----학적관리프로그램-----");
			System.out.println("1. 학생정보 등록");
			System.out.println("2. 학생정보 검색");
			System.out.println("3. 학생정보 수정");
			System.out.println("4. 학생정보 삭제");
			System.out.println("5. 학생정보 전체 조회");
			System.out.println("6. 석차1등 학생 조회");
			System.out.println("7. 이름으로 학생조회");
			System.out.println("0. 프로그램 종료");
			System.out.print("원하시는 번호를 입력하세요 : ");
			// 메뉴 번호를 입력 받음
			int no = sc.nextInt();
			sc.nextLine();
			// 0입력시 반복문 종료
			if (no == 0)
				break;

			// 메뉴번호에 해당하는 기능을 실행 - switch
			switch (no) {
			case 1:
				service.registerStudent(sc);
				break;
			case 2:
				service.searchStudent(sc);
				break;
			case 3:
				service.updateStudent(sc);
				break;
			case 4:
				service.deleteStudent(sc);
				break;
			case 5:
				service.printAllStudent(); // ctrl 1 enter
				break;
			case 6:
				service.topRankStudent();
				break;
			case 7:
				service.searchNameStudent(sc);
				break;
			}
		}
	}

}