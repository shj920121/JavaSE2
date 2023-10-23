package static_ex;

public class StaticVar {
	public static int n1 = 10; // static 메모리에 있다 // static 은 프로그램 시작부터 끝날때까지 있다. // new로 재생성 불가
	public static final double PI = 3.1415; // static 메모리에 있다
	public int n2 = 20; // heap
	
	public static void main(String[] args) { // 중괄호 안은 스택 메모리 cf)heap은 new로 생성된것의 메모리
		// static 키워드가 붙어있으면 미리 메모리가 할당되어 있어서 접근이 가능함
		System.out.println(n1); 
		System.out.println(PI);
		
		//ne2는 StaticVar 클래스의 필드이기 때문에 아직 생성이 되지 않음
//		그래서 static은 static이 아닌 영역에 접근할 수 없다.
//		System.out.println(n2);
//		non-static은 반드시 생성 후에 실행
		StaticVar var = new StaticVar();
		System.out.println(var.n2);
		
//		static 변수나 상수에 접근하는 방법
//		클래스명.변수명 , 클래스명.상수명 , 클래스명.메서드() 
//		객체명.변수명 , 객체명.상수명 , 객체명.메서드()
		
		System.out.println(StaticVar.n1);
		System.out.println(StaticVar.PI);
		System.out.println(var.n1);
		System.out.println(var.PI);
	}
}
