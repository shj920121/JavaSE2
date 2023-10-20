package wrapper;

public class WrapperClass {
/*
 * 	Wrapper 클래스는 primitive 변수 타입을 reference 형 타입으로 바꿀때 사용되는 클래스
 * 
 * 		Wrapper			primitive
 * 		Integer  <------ int  
 * 		Double   <------ double
 * 		Float    <------ float
 * 		Boolean  <------ boolean
 * 		Character<------ char
 *  클래스이기 때문에 대문자로 시작 
 *
 */
		public static void main(String[] args) {
			Integer n1 = new Integer(100);
			Integer n2 = 200;
			System.out.println(n1);
			System.out.println(n2);
			System.out.println(n1+n2);
			
			//Integer 최대값, 최소값, 바이트수, 사이즈
			System.out.println(Integer.MAX_VALUE);
			System.out.println(Integer.MIN_VALUE);
			System.out.println(Integer.BYTES);
			System.out.println(Integer.SIZE);
			
			//문자열을 숫자로 변환
			System.out.println(Integer.parseInt("100"));
			System.out.println(Integer.parseInt("100") * 2); // 변환 확인
			System.out.println(Double.parseDouble("3.1415") * 2);
//			System.out.println(Integer.toHexString(65)*2); // 16진수 바꾸면서 문자열로
			System.out.println(Integer.toHexString(65)+100); // 
			
			System.out.println(0x41); // 16진수를 표현할때 앞에 0x
			System.out.println(011); // 8진수를 표현할때 앞에 0
			
			System.out.println("=========================");
			// 호환
			int i1 = 100;
			//auto boxing - primitive -> reference
			Integer i2 = i1;
			System.out.println(i2);
			//auto unboxing
			int i3 = i2;
			System.out.println(i3);
			
			// 1.5 이전 버전에서의 boxing, unboxing
			int i4 = 100;
			Object obj = i4;
			Integer i5 = (Integer)obj;
			// 다시 int형으로
			Object val = i5;
			int i6 = (int)val;
			
			
			
		
		}
}
