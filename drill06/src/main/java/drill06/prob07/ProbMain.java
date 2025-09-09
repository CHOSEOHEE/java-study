package drill06.prob07;

public class ProbMain {

	public static void main(String[] args) {
		Address address = new Address();
		address.setCity("서울");
		address.setStreet("강남대로");
		
		Customer customer = new Customer();
		customer.setName("둘리");
		customer.setAdderss("아파트");
		
		System.out.println("둘리의 아파트" + "=" + "서울 강남대로 189번지");
	}
	
	
}
