package chapter6;

public class Excercise6_2 {

	public static void main(String[] args) {
		Student s =new Student();
		s.name="홍길동";
		s.ban = 1;
		s.no=1;
		s.kor=100;
		s.eng=60;
		s.math=76;
		
		System.out.println("이름:"+s.name);
		System.out.println("총점:"+s.getTotal());
		System.out.println("평균:"+s.getAverage());

	}

}

class Student{
	String name;
	int ban; 
	int no;  //번호
	int kor;
	int eng;
	int math;
	
	int getTotal() {
		return kor + eng + math;
		
	}
	
	
	/* 총점이 int 타입이기때문에 3으로 나누면 결과도 int라 소수점 이하의 값은 버려지게된다.
    3f 나누면 소수점 이하 값얻을수 있음.
    소수점 둘째 자리에서 반올림 과정 
    236/3f=78.666664--------->78.7 나오도록...
    236/3f*10=786.66664
    236/3f*10+0.5 =787.16664
    int로 강제 형변환하면 787
    다시 소수점나오기위해 10f로 나누면 78.7*/

	float getAverage() {
		return (int)(getTotal()/3f*10+0.5f)/10f;
	}
	
}






