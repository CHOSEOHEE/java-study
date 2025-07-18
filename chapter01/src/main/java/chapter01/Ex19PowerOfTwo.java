package chapter01;

public class Ex19PowerOfTwo {

	public static void main(String[] args) {
		
		int i = 0;
		int result = 1;
		
		while(i < 10) {
			// result *= 2;
			result = result * 2;
			
			i++;
		}
		
		System.out.println(result);

	}

}
