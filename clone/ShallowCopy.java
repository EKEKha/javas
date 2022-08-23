package object.clone;

class Point implements Cloneable{//1. Cloneable로 객체를 복제할 수 있는 클래스라고 알려준다. 명시하지않으면 clone메서드 호출시 SupportedException발생 
	
	private int x;
	private int y;
	
	
	
	Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	void showPosition(){
		System.out.printf("[%d, %d]",x,y);
	}

	//매개밧으로 기존값을 변경
	void setPosition(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	

	@Override//2.Object의 상속받은 clone()  재정의하여 Point객체를 복제할 수 있도록 재정의함
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();//얕은복제
	}
	
	
}//Point의 끝 


class Rectangle implements Cloneable{//★★★반드시 명시 , 하지 않으면 예외발생 
	//[포함관계]
	private Point upperLeft,lowerRight;
	
	Rectangle(int x1,int y1,int x2, int y2){//생성자
		//super();
		upperLeft=new Point(x1,y1); //[Point 포함관계 순서-2]
		lowerRight=new Point(x2,y2);
	}
	
	void showPosition() {
		System.out.println("사각형의 위치정보..");
		System.out.print("좌 상단 : "); upperLeft.showPosition(); //[x1,y1] 포함관계인 Point타입의  참조변수로 접근
		System.out.print(", 우 하단 : "); lowerRight.showPosition();//[x2,y2]
		
		System.out.println("\n");
	}
	//매개값으로 기존값을 변경
	void setPosition(int x1,int y1,int x2, int y2) {
		upperLeft.setPosition(x1, y1);
		lowerRight.setPosition(x2, y2);
	}

	//★★오버라이딩(=재정의)할 때 부모 메서드의 반환타입을 '자손클래스의 타입으로 변경'을 허용한다.
	@Override
	//protected Object clone() throws CloneNotSupportedException 
	protected Rectangle clone() throws CloneNotSupportedException {//Object타입을 처음부터 Rectangle로 바꿔주면 (overriding) 밑에서 instanceof 과정생략
		
		//1.먼저 얕은복제
		return (Rectangle) super.clone(); //얕은복제 
	}
	
	
	
	
}//Rectangle의 끝

public class ShallowCopy {

	public static void main(String[] args) {
		System.out.println("-----Point 복제 테스트--------");
		Point orgPoint = new Point(1,1);
		System.out.print("[원본 Point] : ");
		orgPoint.showPosition();
		System.out.println();//빈줄

		Point pointCopy;
		try {
			if(orgPoint instanceof Point) {

				pointCopy = (Point) orgPoint.clone(); // 강제형변환

				System.out.print("[복제 Point] : ");
				pointCopy.showPosition();
				System.out.println();// 빈줄

				System.out.println("-----[원본 Point 정보 변경]--------");
				orgPoint.setPosition(3, 3);

				System.out.print("[원본 Point] : ");
				orgPoint.showPosition();
				System.out.println();

				System.out.print("[복제 Point] : ");
				pointCopy.showPosition();// int타입이라 깊은복제 대상에서 제외됨
				System.out.println();
			}	
			
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("---------------------------------------------");
		System.out.println("----Rectangle 복제 테스트-------------");
		Rectangle orgRectangle=new Rectangle(1, 1, 9, 9);
		System.out.print("원본 Rectangle : ");
		orgRectangle.showPosition();
		
		Rectangle  cpyRectangle;
		try {
//			if(orgRectangle instanceof Rectangle) {
//				cpyRectangle=(Rectangle)orgRectangle.clone();
//			}
			cpyRectangle=orgRectangle.clone(); //위의 과정 할  필요가 없음
			System.out.print("복제 Rectangle : ");
			cpyRectangle.showPosition();
			
			System.out.println("-----[복제 Rectangle 정보 변경]--------");
			cpyRectangle.setPosition(2, 2, 7, 7);
			
			System.out.print("원본 Rectangle : ");
			orgRectangle.showPosition();
			
			System.out.print("복제 Rectangle : ");
			cpyRectangle.showPosition();
			
	
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		
	}

}
