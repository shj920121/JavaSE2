package method;

public class CardMain { //헤드퍼스트 디자인패턴 RIDI
	public static void main(String[] args) {
		Card c1 = new Card("홍길동");
		Card c2 = new Card("김철수");
		Card c3 = new Card("이영희");
		Card c4 = new Card("박명수");
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
	}
}
