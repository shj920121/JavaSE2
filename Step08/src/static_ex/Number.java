package static_ex;

public class Number {
	private static Number instance = new Number(); // static이어도 여기서는 private에 접근할 권한이 있다.
	
	
//	private static int count // static 따로 초기화 안해주면 기본적으로 0으로 초기화해줌
	private static int count = 0;
	
//	private 생성자는 외부에서 생성을 못하게 막음
	
	private Number() {
		System.out.println("Number 객체 생성 완료");
		count++;
	}

	public static Number getInstance() {
		if(instance == null)
			instance = new Number();  // instance에 문제가 생겨 없어져도 다시 생성
		return instance;
	}

	public static int getCount() {
		return count;
	}
	
	
	
}
