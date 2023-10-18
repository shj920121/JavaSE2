package constructor;
/*
 * 생성자(Constructor)
 * 			생성자는 객체가 하나 생성 될때 제일 먼저 실행되는 메서드
 * 			만약에 생성자를 직접 작성하지 않으면 , 자바 컴파일러가 자동으로 아무런 일도
 * 			안하는 기본 생성자를 추가
 * 		Person(){}
 * 		1. 메서드명이 클래스명과 같다.
 * 		2. 리턴 타입이 없다.
 * 
 */
public class Person {
	String name;
	int age;
	
//같은 형태가 있으면 안된다	
	
	//기본 생성자
	Person() {
		System.out.println("Person 기본 생성자");
	}
	
	// 필드를 초기화 하는 생성자
	Person(String n, int a) { // 매개변수 arguement
		System.out.println("Person(String, int) - 생성자");
		name = n;
		age = a;
	}
	
	//같은 형태가 있으면 안된다		
//	Person(String n, int a) { 
//		System.out.println("Person(String, int) - 생성자");
//		name = n;
//		age = a;
//	}
	
//이름을 외부에서 받아서 초기화, 나이는 0으로 초기화하는 생성자
	Person(String n) {
		System.out.println("Person(String) - 생성자");
		name = n;
		
	}
}
