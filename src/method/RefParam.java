package method;

import java.util.Arrays;

public class RefParam {
    //Call by Reference - 참조에 의한 호출 ---> 메모리 주소값이 전달
	//    메모리 주소가 전달되기 때문에 다른 메서드에서 수정 작업을 하면 내용이 원본이 바뀌어서 적용됨
	public static void resetName(Person p) {
		p.updateName("초기화");
	}
	//Call by Value --> 값을 복사해서 보내기 때문에 원본값에는 영향을 미치지 않는다.
	public static void addNumber(int n) {
		n += 1;
	}
	
	//정수형 배열을 매개변수 받는 메서드를 생성해서, 받아온 배열에 값을 1씩 증가시키는 메서드를 작성
	public static void addArray(int[] arr) {
		for(int i=0;i<arr.length;i++)
			arr[i]++;
	}
	
	public static void main(String[] args) {
		Person a = new Person("홍길동", 20, false);
		a.printPersonInfo();
		resetName(a);
		a.printPersonInfo();
		
		int n = 100;
		System.out.println(n);
		addNumber(n);
		System.out.println(n);
	
		int[] arr = {1,2,3,4,5};
		addArray(arr);
		System.out.println(Arrays.toString(arr));
	}

}









