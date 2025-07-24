package chapter03.paint;

public class GraphicTest implements Drawable {

	private String text;
	
	public void GraphicText(String text) {
		this.text = text;
	}
	public void draw() {
		System.out.println("텍스트" + text + "을 그렸습니다.");
	}
	
}
