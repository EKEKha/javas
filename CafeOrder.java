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
		
		
		
		

		
				/** [과제] 출력결과
				 * stop 입력받으면 아메리카노 2잔에 6000원, 카페라떼 1잔에 4000원(주의 : ,콤마 없어요~~) 
				 * 총 3잔, 총 가격은 10000원 입니다.
				 */
				
				//System.out.println("--do~while문 카페 주문 처리 시작-------------------------------");
				Scanner sc = new Scanner(System.in);
				
				String order=null;
				
				final int priceAmericano = 3000, priceCaferate = 4000, priceCafuchino = 3500;//가격 변경 불가
				
				
				int cntAmericano=0;//아메리카노 주문 횟수
				int cntCaferate=0;//카페라떼 주문 횟수
				int cntCafuchino=0;//카푸치노 주문 횟수
				
				int totalCntAmericano = 0;//아메리카노 누적 주문 횟수
				int totalCntCaferate = 0;//카페라떼 누적 주문 횟수
				int totalCntCafuchino = 0;//카푸치노 누적 주문 횟수
				
				int totalCnt = 0;//총 주문 횟수
				int totalPrice = 0;//총 지불 가격
				
				/* do~while문 사용이유? 적어도 한번은 주문을 받아야 하므로 */
				do {
					System.out.print(
							"\n------메뉴------------------\n"
							+ "아메리카노(=Americano) 3000원\n"
							+ "카페라떼              4000원\n"
							+ "카푸치노              3500원\n"
							+ "주문종료              stop\n"
							+ "주문안함    주문안함(=NoOrder)\n"
							+ "-------------------------\n"
							+ "--손님 주문해주세요> ");
					
					order = sc.next().trim().toLowerCase();//"소문자"
					
					if(order.equalsIgnoreCase("NoOrder") || order.equals("주문안함")) {
						System.out.println("주문없이 바로 나가셨습니다.");
						break; //가장 가까운 반복문이 끝
					}
					
					switch(order) {
					case "아메리카노":
					case "americano" : System.out.println(order + "를 주문하셨습니다.");
					
									   System.out.print("-- 몇 잔을 주문하시겠습니까? > ");		
									   cntAmericano = sc.nextInt();
									   if(cntAmericano > 0) {
										   System.out.println(order + " " + cntAmericano + "잔을 주문하셨습니다.");
									   }else {
										   System.out.println("0보다 큰 수를 입력해주세요~");								   
									   }
									   
									   totalCntAmericano += cntAmericano;
									   
									   totalCnt += cntAmericano;
									   totalPrice += (cntAmericano*priceAmericano);
									   
						               break;
					
					case "카페라떼"  :   System.out.println(order + "를 주문하셨습니다.");
					
									   System.out.print("-- 몇 잔을 주문하시겠습니까? > ");		
									   cntCaferate = sc.nextInt();
									   if(cntCaferate > 0) {
										   System.out.println(order + " " + cntCaferate + "잔을 주문하셨습니다.");
									   }else {
										   System.out.println("0보다 큰 수를 입력해주세요~");								   
									   }
									   
									   totalCntCaferate += cntCaferate;
									   
									   totalCnt += cntCaferate;
									   totalPrice += (cntCaferate*priceCaferate);
					   
									   break;
									   
					case "카푸치노"  :   System.out.println(order + "를 주문하셨습니다.");
					
									   System.out.print("-- 몇 잔을 주문하시겠습니까? > ");		
									   cntCafuchino = sc.nextInt();
									   if(cntCafuchino > 0) {
										   System.out.println(order + " " + cntCafuchino + "잔을 주문하셨습니다.");
									   }else {
										   System.out.println("0보다 큰 수를 입력해주세요~");								   
									   }
									   
									   totalCntCafuchino += cntCafuchino;
									   
									   totalCnt += cntCafuchino;
									   totalPrice += (cntCafuchino*priceCafuchino);
						
									   break;
					
					case "stop"    :  if(totalCnt > 0) System.out.println("그만 주문하겠습니다.");
					                  else {
					                	  System.out.println("아직 주문하시지 않았습니다.");
					                	//continue;아래 실행문들은 건너띄고 while(조건문);으로 가서 조건이 거짓이 되어 반복문이 끝
					                	//continue; //사용하면 원하는 결과를 얻을 수 없다.
					                	  order = "아직 주문안함"; //"stop" 제외한 아무 문자열로 초기화 가능=>while(조건문);으로 가서 조건이 참이 되어 반복문 시작 	                	  
					                  }
					                  break;//switch문 빠져나감*/
					     /*             
						 if(totalCnt > 0) {
						        System.out.println("그만 주문하겠습니다.");
								System.out.println("***********[영수증]*****************************"); 
								String result = "";							
								if(totalCntAmericano>=1) {
									result += "아메리카노 "+totalCntAmericano+"잔에 "+(priceAmericano*totalCntAmericano)+"원, ";
									//if(cntCaferate>=1 || cntCafuchino>=1) System.out.print(", ");//, 처리
								}
						
								if(totalCntCaferate>=1) {
									result += "카페라떼 "+totalCntCaferate+"잔에 "+(priceCaferate*totalCntCaferate)+"원, ";
									//if(cntCafuchino>=1) System.out.print(", ");//, 처리
								}
								
								if(totalCntCafuchino>=1) {
									result += "카푸치노 "+totalCntCafuchino+"잔에 "+(priceCafuchino*totalCntCafuchino)+"원, ";
								}
								
								if(result.length()>0) System.out.println(result.substring(0, result.length()-2));
								System.out.println("\n총 "+ totalCnt +"잔, 총 가격 = "+ totalPrice +"원");			
							
								System.out.println("***********[영수증]*****************************"); 
								
							}else {
			                	System.out.println("아직 주문하시지 않았습니다.");
			                  //continue;아래 실행문들은 건너띄고 while(조건문);으로 가서 조건이 거짓이 되어 반복문이 끝
			                  //continue; //사용하면 원하는 결과를 얻을 수 없다.
			                	order = "아직 주문안함"; //"stop" 제외한 아무 문자열로 초기화 가능=>while(조건문);으로 가서 조건이 참이 되어 반복문 시작 	                	  
			                }	
							
							break;//switch문 빠져나감
						*/	
					              
					              
					default      : System.out.println("메뉴에 없습니다.");//break;
					}//switch문 끝
					
					
				}while(!order.equalsIgnoreCase("stop"));	
				//}while(order.toLowerCase().compareTo("stop") != 0);
				
				
				if( !(order.equalsIgnoreCase("NoOrder") || order.equals("주문안함")) && totalPrice>0) {
					System.out.println("***********[영수증]*****************************"); 
					String result = "";							
					if(totalCntAmericano>=1) {
						result += "아메리카노 "+totalCntAmericano+"잔에 "+(priceAmericano*totalCntAmericano)+"원, ";
						//if(cntCaferate>=1 || cntCafuchino>=1) System.out.print(", ");//, 처리
					}
			
					if(totalCntCaferate>=1) {
						result += "카페라떼 "+totalCntCaferate+"잔에 "+(priceCaferate*totalCntCaferate)+"원, ";
						//if(cntCafuchino>=1) System.out.print(", ");//, 처리
					}
					
					if(totalCntCafuchino>=1) {
						result += "카푸치노 "+totalCntCafuchino+"잔에 "+(priceCafuchino*totalCntCafuchino)+"원, ";
					}
					
					if(result.length()>0) System.out.println(result.substring(0, result.length()-2));
					System.out.println("\n총 "+ totalCnt +"잔, 총 가격 = "+ totalPrice +"원");			
				
					System.out.println("***********[영수증]*****************************"); 
				}
				
				
				//System.out.println("--do~while문 카페 주문 처리 끝--------------------------------");

	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	}
