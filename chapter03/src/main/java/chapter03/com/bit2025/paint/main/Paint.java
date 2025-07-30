package chapter03.com.bit2025.paint.main;

import java.io.Serializable;

import chapter03.com.bit2025.paint.canvas.*;
import chapter03.com.bit2025.paint.point.*;
import chapter03.com.bit2025.paint.shape.*;
import chapter03.com.bit2025.paint.text.*;

public class Paint {

	public static void main(String[] args) {
		Canvas canvas = new Canvas();

		Point point1 = new Point();
		point1.setX(10);
		point1.setY(20);
		
//		canvas.drawPoint(point1);
		canvas.draw(point1);

		// point1.disappear();
		point1.show(false);

		Point point2 = new Point(100, 200);
//	    canvas.drawPoint(point2);
		canvas.draw(point2);

		ColorPoint point3 = new ColorPoint(50, 60, "red");
//	    canvas.drawColorPoint(point3);
//	    canvas.drawPoint(point3);
		canvas.draw(point3);

//	    canvas.drawTriangle(new Triangle());
//	    canvas.(new Triangle());
		canvas.draw(new Triangle());

//		canvas.drawRectangle(new Rectangle());
//		canvas.drawShape(new Rectangle());
		canvas.draw(new Rectangle());

//		canvas.drawCircle(new circle());
//		canvas.drawShape(new Circle());
		canvas.draw(new Circle());

		canvas.draw(new GraphicText("Hello, World"));

		/* instanceof 연산자 */

		Circle c = new Circle();
		System.out.println(c instanceof Object);
		System.out.println(c instanceof Shape);
		System.out.println(c instanceof Circle);

		// 오류: 컴파일 타임에 타입 검사도 하기 때문에 상속 하이어라키(hierachy)전혀 없으면 에러 발생
		// System.out.println(c instanceof Point);

		// 다운캐스팅 전에 타입 검사
		Object o = new Circle();
		if (o instanceof String) {
			String s = (String) o;
		}

		// 우측항이 인터페이스인 경우
		// 상속 hierachy 상관없이 사용할 수 있다.
		System.out.println(c instanceof Drawable);
		System.out.println(c instanceof Serializable);
	}

}
