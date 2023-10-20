package ex;
/*
 * 에어컨
 * 		필드 
 * 			온도 , 전원, 모드, 세기, 각도, 타이머
 * 		기능 
 * 			전원On/Off , 온도 UP/Down, 모드변경, 바람세기설정 , 타이머설정, 바람각도설정
 * 
 * 		온도 - int /double 18~32
 * 		전원	- boolean
 * 		모드 - 냉방 0, 송풍 1, 제습 2 - 0 1,2,3 int
 * 		바람세기 - 약 0 중 1 강 2 자동 3 - 0 1,2,3,4 int
 * 		바람각도 - 자동 , 고정 - boolean
 * 		타이머 - int 0(취소)~4시간
 * 
 */
public class Aircon {
	private final int MAX_TEMP = 32;
	private final int MIN_TEMP = 18;
	
	
	//1. 필드
	public double temp;
	public boolean power;
	public int mode;
	public int windPower;
	public boolean windAngle;
	public int timer;
	
	//2. 생성자 = 기본생성자로 생성해서 알맞는 값으로 초기화
	public Aircon() {
		temp = 24;
	}
	
	
	//3. 전원켜고 끄는 메서드 작성
	public void powerOnOff() {
		//true 전원 on false 전원 off
		power = !power;
		System.out.println(power ? "에어컨 전원 ON" : "에어컨 전원 OFF");
		
	}
	
	//온도 조절
	public void tempUp() {
		if(!power) return; // 전원 OFF시 못하게
		if(temp < MAX_TEMP)
		System.out.println("현재 온도: " + temp++);
		else System.out.println("최고 온도입니다! " + temp);
		
	}
	
	public void tempDown() {
		if(!power) return; 
		if(temp > MIN_TEMP)
		System.out.println("현재 온도: " + temp--);
		else System.out.println("최저 온도입니다! " + temp);
	}
	
	//운전 모드 변경 메서드 0 냉방  1 송풍  2 제습
	
	public void changeMode() {
		
		mode++;
		mode %= 3; // 순환 0 1 2 0 1 2 0 1 2  ex) mode++ %= 3; (x) 결과값을 바로 주지 않기때문에
		
		if(!power) return;
		 switch(mode) {
		 case 0: 
			 System.out.println("냉방모드");
			 break;
		 case 1:
			 System.out.println("송풍모드");
			 break;
		 case 2:
			 System.out.println("제습모드");
			 break;
		 }
	}
	// 바람세기 : 자동, 약풍, 중풍, 강풍
	
	// 바람각도 : 자동, 고정
	
	// 타이머는 4시간까지만 적용, 1시간뒤 꺼집니다. 타이머를 해제합니다.
	
	public void changeWindPower() {
		if(!power) return;
		windPower++;
		windPower %= 4; // 순환
		switch(windPower) { // 하드웨어는 메모리가 작아서 배열보단 스위치로
		case 0 :
			System.out.println("약풍");
			break;
		case 1 :
			System.out.println("중풍");
			break;
		case 2 :
			System.out.println("강풍");
			break;
		case 3 :
			System.out.println("자동");
			break;
	}
}
		// 바람각도 : 자동, 고정
		public void changeWindAngle() {
			if(!power) return;
			windAngle = !windAngle;
			System.out.println(windAngle ? "바람각도 : 자동" : "바람각도 : 고정");
		}
	
		public void setTimer() {
			if(!power) return;
			timer++;
			timer %= 5;
		
			switch(timer) {
			case 0 :
				System.out.println("타이머를 해제합니다.");
				break;
			default :
				System.out.println(timer + "시간뒤 꺼집니다.");
			}
			
			
			
	}


		
			public void remote(int no) {
				switch(no) {
				case 1:
					powerOnOff();
					break;
				case 2:
					tempUp();
					break;
				case 3:
					tempDown();
					break;
				case 4:
					changeMode();
					break;
				case 5:
					changeWindPower();
					break;
				case 6:
					changeWindAngle();
					break;
				case 7:
					setTimer();
					break;
				}
			}
}	
	
	
	
	
	
	
	
