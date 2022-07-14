package fruit;

public class Buyer {
	int money; //돈 
	int numOfApple; //사과 바구니 
	
	Buyer(){};
	
	public Buyer(int money) {
		super();
		this.money=money;
		//numOfApple: 기본값0으로 채워짐
	}
	
	public Buyer(int money, int numOfApple) {
		this.money=money;
		this.numOfApple=numOfApple;
	}
	
	//기능: 메서드 
	//돈을 판매자에게 주고 사과를 사는 메서드 - 구매자가 주체
	void buy(Seller s, int money) {
		numOfApple +=s.sale(money);//사과 수는 증가
		this.money-=money;
	}
	void showBuy() {
		System.out.println("가진 사과 수 :" +numOfApple);
		System.out.println("현재 가진 돈 :"+money);
		
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getNumOfApple() {
		return numOfApple;
	}

	public void setNumOfApple(int numOfApple) {
		this.numOfApple = numOfApple;
	}
	
	
}
