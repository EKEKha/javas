package everyda;

public class Excercise4_1 {
	
	public static void main(String [] args) {
		
		/*4-2 1부터 20까지의 정수중에서 2또는 3의 배수가 아닌 수의 총합을 구하시오.*/
		int sum=0;
		
		for(int i=1;i<=20;i++) {
			if(i%2!=0 && i%3!=0) {
				sum += i;
			}
		}
		System.out.println("sum="+sum);
	
		
		/*4-3 1+(1+2)+(1+2+3)+(1+2+3+4.....(1+2+3+...+10)의 결과를 계산하시오.*/
		 sum=0;
		 int totalSum=0;
		
		for(int i=1;i<=10;i++) {
			sum+=i;
			totalSum+=sum;
		}
		
		System.out.println("totalSum="+totalSum);
		
		
		/*4-4  1+(-2)+3+(-4)+.....를 했을때 몇까지 더해야 총합이 100이상이 되는지 구하시오.*/
		 sum= 0; //총합을 저장할 변수
		 int s = 1; // 값의 부호를 바꿔주는데 사용할 변수
		 int num = 0; 
		 
		 for(int i=1;true;i++,s=-s) {//매 반복마다 s는 1,-1,1,-1........
			 num=s * i; // i와 부호 s 를 곱해서 더할 값을 구함
			 sum +=sum;
			 
			 if(sum>=100)
				 break;//가장 가까운 반복문을 빠져나감
		 }
		
		
		
		
	}
}
