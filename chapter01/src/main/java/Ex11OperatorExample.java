

public class Ex11OperatorExample {
	
	public static void main(String[] args) {
		int radius1 = 5;
		int radius2 = 6;
		int radius3 = 7;
		int radius4 = 8;
		int radius5 = 9;
		
		System.out.println("반지름: " + radius1);
		System.out.println("원의 넓이: " + calculateCircleArea(5));
	
	}
	
	public static double calculateCircleArea(int radius) {
		final double PI = 3.14;
		double area = PI * radius * radius;
		return area;
	}

}
