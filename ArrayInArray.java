import java.util.Arrays;

public class ArrayInArray {

	public static void main(String[] args) {
		/************2차원 배열 선언하는 방법-1*******************************/
		System.out.println("*******2차원 배열 선언하는 방법-1**************");
		int[][] m = new int[2][3];//[2행][3열]
		
		System.out.println(Arrays.toString(m[0]));//[m0](=주소)가 참조하는 배열객체의 값을 출력 [0,0,0]
		System.out.println(Arrays.toString(m[1]));//기본값으로 채워진 배열객체 출력 [0,0,0]
		System.out.println();//구분위한 빈줄
		
		int i;
		
		for(i=0;i<m.length;i++) {
			System.out.println(Arrays.toString(m[i]));
		}
		System.out.println();//구분위한 빈줄
		
		System.out.println("**향상된 for문 :index사용안함(index로 접근해야만 하는상황에서는 사용못함");
	     
		
		for(int[] arr:m) {//받으려는 타입과 똑같은 타입으로 선언해줘야함 
			System.out.println(Arrays.toString(arr));
		}
		
		System.out.println("***for문 사용안하고 출력");
		System.out.print("[");
		System.out.print(m[0][0]+", ");
		System.out.print(m[0][1]+", ");
		System.out.print(m[0][2]);
		System.out.println("]");//커서를 아래로
		
		System.out.print("[");
		System.out.print(m[1][0]+", ");
		System.out.print(m[1][1]+", ");
		System.out.print(m[1][2]);
		System.out.println("]");//커서를 아래로
		
		System.out.println("**배열의 값 변경 후 출력 ******");
		
		
		m[0][0]=95;  m[0][1]=100; m[0][2]=87;
		m[1][0]=83;  m[1][1]=92;  m[1][2]=78;
		
		
		for(int[] arr:m) {//받으려는 타입과 똑같은 타입으로 선언해줘야함 
			System.out.println(Arrays.toString(arr));
		}
		
		
		System.out.println();//구분위한 빈줄
		
		
		
		/*
		 * 7-1 [과제-1]
		 * 중첩된 for문을 이용하여 아래 내용 출력
		 * [95,100,87]
		 * [83,92,78]
		 */
		System.out.println("----[과제1] m이 참조하는 배열------");
		
			
		 for(i=0;i<m.length;i++) {
			 System.out.print("[");
			 for(int j=0;j<m[i].length;j++) {
				
				if(j<m.length) System.out.print(m[i][j]+", ");
				else System.out.print(m[i][j]+"]");
			 }
			
			 System.out.println();
			
		 }
		
		System.out.println("******2차원 배열 선언하는방법 -2");
		int[][] e = new int[2][]; //주소에 null값 [null,null]출력 //열의 갯수가 다를때 null값으로 하고 밑에서 따로 선언 
		System.out.println(Arrays.toString(e));
		
		
		e[0]= new int[2];//1반 2명: [0,0] 기본값
		e[1]= new int[3];//2반 3명  [0,0,0] 기본값
		
		try {//예외가 발생할 가능성이 있는 부분
		e[0][0]=85; e[0][1]=99;  //e[0][2]=77;//1.이부분 예외가 발생하면 JVM이 예외격체를 던지는데
		e[1][0]=85; e[1][1]=100; e[1][2]=95;//1.★★★이부분이 실행되지 않고 던져짐
		}catch(Exception e1) {//2.예외객체가 생성되면 = 예외가 발생하면 잡아서 
			e1.printStackTrace();//3.처리
		}finally {//4.예외 발생 여부에 관계없이 try{}영역에 진입하면 무조건 실행
			System.out.println("4.예외 발생 여부에 관계없이 try{}영역에 진입하면 무조건 실행");
			//e[1][0]=85; e[1][1]=100; e[1][2]=95;예외발생해도 출력되게 하는 방법 1
		}
		//e[1][0]=85; e[1][1]=100; e[1][2]=95; 예외발생해도 출력되게 하는 방법 2

		System.out.println(Arrays.toString(e[0]));//[85,99]
		System.out.println(Arrays.toString(e[1]));//변경이 되지않아 [0,0,0] 
		
		
		
		System.out.println("----[과제2] e이 참조하는 배열------");
		
		 for(i=0;i<e.length;i++) {
			 System.out.print("[");
			 for(int j=0;j<e[i].length;j++) {
				System.out.print((j==0)?e[i][j]:", "+ e[i][j]);
			
			 }System.out.print("]"+"\n");
			
			
		 } 
		
		
		/****************2차원 배열 선언하는 방법-3********************************************************/
		
		System.out.println("*****2차원 배열 선언하는 방법-3********");
		int[][]s=new int[2][];
		
		s[0]=new int[] {87,93}; //기본값이 아닌 '초기값 배열' 객체 생성
		s[1]=new int[] {97,88,100};
		
		System.out.println("----[과제3] s이 참조하는 배열(향상된 for문)------");
	
	
		 
			 /*
			for(int value1:s[0]) {
				System.out.print(value1+" ");}
			System.out.println();
			
			for(int value1 :s[1]) 
		     System.out.print(value1+" ");
			System.out.println();
		    */
			
			for(int tmp[]:s) {// 2차원 배열 s에서 int tmp(1차원배열)로 행을 하나씩 가져오고 
				for(int value:tmp) {//안의 열의 값들을 순서대로 가져오겠다.
					System.out.print(value+" ");
				}System.out.println();
			}
		 
		
			
		/****************2차원 배열 선언하는 방법-4********************************************************/
		
		System.out.println("*****2차원 배열 선언하는 방법-4********");
		int[][] java={
						{95,97} ,       //1반 2명 java[0].length ==2
						{98,100,99,75}, //2반 4명 java[1].length ==4
						{100,88,92}    //3반 3명  java[2].length ==4
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
				for(i=0;i<java.length;i++) {
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
				System.out.println("java 성적의 총합="+javaSum+", 평균="+(javaSum/k));
				System.out.println("1반의 자바성적총합="+class1+", 평균="+avg1);
				System.out.println("2반의 자바성적="+class2+", 평균="+avg2);
				System.out.println("3반의 자바성적="+class3+", 평균="+avg3);
				
		
      
			
		
	}

}