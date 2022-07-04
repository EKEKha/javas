import java.util.Arrays;
import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		
		/****************2차원 배열 선언하는 방법-4********************************************************/
		
		System.out.println("*****2차원 배열 선언하는 방법-4********");
		int[][] java={
						{95,97} ,       //1반 2명 java[0].length ==2
						{98,100,99,75}, //2반 4명 java[1].length ==4
						{100,88,92}    //3반 3명  java[2].length ==3
					 };
		
		
		System.out.println("------[과제4]------------------------");
		/*
		 * 7.2[과제-2] 각 반의 java 성적의 합과 평균 구하기
		 * 			 java 성적의 총 합과 총 평균 구하기				
		 */
		
		int javaSum=0;  //java 성적총합을 담을 변수
	 double k=0;
		double avg1=0;
		double avg2=0;
		double avg3=0;
		int class1=0; //1반총합
		int class2=0; //2반총합
		int class3=0; //3반총합
				
		for(int i=0;i<java.length;i++) {
			for(int j=0;j<java[i].length;j++) {
			javaSum+=java[i][j];
			k++; //총 배열의 길이
				
		 		if(i==0) {
			 	 class1+=java[i][j];
			 	 avg1=(double)class1/java[i].length;
				}else if (i==1) {
				  class2 +=java[i][j];
				  avg2=(double)class2/java[i].length;
				}else {
				  class3+=java[i][j];
				  avg3=(double)class3/java[i].length;
				}
						 
					} 
				}
		
			System.out.println("1반의 자바성적총합="+class1+", 평균="+avg1);
			System.out.println("2반의 자바성적="+class2+", 평균="+avg2);
			System.out.println("3반의 자바성적="+class3+", 평균="+avg3);
			System.out.println("java 성적의 총합="+javaSum+", 평균="+(javaSum/k));
			
			System.out.println();
			
		
		System.out.println("------[과제4 방법2]------------");
	   
		
		int studentNum=0;	
		double sum;//이곳에서 초기화 하지 않아도 됨
		double totalSum=0;
		for(int i=0; i<java.length;i++) {
			
			sum=0;//각반의 성적을 출력하려면 출력하고 다시 초기화해줘야 하기 때문 위치중요★★
			for(int j=0;j<java[i].length;j++) {
				sum+= java[i][j];
				totalSum+=java[i][j];
			}
				//studentNum++; 
			
				//System.out.println((i+1)+"반의 합="+sum+", 평균="+sum/java[i].length);
			
			
				//format 정수(%d:10진수, %o:8진수, %x:16진수), 실수(%f)
				System.out.printf("%d반의 합=%.0f, 평균=%.2f\n",(i+1),sum,sum/java[i].length);
				studentNum += java[i].length;
				//sum=0; sum이 여기에 위치하려면 밖에서 0으로 초기화
		
			} 
		//System.out.println("java성적의 총 합="+totalSum+", 평균="+totalSum/studentNum);
		System.out.printf("총 합=%.0f,총 평균=%.2f \n", totalSum, totalSum/studentNum);
		
			/***************************************************
		//단계 1. 각반의 java성적 합과 평균 
		
			 double sum;
			for(i=0; i<java.length;i++) {
				
				sum=0;//각반의 성적을 출력하려면 출력하고 다시 초기화해줘야 하기 때문 위치중요
				for(j=0;j<java[i].length;j++) {
					sum+= java[i][j];
					
				}
					System.out.println(i+"반의 합="+sum+", 평균="+sum/java[i].length); //안쪽for문 다돌아갈때마다  각반마다 출력될수있도록
					
					
				}
			
			
		//단계 2. java 성적의 총 합과 평균 구하기
	     double totalSum=0; //반드시 이곳에서 0으로 초기화
	     int studentNum=0;//반드시 이곳에서 0으로 초기화
		for(i=0;i<java.length;i++) {
		     //studentNum+= java[i].length; //여기에 위치해도 상관 없음
		
			for(j=0;j<java[i].length;j++) {
				totalSum+=java[i][j];
				studentNum++; //9번실행
			}
			  studentNum += java[i].length;//3번실행,
			
		}System.out.println("java성적의 총 합="+totalSum+", 평균="+totalSum/studentNum);//한번만 출력하면되니 바깥for문
			
			
			
			**********************************************************/
		
		
		studentNum=0;	
		sum=0;//이곳에서 초기화 하지 않아도 됨
		totalSum=0;
		int c=1;
		System.out.println("-----과제 향상된 for로 출력 ");
		for(int tmp[]:java) {
		
			for(int value:tmp) {
			totalSum+=value;
			sum+=value;
		   
			}System.out.println(c+"반의 합="+sum+" 평균="+ sum/tmp.length);
			studentNum+=tmp.length;
			
			sum=0;
			c+=1;
			
		}System.out.println("총 합="+totalSum+", 총 평균="+totalSum/studentNum);
		
		
		char[] arr= {'J','A','V','A'};
	
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해 주세요>");
		int b =sc.nextInt();
		char [] arr5= new char [b+arr.length];
		arr5 = Arrays.copyOf(arr, arr.length+b); 

		
		for(int i=arr.length;i<arr5.length;i++) {
			System.out.print("문자 하나를 입력 해 주세요.");
			
		   String src=sc.next();
		   char input=src.charAt(0);
		   
		   arr5[i]+=input;
		}System.out.println(Arrays.toString(arr5));
		 
		 
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
