package inheritance;

public class CustomerMain {

	public static void main(String[] args) {
		Customer c = new Customer();
		System.out.println(c);
		
		c.setCustomerID(1);
		c.setCustomerName("전영훈");
		
		System.out.println(c.showCustomerInfo());
		
		System.out.println("===================================");

		
		VIPCustomer v=new VIPCustomer();
		System.out.println(v);
		
		v.customerID=2;//직접접근
		v.customerName="이대현";
		
		//v.setCustomerID(2); 메서드로 간접접근
		//v.setCustomerName("이대현");
		
		System.out.println(v);
		System.out.println(v.showCustomerInfo());
		
		System.out.println("===================================");
		
		Customer c2=new Customer(3,"권은재");
		int productPrice=10000;//물건값
		int c2Price=c2.calcPrice(productPrice);
		System.out.println(c2.customerName+"님이 "+ c2Price+"원을 지불하셨습니다.");
		System.out.println(c2.showCustomerInfo());
		
		
		System.out.println("===================================");
		
		GoldCustomer g =new GoldCustomer(4,"박혜나");
		
		int gPrice = g.calcPrice(productPrice);
		System.out.println(g.customerName+"님이 "+ gPrice+"원을 지불하셨습니다.");
		System.out.println(g.showCustomerInfo());
		
		VIPCustomer v2=new VIPCustomer(5,"손주환",123);
		
		int v2Price = v2.calcPrice(productPrice);
		System.out.println(v2.customerName+"님이 "+ v2Price+"원을 지불하셨습니다.");
		System.out.println(v2.showCustomerInfo());
	}

}
