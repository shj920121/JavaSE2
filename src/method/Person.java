package method;
/*
 * 
 * 메서드는 클래스에서 기능을 담당하는 부분
 * 
 * 리턴타입 메서드형([매개변수].....) {
 * 		return 결과값; -> 리턴타입 void가 아닐때는 반드시 나와야 됌
 * }
 */
public class Person {
// 이름, 나이, 성별
//	전체 필드 초기화하는 생성자
//	toString
/*
 * 	
 */
	String name;
	int age;
	boolean gender;
	
	public Person() {}

	public Person(String name, int age, boolean gender) {
	
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
//이름을 수정하는 메서드
	void updateName(String name) {
		this.name = name;
	}

	//인적정보를 출력하는 기능 -> 이름 나이 남자/여자
	void printPersonInfo() {
		System.out.println(name + " " + age + " " + (gender ? "남자" : "여자"));
	// true : 남자 , false : 여자
	}
	
	//성별 정보를 외부로 보내는 메서드	남자/여자
	String getGender() { // 기능하는데 다른데이터가 필요없어서 ()만 쓴다. return 필요
//		if(gender)
//			return "남자";
//		else
//			return "여자";
		return gender ? "남자" : "여자";
	}
	
	//toString
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	 

	
}
