package chapter03.ex19;

public class PolymorphismTest {
	static abstract class Animal {
		private String species;
		
		public abstract void sound();
	}
			
	
	
	static class Dog extends Animal {
		@Override
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
	
	static class Alarmbell extends Animal {
        @Override
		public void sound() {
    		System.out.println("ALARM!!");
    		}
		}

	public static void main(String[] args) {
		Animal a1 = new Dog();
		Animal a2 = new Sparrow();
		
		a1.sound(); //멍멍
		a2.sound();//짹짹
	}

}
