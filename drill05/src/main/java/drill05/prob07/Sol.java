package drill05.prob07;

import java.util.Scanner;

public class Sol {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		/* 코드 작성 */
	
		int[] numbers = new int[5];
		
		System.out.println("배열:");
		for(int i = 0; i < 5; i++) {
			numbers[i] = scanner.nextInt();
		}
		
		System.out.println("찾을값:");
		int target = scanner.nextInt();
		
		scanner.close();
  }
}
