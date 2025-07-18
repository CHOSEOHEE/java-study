package drill02.prob05;

/**
 * 문제 5. 산술/논리 연산
 * 
 * int a = 7;
 * int b = 3;
 * System.out.println(a + b);
 * System.out.println(a / b);
 * System.out.println(a % b);
 * System.out.println(a > b && b > 0);
 * System.out.println(!(a == 7));
 * 
 * 예상 출력 결과:
 * 
 * 1) 10
 * 2) 2
 * 3) 1
 * 4) 7은 3보다 크고 3은 0보다 크다
 * 5) a와 7은 같다. 값은 사실과 반대로 출력됨
 * 
 */

public class Sol {

	public static void main(String[] args) {
		int a = 7;
	    int b = 3;
	    
	    System.out.println(a + b);
	    System.out.println(a / b);
	    System.out.println(a % b);
	    System.out.println(a > b && b > 0);
	    System.out.println(!(a == 7));
	}

}
