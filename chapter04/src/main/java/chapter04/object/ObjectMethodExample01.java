package chapter04.object;

public class ObjectMethodExample01 {

	public static void main(String[] args) {
		Goods goods = new Goods();
		 
		Class klass = goods.getclass();       //reflection
		System.out.println(klass.getName()); 
		
		System.out.println(goods.hashcode()); //address 기반의 해싱값
		                                      //address x
		                                      //reference 값 x
		System.out.println(goods.hashcodetoString()); //getClass().getName() + "@" + cashcode()
		System.out.println(goods);

	}

}
