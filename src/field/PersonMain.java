package field;

public class PersonMain {
	public static void main(String[] args) {
//		Person p1; //참조형은 new로 메모리 할당이 필요하다
		Person p1 = new Person(); 
		
//출력 내용 예상해보기		
		System.out.println(p1.name + " " + p1.age);
//p1에 데이터 저장
		p1.name = "홍길동";
		p1.age = 20;
		System.out.println(p1.name + " " + p1.age);
		
		
		Person p2 = new Person();
		p2.name = "홍글동";
		p2.age = 21;
		System.out.println(p2.name + " " + p2.age);
		
		
	}
}
