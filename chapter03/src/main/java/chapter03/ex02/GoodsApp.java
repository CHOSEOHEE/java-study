package chapter03.ex02;

public class GoodsApp {
	public static void main(String[] args) {
		Goods camera = new Goods();

		// public은 접근 제한이 없다.
		camera.name = "nikon";

		camera.price = 400000;
		camera.countStock = 20;

		// private은 내부에서만 접근이 가능하다.
		// camera.countSold = 10;
	}
}
