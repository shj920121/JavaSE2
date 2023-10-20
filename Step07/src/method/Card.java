package method;

public class Card {
/*
 * Card 객체가 생성 될 때 사용자 이름을 받음
 * 카드번호를 하나 읽어와서 필드에 저장
 * 
 * 필드 : 카드번호 , 사용자 이름
 * 생성자
 * 		사용자 이름을 받음, 카드번호는 static에 저장된 숫자를 읽어와서 저장 후 증가
 * 
 * toString도 작성
 * 
 * static에 저장된 발급될 카드번호는 생성자에 하나씩 들어갈때마다 증가 -> 시작번호는 1000부터
 * 
 * 메인에서 테스트하는 코드 ->CardMain
 * 
 *
 */
	private String name;
	private int cardNo;
	
	private static int cardNoSeq = 1000; // sequence 순차

	public Card(String name) {
		
		this.name = name;
		cardNo = cardNoSeq++; // ex) 게시판 글번호
	}

	@Override
	public String toString() {
		return "Card [name=" + name + ", cardNo=" + cardNo + "]";
	}

	
	
	
	
	
	
}
