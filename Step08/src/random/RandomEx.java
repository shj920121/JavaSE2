package random;

import java.util.Random;

public class RandomEx {
	public static void main(String[] args) {
		Random r = new Random(4); // 시드값 넣어주면 값이 고정됌 , 그래서 보통 변동하는 시간값을 넣어줌 (디폴트)
		System.out.println(r.nextInt());
		
		//r.nextInt(최대값 + 1 - 최소값) + 최소값
		System.out.println(r.nextInt(45)); // 0~44
		System.out.println(r.nextInt(45)+1); // 0~45
		System.out.println(r.nextBoolean());
		System.out.println(r.nextDouble());
		
		
	}
}
	