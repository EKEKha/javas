package chapter6;

public class Excercise6_5 {

	public static void change(String str) { //메서드
		str += "456"; //기존 문자열 뒤에 456을 붙인다.
	} 
	
	public static void main(String [] args) {
		String str="ABC123";
		System.out.println(str);
		change(str); //이름은 같지만 서로 다른영역에 있는 변수,
		//1.change의 지역변수 str에 주소값 0X100을 넘겨준다.-> ABC123문자열을 가리킴
		//2.문자열 뒤에 456을 붙이는데 문자열내용을 변경할수 없기때문에 새로운 문자열 생성 ABC123456
		//3.새로운 문자열의 주소 0x200이 change 영역의 str에 담김
		System.out.println("After chage:"+str); //그래서 원래 str에 영향 끼치지않으므로 ABC123
	}
}
