package chapter6;

import java.util.Arrays;

public class Excercise6_6 {
	
	public static int[] shuffle(int [] arr) {//반환타입 int[]  int[]arr-정수값이 담긴배열
		if(arr==null||arr.length==0) 
			return arr; //값의 유효성 체크
			
		for(int i=0;i<arr.length;i++) {
			int j=(int)(Math.random()*arr.length);
			
			int tmp=arr[i];
			arr[i]=arr[j];
			arr[j]=tmp;
		}
		return arr;
		
	}

	public static void main(String[] args) {
		int[] original= {1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(original));
		
		int[] result=shuffle(original);
		System.out.println(Arrays.toString(original));
	}

}
