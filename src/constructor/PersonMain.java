package constructor;

public class PersonMain {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "김철수";
		p1.age = 20;
		
		System.out.println(p1.name + " " + p1.age);
		
		Person p2 = new Person("홍길동", 11);
		System.out.println(p2.name + " " + p2.age);
		
		Person p3 = new Person("이양희");
		System.out.println(p3.name + " " + p3.age);
		
		
	}
}

 

			
		
