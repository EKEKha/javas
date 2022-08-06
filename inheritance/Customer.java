package inheritance;
/*
 * 부모: 자손의 공통된 특징(속성과 기능)
 */

public class Customer {//고객: 부모
	//1.멤버변수(=필드) : 속성 -자식들의 공통된 속성
	//아래 3개: protected(같은 패키지에서 접근가능, 다른패키지에서는 자식만 접근가능)
	protected int customerID;//고객 아이디
	protected String customerName;//고객 이름
	protected String customerGrade;//고객 등급
	
	//아래2개:default(같은 패키지에서 접근가능)
	int bonusPoint=0;//보너스 포인트
	double bonusRatio;//적립 비율

	//2.생성자 : 처음고객등록 시 등급 ="SILVER", 적립비율=0.01=1%
	public Customer(){
		super();
		
		initCustomer();
		/*customerGrade="SILVER";
		bonusRatio=0.01; //처음 값들을 고정하기위해 매개값없이 생성자
		//나머지 멤버변수는 기본값으로 채워짐	 0,null,0*/
	}
	//매개변수가 있는 생성자(고객 아이디, 고객 이름)
	public Customer(int customerID, String customerName) {
		super();
		this.customerID = customerID;
		this.customerName = customerName;
		
		initCustomer();
		/*customerGrade="SILVER";
		bonusRatio=0.01; */ //메서드로 빼기위해 생성자 부분과  주석처리 
	}
	
	//3.메서드:자식의 공통된 기능만
	/*제품에대해서 지불해야하는 금액을 계산하여 반환 
	 * (반환하기 전에 보느서포인트를 꼐산하여 누적)
	 */
	private void initCustomer() {
		customerGrade="SILVER";
		bonusRatio=0.01;
	}
	
	public int calcPrice(int productPrice){//물건 값으로 계산
		bonusPoint+=productPrice*bonusRatio;//물건값이 10000원이라면 10000*0.01=100포인트쌓임
		return productPrice;//할인 없이 10000원 그대로 지불
	}
	
	//메서드 작성할 때 리턴타입으로 작성할지의 여부를 고민
	//고객 정보 반환
	public String showCustomerInfo(){
		return customerName+"님의 등급은"+customerGrade+"이며, 보너스 포인트는 "+bonusPoint+"점 입니다.";
	}
	
	//object의 toString을 재정의하여 외부클래스에서 주소만으로도 해당객체의 정보를 알수 있다.
	//즉, toStirng()을 호출하는 측에서 "주소만"으로도 "고객정보"를 리턴받을 수 있도록 재정의함 
	@Override
	public String toString() {
		return "Customer [customerID=" + customerID + ", customerName=" + customerName + ", customerGrade="
				+ customerGrade + ", bonusPoint=" + bonusPoint + ", bonusRatio=" + bonusRatio + "]";
	}
	

	/**get~()  set~(매개변수)
	 * final : 자식에서 '재정의 불가' 하도록***/
	
	public final int getCustomerID() {
		return customerID;
	}
	public final void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public final String getCustomerName() {
		return customerName;
	}
	public final void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public final String getCustomerGrade() {
		return customerGrade;
	}
	public final void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	public final int getBonusPoint() {
		return bonusPoint;
	}
	/*주서거리된 메서드는 개발자의 설계에 따라 달라짐
	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	*/
	public final double getBonusRatio() {
		return bonusRatio;
	}
	/*
	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
	*/
	
	void showNOSaleRatio() {
		System.out.println(customerGrade+"등급은 세일비율이 0%입니다.");
	}
	
	
	
	
	
}
