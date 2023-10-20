package random;

import java.util.Arrays;

public class GachaBoxMain {
	public static void main(String[] args) {

	String[] arr = GachaBox.getInstance().drawItem(20);
	System.out.print(Arrays.toString(arr));
	
	}
}
