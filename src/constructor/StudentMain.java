package constructor;

import field.Employee;

public class StudentMain {
	public static void main(String[] args) {
		Student std1 = new Student("323","홍길덩","ㄱㅇㅎㄱ",3.4);
		System.out.println(std1.stdNo);
		System.out.println(std1.stdName);
		System.out.println(std1.major);
		System.out.println(std1.score);
		System.out.println(std1);
		
		Student[] arr = new Student[10];
		
		
		
		
	}
}
