package ex;
import java.util.Scanner;

public class TVMain {

	public static void main(String[] args) {
		TV tv = new TV();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			//메뉴 출력
			System.out.println("1. TV 전원 OnOff");
			System.out.println("2. 채널 Up");
			System.out.println("3. 채널 Down");
			System.out.println("4. 음량 Up");
			System.out.println("5. 음량 Down");
			System.out.println("6. 음소거 OnOff");
			System.out.println("0. 프로그램 종료");
			System.out.print("원하시는 번호를 입력하세요 : ");
			int no = sc.nextInt();
			
			if(no == 0) break;
			
			tv.remote(no);
		}
	}

}