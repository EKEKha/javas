

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
	
	} 

}
