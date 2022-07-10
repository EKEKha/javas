class Data { int x;}

class PrimitiveParamEx{
	public static void main(String[] args) {
		Data d= new Data();
		d.x=10;
		System.out.println("main() : x ="+d.x);
		
//		change(d.x); //change메서드 호출
//		System.out.println("After change(d.x)");-----차이
//		System.out.println("main(): x="+d.x); //10
		
		change(d);//주소값 호출
		System.out.println("After change(d)");//------차이
		System.out.println("main(): x="+d.x);//1000
		
	}
	
	static void change(Data d) {//주소를 복사
//		x=1000;//change 메서드의 x , 원본이아닌 복사본이 변경된 것  기본형 매개변수라 읽기만 가능.
//		System.out.println("change() :x ="+x);
		
		d.x=1000; //change 메서드의 매개변수가 참조형이라서 값이 저장된 주소를 넘겨주었기때문에 값을 읽는것 뿐아니라 변경가능.
		System.out.println("change() :x ="+d.x);
	}

}
