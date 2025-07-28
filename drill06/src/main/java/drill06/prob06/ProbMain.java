package drill06.prob06;

public class ProbMain {

	public static void main(String[] args) {
		Product product = new Product(null, 0);
		product.printInfo();

		product.setName("맥북");
		product.setStock(10);
		product.printInfo();
	}
}
