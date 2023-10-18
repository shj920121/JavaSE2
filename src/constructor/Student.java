package constructor;

public class Student {
	String stdNo;
	String stdName;
	String major;
	double score;
/*
 * this : 자기 자신 객체를 나타냄
 * 		  지역변수가 필드명이랑 같으면 무조건 지역변수에 접근한다.
 * 		  이때 필드에 접근하기 위해서 자기 자신 객체를 this로 정의를 해놓은 키워드
 */
//  alt shift s (소스옵션)
		public Student(String stdNo, String stdName, String major, double score) {
			this.stdNo = stdNo;
			this.stdName = stdName;
			this.major = major;
			this.score = score;
		}
		public Student(String stdNo, String stdName) {
			this.stdNo = stdNo;
			this.stdName = stdName;
		}
		public Student() {
			System.out.println("Student 기본 생성자");
		}
		@Override
		public String toString() {
			return "Student [stdNo=" + stdNo + ", stdName=" + stdName + ", major=" + major + ", score=" + score + "]";
		}
		
	
}
