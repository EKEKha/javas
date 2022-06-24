import java.util.Scanner;

public class CafeOrder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("----------stop 입력받을 때 까지 주문받음------------");
		int i=1;
		int sum=0;
		int a =0;//아메리카노 조문횟수
		int c=0;//카페라떼 주문횟수
		int p=0;//카푸치노 주문횟수
		
		outer:do {
		
			System.out.print("3번만 주문-2: 메뉴(아메리카노,카페라떼,카푸치노)중에서 주문(단,주문안함 입력시 바로 나감 stop입력 시 주문멈춤)");
		   String order = sc.next();//"stop"
		   //System.out.println(order+"를 주문하셨습니다.");
	
			
			i++;
			
			
			
			switch(order){
		
			case "아메리카노" : sum+=3000;a+=1; System.out.println(order+"를 주문하셨습니다.");break;
			case "카페라떼"  : sum+=4000;c+=1; System.out.println(order+"를 주문하셨습니다.");break;
			case "카푸치노"  : sum+=3500;p+=1; System.out.println(order+"를 주문하셨습니다.");break;
					
			case "주문안함" :	System.out.println("주문을 그만둡니다");break outer;
					  
			case "stop" : System.out.println("그만 주문하겠습니다.");break;		  
			default      :System.out.println("메뉴에 없습니다."); break;
			}
			
			if(i<=3)
			continue;{
				System.out.println("----영수증출력------");
				if(a!=0)System.out.print("아메리카노"+a+"잔"+(a*3000)+"원");
				if(c!=0)System.out.print("카페라떼"+c+"잔"+(c*4000)+"원");
				if(p!=0)System.out.print("카푸치노"+p+"잔"+(p*3500)+"원");
				
				System.out.println();
				System.out.println("총"+(a+c+p)+"잔 주문,"+"주문금액은 "+sum+"입니다.");}
			
			
			
		}while(i<=3);
	   
			
		System.out.println();
		
	}
	}


