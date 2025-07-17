package chapter01;


public class Ex16IfElseExample {

	public static void main(String[] args) {
		char grade = 'A';
		
		switch(grade) {
		    case 'A' :
		    	System.out.println("잘했습니다");
		    	break;
		    case 'B' :
		    	System.out.println("잘했습니다");
		    	break;
		    case 'C' :
		    	System.out.println("노력했습니다");
		    	break;
		    case 'D' :
		    	System.out.println("노력했습니다");
		    	break;
		    case 'F' :
		    	System.out.println("다음 학기에 재수강 하세요");
		    	break;
		    default :
		    	System.out.println("잘못된 입력입니다.");

		}
	}
}
