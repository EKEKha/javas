package cal;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		/*잘못된 방법
		 * 각부품생성, 사용자가 부품들을 알아야 하는 문제가 발생
		
		Add a = new Add();
		Sub s = new Sub();
		Mul m = new Mul();
		Div d = new Div();
	
		new Calculator(a,s,m,d);
		*/
		
		/**계산기 생성**/
		Calculator cal=new Calculator();
		//System.out.println("10+20="+cal.add(10, 20)*30);--반환타입이 있는경우는 그 반환값을 이용할때 쓰고자 할때
		//cal.add(10,20); --void 타입
			
		
		/*[과제]
		 * 
		스캐너 객체 생성 하여 두 수와 연산자를 입력받아 결과 출력
		stop 입력받으면 계산 종료한 후 실행횟수 출력 + 총 실행횟수도(totalCnt) 출력
		 * 
		 */
		Scanner sc=new Scanner(System.in);
		
		
		System.out.print("계산할 두  수 입력>");
		double n1=sc.nextDouble();
		double n2=sc.nextDouble();
		
		
		System.out.println("연산자 입력(+ - * /)>");
		String opr=sc.next();
		
		switch(opr) {
		case "+" :System.out.println(n1+"+"+n2+"="+cal.add(n1, n2));break;
		case "-" :System.out.println(n1+"-"+n2+"="+cal.sub(n1, n2));break;
		case "*" :System.out.println(n1+"*"+n2+"="+cal.mul(n1, n2));break;
		case "/" :System.out.println(n1+"/"+n2+"="+cal.div(n1, n2));break;
		default: System.out.println("해당 계산기에 없는 연산자이거나 잘못된 연산자입니다.");
		}
		
		
		cal.showOperatingTimes();
		
		
	}
}