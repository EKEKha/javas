import java.util.Scanner;

public class Excercise3_1 {

	public static void main(String[] args) {
	/* 3-9 다음은 문자형 변수 ch가 영문자(소,대문자) 이거나 숫자일 때만 변수 b의 값이 true가 되도록 하는 코드이다.b의 내용 입력*/
		//문제 풀이 소문자 이거나 대문자 이거나 숫자이거나
			char ch='z';
			boolean b= ('a'<=ch&& ch<='z') || ('A'<=ch&& ch<='Z')||('0'<=ch&& ch<='9');
				System.out.println(b);
	
	
	/* 3-10 대문자를 소문자로 변경하는 코드인데, 문자 ch에 저장된 문자가 대문자인 경우에만 소문자로 변경한다.
	 * 문자코드는 소문자가 대문자보다 32만큼 더 크다. 예를들어 'A'의 코드는 65이고 'a'의 코드는 97이다.
	 * 
	 */
			 ch = 'A';
			 
			 char lowercase= ('A'<=ch&&ch<='Z') ? (char)(ch+32) : ch; //대문자면 소문자로 변경해야하니까 32를 참으로,소문자면 그대로 출력
			 
			 
		/*	 구구단 출력 : 2단~입력받은 단까지 옆으로 출력 */
			
				Scanner sc = new Scanner(System.in);
				System.out.print("단 입력:");
				int dan = sc.nextInt();
				int i;
				int j;
			
				for(i=1;i<=9;i++) {
					for(j=2;j<=dan;j++) {
						System.out.print(j+ "X" +i+"="+(j*i)+"\t");
				   	}
	
				}
	

	}

}
