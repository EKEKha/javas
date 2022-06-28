
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
	}

}
