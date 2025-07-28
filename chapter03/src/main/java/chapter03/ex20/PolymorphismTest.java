package chapter03.ex20;

public class PolymorphismTest {
	static interface Soundable {
		void sound();
	}
			
	static abstract class Animal implements Soundable {
		public void sound() {
			System.out.println("멍멍");
		}
	}

	static class Sparrow extends Animal {
        @Override
		public void sound() {
    		System.out.println("짹짹");
    		}
        
		}
	static class Alarmbell implements Soundable {
        @Override
		public void sound() {
    		System.out.println("ALARM!!");
    		}
		}

	public static void main(String[] args) {
		Animal a1 = new Dog();
		Animal a2 = new Sparrow();
		
	Soundable soundable = new AlarmBell();
	Soundable.soundable();
		
		a1.sound();
		a2.sound();
	}

}
