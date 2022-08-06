package inheritance;

public class VIPCustomer extends Customer {

	public double saleRatio; // 세일비율(실수)추가 :"Gold"부터 물건을 살 떄 세일을 해줌
	private final int agentID;//VIP고객 상담원 아이디 추가(정수,값변경 불가, 다른클래스에서 접근불가) set메서드 만들수 없음
		

	// 2.생성자 : 고객등급 "VIP" ,적립 비율 =0.05 ,세일비율0.1
	public VIPCustomer() {
		super();//부모의 매개변수가 없는 생성자를 호출
		
		customerGrade="VIP";
		bonusRatio=0.05;
		saleRatio=0.1;
		
		agentID=111;//VIPCustomer객체의 상담원 ID는 111로 고정
	}
	
	
	// 매개변수가 있는 생성자(고객아이디,고객이름,VIP 고객 상담원 아이디)
	public VIPCustomer(int customerID, String customerName,int agentID) {
		// 1.부모생성자를 매개값을 가지고 호출하여 먼저 부모객체 생성
		super(customerID, customerName);// 매개변수의 값으로 부모의생성자가 만들어지고 상속받아 gold가 생성

		// 2.그대로 상속받아 자식에서 변경하고자 하는 멤버변수의 값으로 변경
		customerGrade="VIP";
		bonusRatio=0.05;
		saleRatio=0.1;

		this.agentID=agentID;//VIPCustomer객체의 상담원 ID는 매개값에 따라 달라짐. 값 변경 불가

	}

	// 3.메서드: 어디서든지 접근 가능
	// 상속받은 메서드 + 메서드 추가

	@Override
	public int calcPrice(int productPrice) {
		bonusPoint += productPrice * bonusRatio;// 물건값이 10000원이라면 10000*0.02=200포인트쌓임
		// return productPrice-(int)(productPrice*saleRatio);//10000-500
		return (int) (productPrice * (1 - saleRatio));// 10000*(1-0.05)
	}

	// showCustomerInfo():재정의하지 않고 그대로 상속

	// CUstomer로부터 상속받은 toString 메서드 재정의

	@Override
	public String toString() {
		return "VIPCustomer [saleRatio=" + saleRatio + ", agentID=" + agentID + ", customerID=" + customerID
				+ ", customerName=" + customerName + ", customerGrade=" + customerGrade + ", bonusPoint=" + bonusPoint
				+ ", bonusRatio=" + bonusRatio + "]";
	}
	
	/*********** get() set() ***************/

	public final double getSaleRatio() {
		return saleRatio;
	}
	

	public int getAgentID() {
		return agentID;
	}


	// 자식에만 추가한 메서드
	void showSaleRatio() {
		System.out.println(customerName + "님은 " + customerGrade + "등급으로 세일비율이 " + saleRatio + "입니다.");
	}

	//자식에만 추가한 메서드
	public void showAgentID() {
		System.out.println(customerName+"님의 상담원ID는 "+agentID+"입니다.");
		
	}
}
