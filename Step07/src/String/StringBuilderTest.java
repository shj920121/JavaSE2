package String;

public class StringBuilderTest {
	public static void main(String[] args) {
		/*
		 * String 타입은 문자열 상수로 저장하기 때문에
		 * 문자열을 가지고 값을 변경하는 작업을 수행하면
		 * 매번 새롭게 메모리를 생성해서 결과값을 리턴
		 */
		String str = "Hello";
		System.out.println(System.identityHashCode(str));
		str = str.replace("l","a");
		System.out.println(System.identityHashCode(str));
		str += 10;
		System.out.println(System.identityHashCode(str));
		
		StringBuilder builder = new StringBuilder("Hello");
		System.out.println(builder + " " + System.identityHashCode(builder));
		builder.append(" Test");
		System.out.println(builder + " " + System.identityHashCode(builder));
		builder.delete(0, 4);
		System.out.println(builder + " " + System.identityHashCode(builder));
		
		
		
		
		
	}
}
