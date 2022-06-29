
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
	    	
	    int []tmp = new int[arr.length*2]; //배열의 길이 10
	    
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
	     
	     
	     
	     
	     
	     
	     
	}

}
