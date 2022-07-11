
public class OverloadingTest {

	public static void main(String[] args) {
	
		MyMath3 mm= new MyMath3();
		System.out.println("mm.add(3,3)결과:" + mm.add(3,3));
		// 위의 문장을 두문장으로 표현하면
		// int result =mm.add(3,3);
		// System.out.println("mm.add(3,3)결과:"+ result;
		System.out.println("mm.add(3L,3)결과:" + mm.add(3L,3));
		System.out.println("mm.add(3,3L)결과:" + mm.add(3,3L));
		System.out.println("mm.add(3L,3L)결과:" + mm.add(3L,3L));
		
		int [] a = {100,200,300};
		System.out.println("mm.add(a)결과 :"+mm.add(a));

	}

}// add 메서드의 printf가 먼저 출력, println메서드 출력하려면 add메서드 결과가 먼저 계산되어야 하기 때문
// ㅑ

class MyMath3{
	int add(int a,int b) {
		System.out.print("int add(int a, int b)-");
		return a+b;
	}
	
	long add(int a,long b) {
		System.out.print("int add(int a, int b)-");
		return a+b;
		
	}
	
	long add(long a,int b) {
		System.out.print("int add(int a, int b)-");
		return a+b;
	}
	
	long add(long a,long b) {
		System.out.print("int add(int a, int b)-");
		return a+b;
	}
	
	int add(int[] a) {//배열의 모든 요소의 합을 결과로 돌려준다.
		System.out.print("int add(int[] a)-");
		int result=0;
		for(int i=0;i<a.length;i++) {
			result += a[i];
		}
		return result;
	}
}