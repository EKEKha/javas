

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
			int num=12345;
			 sum=0;
			 
			 while(num>0) {
				 sum += num%10;//5  4  3 2 1
				 num/=10;//1234  123 12 1  0
			 }
			System.out.println("sum="+sum);
			
			 
			 
	/**[4-11]ㅍ보나치 수열은 앞의 두 수를 더해사 다음수를 만들어 나가는 수열이다 1,1,2,3,5,8,13.....
	 * 1과 1부터 시작하는 피보나치수열의 10번째 수는 무엇인지 계산한느 프로그램을 완성하시오**/
			int num1=1;
			int num2=1;
			int num3=0; //세번째 값
			System.out.print(num1+","+num2);
			
			for(i =0; i<8; i++) {
				num3=num1+num2; //세번째 값은 첫번째와 두번째 값을 더해서 얻는다.
				System.out.print(","+num3);
				
				num1=num2;
				num2=num3;
			}
			 System.out.println();
			 
	/**[4-12]구구단의 일부분을 다음과 같이 출력하시오.★★★★!!!!********/	 
		for(i=1; i<=9;i++) {
			for(int j=1;j<=3;j++) {
				int x= j+1+(i-1)/3*3; //단을 의미
				int y= i%3==0? 3 : i%3;//곱하는숫자
				
				if(x>9) //9단까지만출력
					break;
			
				System.out.print(x+"*"+y+"="+x*y+"\t" );
			}
		 System.out.println();
		 if(i%3==0)System.out.println();
		}
		

			 
	/**[4-13]다음은 주어진 문자열(value)이 숫자인지를 판별하는 프로그램이다.***/		 
			String values="12o34";
			char ch=' ';
			boolean isNumber=true;
			
			//반복문과 charat(int i)를 이용해서 문자열의 문자를 하나씩 읽어서 검사한다.
			for(i=0; i<values.length();i++) {
				ch= values.charAt(i);
				
				if(!('0'<=ch && ch<='9')) {
					isNumber=false;
					break;
					
				}
			}
			
			 if(isNumber) {
				 System.out.println(values+"는 숫자입니다.");
			 }else {
				 System.out.println(values+"는 숫자가 아닙니다.");
			 }
			 
		
	 /**[4-14]숫자맞추기 게임 .1~100사이의 값을 반복적으로 입력해서 컴퓨터가 생각한 값을 맞추면 게임이끝난다.
	  * 사용자가 값을 입력하면, 컴퓨터는 자신이 생각한 값과 비교해서 결과를 알려준다.
	  * 사용자가 컴퓨터가 생각한 숫자를 맞추면 게임이 끝나고 몇번만에 숫자를 맞췄는지 알려준다.***/		 
			 //1~100 사이의 임이의 값을 얻어서 answer에 저장한다.
			 int answer=(int)(Math.random()*100)+1;
			 int input=0; //사용자 입력을 저장할 공간
			 int count=0;// 시도 횟수를 세기위한 변수
			 
			 //화면으로부터 사용자 입력을 받기위해서 Scanner클래스 사용
			 java.util.Scanner s=new java.util.Scanner(System.in);
			 
			 
			 do {
				 count++;
				 System.out.print("1과 100사이의 값을 입력하세요:");
				 input=s.nextInt();//입력받은 수를 input에 저장한다.
				 
				 if(answer>input) {
					 System.out.println("더 큰 수를 입력하세요.");
				 }else if(answer<input) {
					 System.out.println("더 작은 수를 입력하세요");
				 }else {
					 System.out.println("맞췄습니다.");
				   	 System.out.println("시도횟수는 "+count+"번입니다.");
				   	 break;  //do while문을 벗어난다.
				 }
				
				 
			 }while(true);//무한 반복
			 
			 
			 
		/**[4-16]다음은 회문수를 구하는 프로그램이다. 회문수란 숫자를 거꾸로 읽어도 앞으로 읽는것과 같은 수를말한다.
		 * 12321이나 13531 같은 수... 나머지연산자를 이용하여 프로그램 완성하라..***/		 
			 
			 int number=12321;
			 int tmp=number;
			 
			 int result=0; //변ㅅ num을 거꾸로 변환해서 담을 변수
			 
			 while(tmp !=0) {
				 result= result*10+tmp%10 ;// 기존결과에 10을 곱해서 더한다. 4-10과 같은원리
						tmp/=10;
			 }
			 if(number==result)
				 System.out.println(number+"는 회문수입니다.");
			 else
				 System.out.println(number+"는 회문수가 아닙니다.");
			
			 
			 
/*			 result   result*10    tmp     tmp%10
			 0		 	0		   12345     5
			 5	        50         1234      4
			 54			540		   123	     3
			 543		5430		12		 2
			 5432		54320		1	     1
			54321		-			0        -

		*/
	}
}
