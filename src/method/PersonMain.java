package method;

public class PersonMain {
	public static void main(String[] args) {
		Person p1 = new Person("홍길동", 20, true);
		p1.updateName("김철수");
		p1.printPersonInfo();
		System.out.println(p1.getGender());
		
	}
}
