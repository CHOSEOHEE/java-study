package chapter01;

public class Ex33ArraySumAvg {

	public static void main(String[] args) {
		int[] scores = {90, 75, 85, 90, 100};
		
		int sum = 0;
		for(int score : scores) {
			sum += score;
		}
		
		System.out.println("sum:" + sum);
		System.out.println("avg: " + (sum / scores.length));

	}

}
