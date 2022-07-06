import java.util.Arrays;

public class Excercise5 {

	public static void main(String[] args) {
		
		/*************배열의복사 for문 이용*********/
	    int [] arr= new int[5];
	    
	    for(int i=0;i<arr.length;i++) {
	    	arr[i]+=i+1;  // 배열에 1~5 저장
	    }
	    	
	    System.out.println("[변경전]");
	    System.out.println("arr.length :"+ arr.length);
	    for(int i=0;i<arr.length;i++) {
	    	System.out.println("arr["+i+"]:" + arr[i]);
	    }
	    	
	    int[]tmp = new int[arr.length*2]; //배열의 길이 10
	    
	    for(int i=0;i<arr.length;i++) {
	    	tmp[i]=arr[i];
	    }
	    	
	    arr=tmp; //tmp에 저장된값을 arr에 저장한다. 주소값 복사
	    
	    System.out.println("[변경후]");
	    System.out.println("arr.length :"+ arr.length);
	    for(int i=0;i<arr.length;i++) {
	    	System.out.println("arr["+i+"]:" + arr[i]);
	    }
	    
	    System.out.println();
	    
	    /*************배열의복사 System.arraycopy()*******************************/
	    char[]abc = {'A','B','C','D',};
	    char [] num = {'0','1','2','3','4','5','6','7','8','9'};
	    System.out.println(abc);
	    System.out.println(num); //char배열은 for문을 사용하지 않고도 print나 println으로 출력가능함
	    
	    //배열 abc와 num을 붙여서 하나의 {result}로 만든다.
	     char [] result = new char[abc.length+num.length];
	     System.arraycopy(abc, 0, result, 0, abc.length);//abc[0]에서 result[0]~ abc의 길이만큼.
	     System.arraycopy(num, 0, result, abc.length, num.length);
	     System.out.println(result);
	     
	     //배열 abc를 배열 num의 첫번째 위치부터 배열 abc의 길이만큼 복사
	     System.arraycopy(abc, 0, num, 0, abc.length);
	     System.out.println(num);
	     
	    //number의 인덱스6 위체에 3개를 복사
	     System.arraycopy(abc, 0, num, 6, 3);
	     System.out.println(num);
	    
	     
	     /****************배열 최대값 최소값 구하기*********************************************/
	     int [] score= {79,88,91,33,100,55,95};
	     
	     int max=score[0]; //배열의 첫번째 값으로 최대값을 초기화 한다.
	     int min=score[0]; //배열의 첫번째 값으로 최소값을 초기화 한다.
	     
	     for(int i=1; i<score.length;i++) {
	    	 if(score[i]>max) max=score[i];
	    	 else if(score[i]<min) min=score[i];
	     }
	     
	     
	     System.out.println("최대값="+ max);
	     System.out.println("최소값="+ min);
	     
	     
	     
	     /*************************배열내용섞기**********************************************/
	     
	     int [] numArr = new int[10];
	     
	     for(int i=0;i<numArr.length;i++) {
	    	 numArr[i]=i; // 배열을 0~9의 숫자로 초기화한다.
	    	 System.out.print(numArr[i]);
	     }
	     System.out.println();
	     
	     for(int i=0;i<100;i++) {
	    	 int n= (int)(Math.random() * 10); // 0~9값 중 임이의 값을 얻는다.
	    	 int tmp2=numArr[0];
	    	 numArr[0]=numArr[n];
	    	 numArr[n]= tmp2;
	     }
	     
	     for(int i=0;i<numArr.length;i++)
	    	 System.out.print(numArr[i]);
	     
	     System.out.println();
	     
	     /****************************로또번호*********************************************/
	     int [] ball=new int [45]; // 45개의 정수값을 저장히기 위한 배열 생성.
	     
	     for(int i=0;i<ball.length;i++) {
	    	 ball[i]=i+1; //ball[0]에 1이저장된다.

	     }
	     
	     int temp=0; //두 값을 바꾸는데 사용할 임시변수
	     int j=0;
	     
	     // 배열의 i번째 요소와 임의의 요소에 저장된 값을 서로 바꿔서 값을 섞는다.
	     // 0번째부터 5번째요소까지 모두 6개만 바꾼다. 6개만 바꿔도 충분
	     for(int i=0;i<6;i++) {
	    	 j=(int)(Math.random()*45); // 0~44범위의 임의이 값을 얻ㄷ는다.
	    	 temp=ball[i];
	    	 ball[i]= ball[j];
	    	 ball[j]=temp;
	     }
	     
	     //배열 ball의 앞에서부터 6개의 요소를 출력한다.
	     for(int i=0; i<6;i++)
	    	 System.out.printf("ball[%d]=%d%n",i,ball[i]);
	     
	     //arr2배열에 code배열값 무작위로 담기
	     int[]code= {-4,-1,3,6,11}; //불연속적인 값들로 구성된 배열
	     int[]arr2= new int[10]; 
	     
	     for(int i=0;i<arr2.length;i++) {
	    	 int tmp2=(int)(Math.random()*code.length);// tmp는 0,1,2,3,4,
	    	 arr2 [i] = code[tmp2];//code 배열 내용이무작위로 중복되서 10개만큼 담겨짐 
	     }
	     System.out.println("arr2="+Arrays.toString(arr2));
	     
	     
	     /************길이가 10인 배열에 0~9사이 임의의값 채우고 크기순으로 정렬하는 예제***********************************/
	     int[] numArr2=new int [10];
	     
	     for(int i=0;i<numArr2.length;i++) {
	    	 System.out.print(numArr2[i]=(int)(Math.random()*10));//길이가 10인 배열에 0~9 임의의 값으로 채운다
	    	 //numArr2[i]=(int)(Math.random()*10);
	    	 // System.out.print(numArr2[i]);  두문장을 합친것
	     }
	     System.out.println();//ㅈㄹ바꿈
	     System.out.println("↑초기상태");
	     
	     
    	 /***본격적인 정렬과정*********/
	     for(int i=0;i<numArr2.length-1;i++) {
	    	 boolean changed =false;  //자리바꿈이 발생했는지 체크.
	    	
	    	 for( j=0;j<numArr2.length-1-i;j++) {//길이가 5이면 4번만 비교 6이면 5번만 비교 그래서 -1
	    		 //-i을 하는이유 : i=0 즉 첫번째 비교하면 비교작업은 끝까지 다되지만 작업수행후 마지막자리에 최대값이 놓여지게된다
	    		 //i=1 두번째비교하면 i=0이었을때 마지막자리에 최대값이 정해지게된 상태 굳이 더이상 비교해볼 필요가없어짐
	    		 if(numArr2[j]>numArr2[j+1]) {
	    			 int temp3=numArr2[j];
	    			 numArr2[j]=numArr2[j+1];
	    			 numArr2[j+1]=temp3;
	    			 changed=true; // 자리바꿈이 발생했으니 changed를 true로
	    			  }
	    		 
	    	 }//for j 끝
	    	 if (!changed) break; //자리바꿈이 없으면 반복문 벗어남 changed는 그대로 false고 !changed =true 
	    	 
	    	 /**********for문을 이용한 배열출력, 정렬과정을 보기위해 for문 안에 넣었다.*************/
	    	 for(int k=0;k<numArr2.length;k++) 
	    		 System.out.print(numArr2[k]); //정렬된 결과를출력
	    	 System.out.println();	 
	    	
	     }//end for i
	     
	     
	     
	     /**********배열에 담긴값 갯수 알기******************************************/
	     int [] numArr3=new int[10];
	     int [] counter=new int[10];//해당 인덱스의 값이 몇번 나타났는 지 알수 있음 numArr[0]의 값이 4 [1]의 값이 4라고 치면
	     //counter [4]에 1씩 증가하면서 2가됨. numArr3배열에 4개 몇개있는지 알수있음 
	     
	     for(int i=0;i<numArr3.length;i++) {
	    	 numArr3[i]=(int)(Math.random()*10);
	    	 System.out.print(numArr3[i]);
	     }System.out.println();
	     
	     
	     for(int i=0;i<numArr3.length;i++) {
	    	 counter[numArr3[i]]++; //0인 counter 배열에다가 +1씩
	     }
	     for(int i=0;i<numArr3.length;i++) {
	    	 System.out.println(i+"의 개수 :"+counter[i]);
	     }
	     
	
	/**5-5. 1~9사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 만들어내는 프로그램이다.********/	
	
	     int [] ballArr = {1,2,3,4,5,6,7,8,9}; //length:9
	     int [] ball3 = new int[3];
	     
	     //배열 ballArr의 요소를 골라서 위치를 바꾼다.
	     for(int i=0;i<ballArr.length;i++) {
	    	 j= (int)(Math.random()*ballArr.length); //0~9 index번호를 random 할거라 ..
	    	 int tmp1= 0;
	    	 
	    	 tmp1=ballArr[i];
	    	 ballArr[i]=ballArr[j];
	    	 ballArr[j]=tmp1;
	    	//위치를 서로 섞는 과정
	     }
	     //배열 ballArr의 앞에서 3개의 수를 배열 ball3로 복사한다.
	     System.arraycopy(ballArr,0,ball3,0, 3);
	     System.out.println(Arrays.toString(ball3));
	
	
	
	/*****5-6 거스름돈을 몇개의 동전으로 지불 할 수 있는지를 계산하는 문제이다.
	 * 변수money의 금액을 동전으로 바꾸었을 때 각각 몇개의 동전이 필요한지 계산해서 출력하라.
	 * 단, 가능한 적은 수의 동전으로 거슬러주어야한다. 나눗셈연산자,나머지연산자 이용
	 * **********************************************/
	 int [] coinUnit = {500,100,50,10};
	 
	 int money=2680;
	 System.out.println("money="+money);

	 for(int i=0;i<coinUnit.length;i++) {
		 System.out.println(coinUnit[i]+"원:"+money/coinUnit[i]);//5  1  1  3
		 money=money%coinUnit[i];//180  80  30  0
		 //일단 큰 단위인 500원부터 순서대로  나눗셈연산자 계산하는데 더이상 나눌수없는 나머지를 money의 값으로 변경 시켜줘야 다음 동전 갯수들을 알수있음.
	 }
	
	/****5-7 위의 문제 연동 커맨드라인으로부터 거슬러 줄 금액을 입력받아 계산한다. 보유한 동전의 개수로 거스름돈을 지불할 수 없으면,
	 * '거스름돈이 부족합니다.'라고 출력하고 종료한다. 지불할 돈이 충분히 있으면, 거스름돈을 지불한 만큼 가진 돈에서 빼고 남은 동전의 갯수를 화면에 출력한다.
	
	  if(args.length!=1) {
		  System.out.println("USAGE: JAVA EXCERCISE 5-7");
		  System.exit(0);
	  }
	 // 문자열을 숫자로 변환한다. 입력한 값이 숫자가 아닐 경우 예외발생
	  money=Integer.parseInt(args[0]);
	  
	  System.out.println("money="+money);
	  
	  int [] coin = {5,5,5,5};//단위별 동전의 갯수
	  
	  for(int i=0;i<coinUnit.length;i++) {
		  int coinNum=0;
		  
		  //1.금액money를 동전단위로 나눠서 필요한 동전의갯수 coinNum을 구한다.
		  coinNum=money/coinUnit[i];  
		  
		  //2.배열 coin에서 coinNum만큼의 동전을 뺀다. 만일 충분한 동전이 없다면 배열 coin에 있는만큼만 뺀다.
		  if(coin[i]>=coinNum) {
			  coin[i]-=coinNum;
			  
		  }else {
			  coinNum=coin[i]; //5개 다쓴경우 Num이 5가 되고 coin 동전의 갯수는 0이된다.
			  coin[i]=0;
		  }
		  //3.금액에서 동전의 개수와 동전단위를 곱한 값을 뺀다.
		  money -= coinNum*coinUnit[i];
		  
		  System.out.println(coinUnit[i]+"원:"+coinNum);
	  }
	  
	  //입력한 금액을 가지고있는 동전들로 처리를 해도 금액이 남아있는경우 
	 if (money>0) {
		 System.out.println("거스름돈이 부족합니다.");
		 System.exit(0);//프로그램 종료 
	 }
	 
	 //위의 if 문과 독립적
	 	System.out.println("=남은 동전의 개수=");
	 
	 	for(int i=0;i<coinUnit.length;i++) {
		 System.out.println(coinUnit[i]+"원"+coin[i]);
	 }
	 
	 	************/
	 
	 /******5-8 다음은 배열 answer에 담긴 데이터를 읽고 각 수자의 개수를 세어서 개수만큼 '*'을 찍어서 그래프를 그리는 프로그램이다**************/
	 // 잘 이해안됨!!!!!!!!!!!!!!!!!!!!!!!!!!!!! 
	 	int[]answer = {1,4,4,3,1,4,4,2,1,3,2};
	 	int[]counter1= new int [4];
	 	
	 	for(int i=0;i<answer.length;i++) {
	 		counter1[answer[i]-1]++;
	 	}
	 
	 	for(int i=0;i<counter1.length;i++) {
	 		System.out.print(counter1[i]);
	 		for(j=0;j<counter1[i];j++) {
	 			System.out.print("*");//counter1[i]의 값 만큼 *을 찍는다.
	 		}
	 		System.out.println();
	 	}
	 
	 /**********5-11 주어진 2차원 배열의 데이터보다 가로와 세로로 1이 더 큰 배열을 생성하여 배열의 행과 열의 마지막 요소에
	  * 각 열과 행의 총합을 저장하고 출력하는 프로그램이다.***********************************************************************/ 
	 int[][]score2= {
			 {100,100,100}
			, {20,20,20}
			, {30,30,30}
			, {40,40,40}
			, {50,50,50}
	 };		 
		
	 int[][]result2=new int[score2.length+1][score2[0].length+1]; //	 6, 4
	 
	 for(int i=0;i<score2.length;i++) {
		 for(j=0;j<score2[i].length;j++) {
			 result2[i][j]=score2[i][j];
			 
		 }
	 
	 
	 
	 }
	
	}

}
