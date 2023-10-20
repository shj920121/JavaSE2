package String;
import java.util.Arrays;

public class StringEx {
	public static void main(String[] args) {
		String str1 = "Hello World";
		//저정하고 있는 문자열을 바이트형 배열로 변환
		byte[] arr = str1.getBytes();
		System.out.println(Arrays.toString(arr));
		
		//해당 인덱스 번호에 위치한 문자 하나 리턴
		//특정 문자 뽑을때 ex)주민번호 7번째로 성별체크
		System.out.println(str1.charAt(4));
		
		String str2 = "Hello World Hello Java World";
		//문자열 왼쪽부터 검색 , 시작하는 인덱스 번호
		System.out.println(str2.indexOf("World"));
		//7번 인덱스부터 검색
		System.out.println(str2.indexOf("World",7));
		//검색 결과가 없을때 -1 출력
		System.out.println(str2.indexOf("World",24));
		//문자열 끝에서부터 검색 - 검색결과는 인덱스 번호, 결과가 없으면 -1
		System.out.println(str2.lastIndexOf("World"));
		System.out.println(str2.lastIndexOf("World",22));
		//알파벳을 전부 소문자로 변환
		System.out.println(str2.toLowerCase());
		//알파벳을 전부 대문자로 변환
		System.out.println(str2.toUpperCase());
		//문자열 길이 리턴
		System.out.println(str2.length());
		//문자열 부분 추출, 10번 인덱스부터 마지막 인덱스까지 문자열을 잘라내서 리턴
		System.out.println(str2.substring(10));
		//15인덱스 전까지
		System.out.println(str2.substring(10,15));
		//문자열 바꾸기
		System.out.println(str2.replace("World", "Hell"));
		
		String str3 = "         Hello World       ";
		System.out.println(str3.length()); 
		System.out.println(str3);
		
		//문자열 양쪽에 필요없는 공백을 제거
		System.out.println(str3.trim());
		System.out.println(str3.trim().length());
		
		String str4 = "java,html,css,javascript,jsp,spring";
		// 문자열을 구분자를 기준으로 잘라서 배열로 만들어줌
		String[] result = str4.split(",");
		System.out.println(Arrays.toString(result));
		//문자열 배열을 하나의 문자열로 구분자를 넣어서 만들어줌
		System.out.println(String.join(",", result));
		
		
		
		
		
		
		
		
		
		
		
	}
}
