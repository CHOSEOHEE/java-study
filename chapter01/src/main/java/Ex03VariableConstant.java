

public class Ex03VariableConstant {
	
	public static void main(String[] args) {
		//변수 선언 및 정의(초기화)
		
		//원시타입(기본타입
		short i = 10;
		int age = 30;
		long l =1222312321L;
		
		float pi = 3.14f;
		double height = 174.5;
		
		boolean isStudent = true;
		
		char grade = 'A';
		byte b = 20;
		
		//class
		String name = "조서희";
		System.out.println(name);
		
		System.out.println(i);
		System.out.println(age);
		System.out.println(l);
		
		System.out.println(pi);
		System.out.println(height);
		
		System.out.println(isStudent);
		
		System.out.println(grade);
		System.out.println(b);
		
		// 상수
	    final double PI = 3.141592;
		final int MAX_USER = 100;
		
		// 에러: 한 번 이상 대입을 못한다.
		// MAX_USER = 1000;
		System.out.println(PI);
		System.out.println(MAX_USER);	
	}

}
