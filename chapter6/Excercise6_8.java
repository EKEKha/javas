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
	
	public static int max(int[] arr) {
		if(arr==null || arr.length==0)
			return -999999;
		
		int max=arr[0]; //배열의 첫번째 값으로 최대값을 초기화 한다.
		
		for(int i=1;i<arr.length;i++) {//배열의 두번째 값 부터 비교
			if(arr[i]>max)
				max=arr[i]; //반복문을 다 돌고나면 max에는 배열의 요소중 가장큰 값이 저장되어있다.
		}
		return max;
	}
	
	public static int abs(int value) {
		return value >=0? value : -value; //양수이면 그대로 반환 음수이면 부호를 바꿔서 반환
	}
	
	public static void main(String[] args) {
		String str="123";
		System.out.println(str+"는 숫자입니까?"+isNumber(str));//true반환
		
		str="1234o";
		System.out.println(str+"는 숫자입니까?"+isNumber(str));//false반환
		
		int [] data= {3,2,9,4,7};
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값:"+max(data));
		System.out.println("최대값:"+max(null));
		System.out.println("최대값:"+max(new int[] {}));//크기가 0인 배열
		
		int value=5;
		System.out.println(value+"의 절대값:"+abs(value));
		value=-10;
		System.out.println(value+"의 절대값"+abs(value));
	}

	}


