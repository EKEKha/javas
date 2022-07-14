package fruit;

public class Seller {
	int money;
	int numOfApple=100;
	final int apple_price;
	
	public Seller(int money,int numOfApple,int apple_price) {
		super();
		this.money=money;
		this.numOfApple=numOfApple;
		this.apple_price=apple_price;
	}

	//메서드
	int sale(int money) {
		int numOfsale=money/apple_price;
		
		numOfApple -=numOfApple;
		this.money+=money;
		return numOfsale;  //구매자에게 사과를 리턴
	}
	
	void showSale() {
		System.out.println("판매 후 사과 수:"+numOfApple);
		System.out.println("판매자가 가진 돈 "+money);
	}
	
}
