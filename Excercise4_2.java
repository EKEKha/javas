

public class Excercise4_2 {

	public static void main(String[] args) {
		/***
		 * [4-5]for문을 while문으로 변경하시오.
		 */

		for(int i=0;i<=10;i++) { //11번 찍힌다. i=0,j=0일때도 조건을 만족하므로 별이 찍힘.
			for(int j=0;j<=i;j++)
				System.out.print("*");
			System.out.println();
		}
		int i=0;
		
		while(i<=10) {
			int j=0; //j초기화 위치 주의
			while(j<=i) {
				System.out.print("*");
				j++;
				}
			System.out.println();
			i++;
		} 
	
	
	/**[4-6]두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오*/
	for(i=1;i<=6;i++) {
		for(int j=1;j<=6;j++) {
			if(i+j==6)
				System.out.println(i+"+"+j+"="+(i+j));
		}
	}
	
	/**[4-7]Math.random()을 이용해서 1부터 6사이의 임의의 정수를 변수 value에 저장하는 코드를 완성하라.**/
	int value= (int)(Math.random()*6)+1;
		System.out.println("value="+value);
		
		
	/**[4-8]방정식 2x+4y=10의 모든 해를 구하시오. 단 x, y는 정수 범위는 0<=x,y<=10*/
		for(int x=0;x<=10;x++) {
			for(int y=0;y<=10;y++) {
				if(2*x+4*y==10) {
					System.out.println("x="+x+", y="+y);
				}
			}
			
			
			
	/**[4-9]숫자로 이루어진 문자열 'str'이 있을 때 ,각자리의 합을 더한 결과를 출력하는 코드를 완성하라.
	 * 만일 문자열이 12345 라면 1+2+3+4+5인 결과를 출력해야한다.
	 */
			String str ="12345";
			int sum = 0;
			
			for( i=0; i<str.length();i++){
				sum+=str.charAt(i)-'0'; //문자를 숫자로 변환
			}
			System.out.println("sum="+sum);
			
			
	/***[4-10]int 타입의 변수 num이 있을때, 각자리의 합을 더한 결과를 출력하는 코드를 완성하라.
	 * 만일 변수 num의 값이 12345라면 '1+2+3+4+5'의 결과인 15를 출력하라.****/
			int num=0;
			 sum=0;
			 
			 while(num>0) {
				 sum += num%10;//5  4  3 2 1
				 num/=10;//1234  123 12 1  0
			 }
			
			
			
			
	} //main의 끝
	}
}
