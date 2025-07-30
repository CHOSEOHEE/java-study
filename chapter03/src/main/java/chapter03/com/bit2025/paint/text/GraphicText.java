package chapter03.com.bit2025.paint.text;

import chapter03.com.bit2025.paint.canvas.Drawable;

public class GraphicText implements Drawable {
    private String text;

	public GraphicText(String text) {
		this.text = text;
	}
	
	@Override
	public void draw() {
		System.out.println("텍스트" + text + "을 그렸습니다.");
	}
	
}
