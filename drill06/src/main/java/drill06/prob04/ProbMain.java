package drill06.prob04;

import java.util.Scanner;

public class ProbMain {

	public static void main(String[] args) {
		Car[] cars = new Car[3];

		Scanner scanner = new Scanner(System.in);

		String model = null;
		int speed = 0;

		/* 코드 작성 */
		
		for(int i = 0; i < cars.length; i++) {
			System.out.print("자동차"+(i+1)+ ": ");
			model = scanner.next();
			speed = scanner.nextInt();
			
			cars[i] = new Car();
			
			cars[i].setModel(model);
			cars[i].setSpeed(speed);
			
			
		} 
		for(int i = 0; i < cars.length; i++) {
//			System.out.print(cars[i].getModel());
//			System.out.print(cars[i].getSpeed());
			
			System.out.println("Car[model="+cars[i].getModel()+", speed="+cars[i].getSpeed()+"]");	
		}
		
		
		//getModel 반복문
//		
//		System.out.println(cars[1].getModel());
//		System.out.println(cars[2].getModel());
//		
//		//getSpeed 반복문
//	
//		
//		System.out.println(cars[1].getSpeed());
//		System.out.println(cars[2].getSpeed());
//		
		
	
		scanner.close();
	}

}
