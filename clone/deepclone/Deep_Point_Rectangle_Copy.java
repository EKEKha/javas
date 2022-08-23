package object.clone.deepclone;

class Point implements Cloneable { //1. 객체를 복제할 수 있는 클래스
	private int x; //기본타입 : 값을 복제 => 깊은 복제 대상에서 제외 (기본타입, String)
	private int y;
	
	Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	} 
	
	void showPosition() {
		System.out.printf("[%d,%d]", x, y);
	}
	
	
	void setPosition(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override //2. Object로부터 상속받은 clone() 재정의하여 Point객체를 복제할 수 있도록 재정의함 
	protected Point clone() throws CloneNotSupportedException { 
		return (Point) super.clone(); //얕은 복제 (int : 값 복제)
	}
}

//객체를 복제할 수 있는 클래스라고 반드시 명시 (안하면 clone() 호출 할 때 예외발생 -> 프로그램 강제 멈춤)
class Rectangle implements Cloneable{ 
	private Point upperLeft, lowerRight; //[Point 포함관계 순서-1] 클래스타입 : 주소 복제 => 깊은 복제의 대상
	
	 Rectangle(int x1, int y1, int x2, int y2) {
		//super(); 자동으로 생성됨
		upperLeft = new Point(x1, y1);//[Point 포함관계 순서-1]
		lowerRight = new Point(x2, y2);
	}
	 
	 void showPosition() {
		 System.out.println("사각형의 위치정보....");
		 System.out.print("좌 상단 : "); upperLeft.showPosition(); //[x1, y1]
		 System.out.print(" 우 상단 : "); lowerRight.showPosition(); //[x2, y2]
		 System.out.println("\n");
	 }
	 
	//매개값으로 기존값을 변경
	 void setPosition(int x1, int y1, int x2, int y2) {
		 upperLeft.setPosition(x1, y1);
		 lowerRight.setPosition(x2, y2);
	 }

	//★부모메서드의 반환타입을 '자손클래스의 타입으로 변경'을 허용한다.★
	@Override //깊은 복제
	protected Rectangle clone() throws CloneNotSupportedException {
		//1. 먼저 얕은복제로 객체를 통째로 복제한다.
		Rectangle cpyRectangle = (Rectangle)super.clone(); 
		
		//2. '깊은복제의 대상'이 되는 객체들을 복제한다.
		cpyRectangle.upperLeft = this.upperLeft.clone();
		cpyRectangle.lowerRight = this.lowerRight.clone();
		
		//3. 깊은 복제된 cpy를 리턴한다.
		return cpyRectangle;
	}
}

public class Deep_Point_Rectangle_Copy {

	public static void main(String[] args) {

		System.out.println("---- Point 복제 테스트 ----"); //얕은 복제 (int)
		Point orgPoint = new Point(1, 1);
		System.out.print("원본 Point : ");
		orgPoint.showPosition();
		System.out.println();
		
		/**
		 * ★clone()재정의 타입변경 하지 않았을 때 -> 강제형변환 해야 함★
		 */
		Point pointCopy; 
		try {
			if(orgPoint instanceof Point) {
				pointCopy = (Point)orgPoint.clone(); //강제형변환
			
				System.out.print("복제 Point : ");
				pointCopy.showPosition();
				System.out.println();
				
				System.out.println("-- [원본 Point 정보 변경] --");
				orgPoint.setPosition(3, 3);
				
				System.out.print("원본 Point : "); //int타입 point -> 얕은 복제 -> 복제된 객체까지 바뀌지 않음 (주소가 아닌 값 복제했기 때문)
				orgPoint.showPosition();
				System.out.println();
				
				System.out.print("복제 Point : ");
				pointCopy.showPosition();
				System.out.println();
			}
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		System.out.println("--------------------------------------------");
		System.out.println("---- Rectangle 복제 테스트 ----");
		Rectangle orgRectangle = new Rectangle(1, 1, 9, 9);
		System.out.println("원본 Rectangle : ");
		orgRectangle.showPosition();
		
		/** 
		 *  ★clone()재정의 타입변경 (부모메서드의 반환타입) -> 강제형변환 필요 없음★
		 */
		Rectangle cpyRectangle;
		try {
			//if(orgRectangle instanceof Rectangle) {
				//cpyRectangle = (Rectangle)orgRectangle.clone();
			//}
			cpyRectangle = orgRectangle.clone();
			System.out.println("복제 Rectangle");
			cpyRectangle.showPosition();
			
			System.out.println("-- [복제 Rectangle 정보 변경] --");
			cpyRectangle.setPosition(2, 2, 7, 7);
			
			System.out.println("원본 Rectangle");
			orgRectangle.showPosition();
			
			System.out.println("복제 Rectangle");
			cpyRectangle.showPosition();
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
