

public class Ex14IfElseExample {

	public static void main(String[] args) {
		int score = 95;
		
		if(score >= 90) {
			System.out.println("A");
		} else if(80 <= score && score < 90) {
			System.out.println("B");
		} else if(70 <= score) {
			System.out.println("c");
		} else if(60 <= score) {
			System.out.println("D");
		} else if(50 <= score) {
			System.out.println("E");
		} else if(40 <= score) {
			System.out.println("F");
		}
		

	}

}
