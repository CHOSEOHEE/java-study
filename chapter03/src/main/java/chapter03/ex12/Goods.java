package chapter03.ex12;

public class Goods {
	public static int countOfGoods;
	
	private String name; 
	private int price; 
	private int countStock;  
	private int countSold; 
	
	
	
	public int calcDiscountPrice(float percentage) {
		return price - (int)(price * percentage); 
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public static int getCountOfGoods() {
		return countOfGoods;
	}
	public static void setCountOfGoods(int countOfGoods) {
		Goods.countOfGoods = countOfGoods;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCountStock() {
		return countStock;
	}
	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}
	public int getCountSold() {
		return countSold;
	}
	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}
	public void showInfo() {
  } 	
}