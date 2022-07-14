package fruit;

public class FruitMain {

	public static void main(String[] args) {
		Buyer b = new Buyer();//기본값 0으로 채워진 구매자 객체 생성
		
		//멤버변수에 [직접 접근]하여 값 변경
		b.money=30000;
		b.numOfApple= 20; //사과수 20개를 가진 구매자로 변경
		
		b.showBuy(); //메서드를 통해 현황 출력
		
		System.out.println("-----[멤버변수에 직접 접근] 구매자의 현재 현황-1----------------");
		System.out.println(b.money+"원");
		System.out.println(b.numOfApple+"개");
		
		//멤버변수에 [간접 접근]하여 값 변경
		b.setMoney(50000);//돈은 500000
		b.setNumOfApple(70);//사과수 70
		
		b.showBuy();
		
		System.out.println("-----[멤버변수에 간접 접근] 구매자의 현재 현황-2----------------");
		System.out.println(b.getMoney()+"원");
		System.out.println(b.getNumOfApple()+"개");
		
		System.out.println("------------------------------------");
		
		
		//1-1. 구매자1 생성
		Buyer b1 = new Buyer(10000); //10000원을 가진 구매자 생성(사과수는 기본값0)
	
		//1-2. 구매자2 생성
		Buyer b2 = new Buyer(20000,10);//20000원, 10개 사과를 가진 구매자 생성
		
		//2-1. 판매자1 생성
		Seller s1 = new Seller(0,100,1000);
		//멤버변수에 직접접근이 가능하므로 사과가격을 10원으로 변경가능(=>문제발생, 해결위해 앞에 final)
		//s1.apple_price=10;
		
		//2-1. 판매자2 생성
		Seller s2 = new Seller(0,50,2000);
		
		//3-1. 구매자1이 [판매자1]한테 사과 5000원어치 구매
		b1.buy(s1,5000);
		
		//3-1. 구매자1이 [판매자2]한테 사과 4000원어치 구매
		b1.buy(s2,4000);
		
		//4. 구매자1의 현재 현황:
		//System.out.println(b1.money);
		//System.out.println(b1.numOfApple);
		System.out.println("----[구매자1의 현재현황]-----------------");
		b1.showBuy();
		
		//5-1. 판매자1의 현재현황
		System.out.println("----[판매자1의 현재현황]-----------------");
		s1.showSale();
		
		//5-2. 판매자2의 현재현황
		System.out.println("----[판매자2의 현재현황]-----------------");
		s2.showSale();
		
	}

}
