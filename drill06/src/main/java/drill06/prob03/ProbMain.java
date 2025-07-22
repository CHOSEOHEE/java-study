package drill06.prob03;

import java.util.Scanner;

public class ProbMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Student student1 = new Student();
		Student student2 = new Student();
		
		String name = null;
		int score = 0;

		// 학생1
		System.out.print("학생1: ");
		name = scanner.next();
		score = scanner.nextInt();
		student1.setName(name);
		student1.setScore(score);

		// 학생2
		System.out.print("학생2: ");
		name = scanner.next();
		score = scanner.nextInt();
		student2.setName(name);
		student2.setScore(score);

		if(student1.getScore()>student2.getScore()) {
			//학생1이 더 높은 점수인 경우
			System.out.println(student1.getName()+"의 점수가 더 높습니다");
		}else if (student1.getScore() < student2.getScore()) {
			//학생2가 더 높은 점수인 경우
			System.out.println(student2.getName()+"의 점수가 더 높습니다");
		}else {
			//두 학생의 점수가 같은 경우
			System.out.println("두 학생의 점수가 같습니다.");
		}
		scanner.close();
	}

}