package drill05.prob01;

import java.util.Scanner;

public class Sol {

	public static void main(String[] args) {
		final int ARRAY_LENGTH = 5;
		
		Scanner scanner = new Scanner(System.in);

		/* 코드 작성 */
		int[] numbers = new int[ARRAY_LENGTH];
		for(int i = 0; i < ARRAY_LENGTH; i++) {
			numbers[i] = scanner.nextInt();
			
		}
		System.out.println(numbers.length);
		scanner.close();
	}		
}
