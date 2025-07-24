package chapter03.ex14;

public class Goods {
	public static int countOfGoods;

	private String name;
	protected int price;
	private int countStock;
	private int countSold;
	
	public Goods() {
		
	}

	public Goods(String name, int price, int countStock, int countSold) {
		this.name=name;
		this.price=price;
		this.countStock= countStock;
		this.countSold= countSold;

	}

	public int calcDiscountPrice(float percentage) {
		return price - (int) (price * percentage);
	}

	public void showInfo(boolean summary) {
		if (summary) {
			System.out.println("상품이름:" + name + ", 가격: " + price);
		} else {
			showInfo();
		}
	}

	public void sell() {
//    	if(countStock > 0) {
//    		countStock--;
//    		countSold++;
//    		}
		sell(1);
	}

	public void sell(int quality) {
    	if(quality< 0) {
    		System.out.println("입력 오류");
    	return;
    }
    	if(countStock >= quality) {
    		countStock -= quality;
    		countSold += quality;
    	}else {
    		System.out.println("재고 부족");
    		}
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
		System.out.println("상품 이름: " + name + ",가격: " + price + ", 재고량:" + countStock + ",판매량: " + countSold);
	}

}