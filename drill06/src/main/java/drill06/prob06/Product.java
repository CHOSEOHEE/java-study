package drill06.prob06;

public class Product {
	private String name;
	private int stock;
	
	public Product(String name, int stock) {
		this.name = name;
		this.stock = stock;
	}

	public void printInfo() {
		System.out.println("제품정보");
		System.out.println("이름: " + name);
		System.out.println("재고: " + stock);
		
		if(name == null && stock ==0) {
			System.out.println("[경고] 아직 제품 정보가 설정되지 않았습니다");
		}
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

}
