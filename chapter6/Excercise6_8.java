package chapter6;

public class Excercise6_8 {
	public static boolean isNumber(String str) {//메서드
		if(str==null || str.equals(""))
			return false; //매개변수의 유효성 체크
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i); // 주어진 문자열이 모두 숫자로만 이루어졌는지 확인하는 작업, 문자열에서 한문자씩 차례대로 읽어와 char타입에 저장
			
			if(ch<'0'||ch>'9') {//숫자가 아닌경우 false 반환
				return false;
			}//if문의 끝
		}//for문의 끝
		return true; //모두 숫자로 이루어졌을경우 true반환
	}
	public static void main(String[] args) {
		String str="123";
		System.out.println(str+"는 숫자입니까?"+isNumber(str));//true반환
		
		str="1234o";
		System.out.println(str+"는 숫자입니까?"+isNumber(str));//false반환
	}

	}


