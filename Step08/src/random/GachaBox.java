package random;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class GachaBox {
//	private final int[] GRADE_EA= {14,700,1800,2800,4686};
	
	private final int[] GRADE_EA;
	private final int BOX_EA = 100000; // 박스 크기를 키워보자
	private static GachaBox instance = new GachaBox();
	
	private GachaBox() { // 박스 크기를 키워보자 2
		GRADE_EA = new int[]{(int)(0.0014 * BOX_EA),
				(int)(0.07 * BOX_EA),
				(int)(0.18 * BOX_EA),
				(int)(0.28 * BOX_EA),
				(int)(0.4686 * BOX_EA)};
	}
		//싱글톤
	public static GachaBox getInstance() {
		if(instance == null)
			instance = new GachaBox();
		return instance;
	}

	private String[] generateGachaBox() {
		String[] arr = new String[10000];
		String[] grade = {"S","A","B","C","F"};		
		int[] count = new int[5];
		
		Random r = new Random();
		for(int i=0;i<10000;i++) {
			//1. 0~4까지 숫자를 랜덤하게 뽑음
			int n = r.nextInt(5); // 랜덤 변수 만들기
			if(GRADE_EA[n] == count[n]) { // 다 채웠으니 다시 뽑기
				i--;
				continue;
			}
			//2. arr에 해당 등급의 문자열을 저장
			arr[i] = grade[n];
			//3. count에도 해당 등급의 아이템 개수를 증가
			count[n]++;			
		}
		
		return arr;
	}
	
	public String[] drawItem(int ea) {// 뽑기 알려줘야하니 String , 뽑기 개수 int ea
		String[] arr = new String[ea];
		final String[] gachar = generateGachaBox();//박스를 수정하면 안되니까 final
		int[] temp = new int[ea]; // 같이 이용할 변수
		Random r = new Random();
		//뽑기를 총 ea 번째
		for(int i=0;i<ea;i++) {
			//똑같은 숫자를 뽑으면 안됌
			int n = r.nextInt(gachar.length); // 가챠박스만큼 뽑기
			temp[i]=n;
			for(int j=0;j<i;j++) {
				if(temp[j] == n) {
					i--;
					break;
				}
			}
		}
		//가챠박스에 있는 내용을 arr에 저장
		for(int i=0;i<temp.length;i++) {
			arr[i] = gachar[i];
		}
		return arr;
	}
}