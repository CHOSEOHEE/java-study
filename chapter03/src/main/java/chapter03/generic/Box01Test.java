package chapter03.generic;

public class Box01Test {

	public static void main(String[] args) {
		Box01 StringBox = new Box01("hello");
		System.out.print(StringBox.getValue());
		
		StringBox.setValue(" ");
		System.out.print(StringBox.getValue());
		
		StringBox.setValue("world");
		System.out.print(StringBox.getValue());

	}

}
