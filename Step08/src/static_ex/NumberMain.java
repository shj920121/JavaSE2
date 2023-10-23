package static_ex;

public class NumberMain {
	public static void main(String[] args) {
//		Number number = new Number();  // private이라 외부에서 생성 불가
		Number number = Number.getInstance();
		System.out.println(number.getCount());
		System.out.println(number.getCount());
		System.out.println(number.getCount());
		System.out.println(number.getCount());
		
		
	}
}
