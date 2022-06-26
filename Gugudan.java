import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		System.out.println("1-1. 구구단 출력 : 단 사이에 빈줄 넣기");
		int i;//단:2~9
		int j;//1~9
		for(i=2;i<=9;i++) {
			for(j=1;j<=9;j++) {
				System.out.println(i+ "X" +j+"="+(i*j));
				
			}
			System.out.println();
		}

		System.out.println("1-2. 구구단 출력 : 단 사이에 빈줄 넣기+ *제 몇 단*");
		for(i=2;i<=9;i++) {
			System.out.println("*제"+ i+"단*");
			for(j=1;j<=9;j++) {
				System.out.println(i+ "X" +j+"="+(i*j));
				
			}
			System.out.println();
		}

		System.out.println("2-1. 구구단 출력 : 옆으로출력");
		for(i=1;i<=9;i++) {
			
			for(j=2;j<=9;j++) {
				System.out.print(j+ "X" +i+"="+(j*i)+"\t");
				
			}
			System.out.println();//커서를 아래로
		}
		 System.out.println();
		
		 
		 //[과제-6/21일 ]
		System.out.println("2-2. 구구단 출력 : 옆으로출력+ 제몇단");
		
		//[방법1]
		for(i=2;i<=9;i++) {
			   	System.out.print("*제" + i + "단*"+"\t");
			   }
			  System.out.println();
		
		for(i=1;i<=9;i++) {
	
			for(j=2;j<=9;j++) {
				System.out.print(j+ "X" +i+"="+(j*i)+"\t");
		
			}
			System.out.println();//커서를 아래로
	       }

		System.out.println();//구분위한 빈줄
	
		
		//[방법2] for문안에 if문을 이용하여
		for (i =0; i <= 9; i++) {//i값을 0부터 시작
			
			for(j=2;j<=9;j++) {
				if(i==0) System.out.print("*제" + j + "단*"+"\t");
				else System.out.print(j+ "X" +i+"="+(j*i)+"\t");
			}
			System.out.println();
			
		}
		System.out.println();//구분위한 빈줄
		
		//[방법3]
		for(i=1;i<=9;i++) {
			if(i==1) {
				for(i=2;i<=9;i++) {//for(int k=2;k<=9;k++)새로운 k값을 주거나 j. i값이 10으로 되서 계산됨. 그렇다고 i값을 초기화1로하면 밑에 무한루트에 빠지게 됨
					System.out.print("*제"+i+"단*\t");
				}
				System.out.println();//커서를 아래로...
			}
			//i=1;//무한 루프에 빠짐
			for(j=2;j<=9;j++) {
				System.out.print(j+"X" +i+"="+(j*i)+"\t");
			}
			System.out.println();
		}

			
			System.out.println();// 커서를 아래로
		

		System.out.println();// 구분위한 빈줄
		
		
		//[과제6-21]
		System.out.println("3-1. 구구단 출력 : 2단~입력받은 단까지 아래로 출력");
		Scanner sc = new Scanner(System.in);
		System.out.print("단 입력:");
		int dan = sc.nextInt();
		
	
		
		for(i=2;i<=dan;i++) {//i:단
			
			for(j=1;j<=9;j++) {
				System.out.println(i+ "X" +j+"="+(i*j));
			
				}
			System.out.println();//구분위한 빈줄

			}
		System.out.println();//구분위한 빈줄
		
		
		
		System.out.println("3-1. 구구단 출력 : 2단~입력받은 단까지 옆으로 출력");
		
		System.out.print("단 입력:");
		dan = sc.nextInt();
		
	
		
		for(i=1;i<=9;i++) {
			
			for(j=2;j<=dan;j++) {//j단
				System.out.print(j+ "X" +i+"="+(j*i)+"\t");
			
				}
			System.out.println();//구분위한 빈줄

			}
		System.out.println();//구분위한 빈줄
		
		
		System.out.println("4-1. 구구단 중에서 두수를 곱해서 72가 되는 것만 아래로 출력");
		//순서[1]2~9단 아래로 출력 한다음 조건만족하는거 출력
		for(i=2;i<=9;i++) {
			for(j=1;j<=9;j++) {
				if(i*j ==72)System.out.println(i+"X"+j+"="+(i*j));
			}
			//System.out.println();//구분위한 빈줄 2~9 번 출력됨
		}
		System.out.println();//구분위한 빈줄
		
		
		System.out.println("4-2. 구구단 중에서 두수를 곱해서 8X9=72가 되는 것만 아래로 출력");
		//순서[1]2~9단 아래로 출력 한다음 조건만족하는거 출력
		for(i=2;i<=9;i++) {
			for(j=1;j<=9;j++) {
				if(i==8 && j==9)System.out.println(i+"X"+j+"="+(i*j));
			}
			
		}
		
		
		System.out.println();//구분위한 빈줄
		
		
		System.out.println("4-3. 구구단 중에서 두수를 곱해서 8X9=72가 되는 것만 아래로 출력후 바깥족 반복문 멈추기");
		//순서[1]2~9단 아래로 출력 한다음 조건만족하는거 출력
	outer:for(i=2;i<=9;i++) {
			for(j=1;j<=9;j++) {
				if(i==8 && j==9) {
					System.out.println(i+"X"+j+"="+(i*j));
					//break;//가장 가까운 반복문(=안쪽 for문)을 빠져나감
					break outer; //바깥쪽 for문 빠져나감 조건문을 만족하고 9단을 찾는 작업을 하지않기위해 
				}
			}//안쪽for문 바져나가면 여기로 옴 (i값이 다시 9가 되어 for문 수행)
			
		}//바깥쪽 for문 빠져나가면 여기로옴(=cpu의 효율 높아짐)
	
		System.out.println();//구분위한 빈줄
		
	}//main() 끝
}//class 끝