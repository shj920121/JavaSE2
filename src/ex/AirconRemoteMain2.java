package ex;

import java.util.Scanner;

public class AirconRemoteMain2 {
	public static void main(String[] args) {
		Aircon aircon = new Aircon();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			//메뉴 출력
			System.out.println("1. 에어컨 전원 ON/OFF");
			System.out.println("2. 온도 UP");
			System.out.println("3. 온도 DOWN");
			System.out.println("4. 모드 변경");
			System.out.println("5. 바람세기 조절");
			System.out.println("6. 바람각도 변경");
			System.out.println("7. 타이머 설정");
			System.out.println("0. 프로그램 설정");
			System.out.println("원하시는 번호를 입력하세요 : ");
			
			int no = sc.nextInt();
			
			if (no == 0) break;
			
		
			
			aircon.remote(no);
			
			
			
		}
	}
}
