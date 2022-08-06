package inheritance;

public class GoldCustomer extends Customer {
	/*
	 * 부모의 멤버(멤버변수,메서드)를 상속(단, 생성자,private,초기화 블록 상속불가)
	 * +자식만의 특징(속성이나 기능)추가
	 */
	
	//1.멤버변수 = 부모(5) + (1)
	public double saleRatio; //세일비율(실수)추가 :"Gold"부터 물건을 살 떄 세일을 해줌

	
	//2.생성자 : 고객등급 "GOLD" ,적립 비율 =0.02 ,세일비율0.05 
	//매개변수가 있는 생성자(고객아이디,고객이름)
	public GoldCustomer(int customerID, String customerName) {
		//1.부모생성자를 매개값을 가지고 호출하여 먼저 부모객체 생성
		super(customerID, customerName);//매개변수의 값으로 부모의생성자가 만들어지고 상속받아 gold가 생성
		
		//2.그대로 상속받아 자식에서 변경하고자 하는 멤버변수의 값으로 변경
		customerGrade="GOLD";
		bonusRatio=0.02;   //부모의 것도 변경되기 때문에this나 super 붙여도 똑같음
		
		saleRatio=0.05;
		
	}

	//3.메서드: 어디서든지 접근 가능
	//상속받은 메서드 + 메서드 추가

	@Override
	public int calcPrice(int productPrice) {
		bonusPoint+=productPrice*bonusRatio;//물건값이 10000원이라면 10000*0.02=200포인트쌓임
		//return productPrice-(int)(productPrice*saleRatio);//10000-500
		return (int)(productPrice*(1-saleRatio));//10000*(1-0.05)
	}


	//showCustomerInfo():재정의하지 않고 그대로 상속
	
	//CUstomer로부터 상속받은 toString 메서드 재정의

	@Override
	public String toString() {//saleRatio추가
		return "GoldCustomer [saleRatio=" + saleRatio + ", customerID=" + customerID + ", customerName=" + customerName
				+ ", customerGrade=" + customerGrade + ", bonusPoint=" + bonusPoint + ", bonusRatio=" + bonusRatio
				+ "]";
	}

	/***********get() set()***************/
	
	public final double getSaleRatio() {
		return saleRatio;
	}

	
	
	//자식에만 추가한 메서드
	void showSaleRatio() {
		System.out.println(customerName+"님은 "+customerGrade+"등급으로 세일비율이 "+saleRatio+"입니다.");
	}
	
	
	
	
	
	
}
