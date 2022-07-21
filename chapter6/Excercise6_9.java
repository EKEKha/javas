package chapter6;

class SutdaDeck{//섯다카드 1~0숫자가 적힌 카드가 한쌍씩 있고, 숫자가1,3,8인경우에는 둘중의 한장은 광이어야한다.즉 인스턴스변수 isKwawng의 값이 true이어야한다.
	final int CARD_NUM=20;
	SutdaCard[] cards=new SutdaCard[CARD_NUM];//
	
	SutdaDeck() {//섯다카드 20장을 담는 SutdaCard배열 초기화 
		for(int i=0;i<cards.length;i++) {
			int num=i%10+1;//1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10
			boolean isKwang =(i<10)&&(num==1||num==3||num==8);//숫자가ㅏ 1,3,8인 경우에는 둘중의 한장은 광이어야한다.
			//i가 2이고 num이 3이라면 =>  true 
			cards[i]=new SutdaCard(num,isKwang);
		}
	}
	void shuffle() {//배열 cards에 담긴 카드위 위치를 뒤섞는 메서드
		for(int i=0;i<cards.length;i++) {
			int j=(int)(Math.random()*cards.length);
			
			//cards[i]와 cards[j] 값을 서로 바꾼다.
			SutdaCard tmp= cards[i];
			cards[i]=cards[j];
			cards[j]=tmp;
					
		}
	}
	
	SutdaCard pick(int index) {//ㅂ반환타입 SutdaCard 배열 cards에서 지정된 위치의 SutdaCard반환
		if(index<0||index>=CARD_NUM)//배열의 범위를 넘지않게 index의 유효성 검사필요.
			return null;
		return cards[index];
	}
	SutdaCard pick() {//반환타입 SutdaCard 배열 cards에서 임의의 위치의 SutdaCard를 반환
		int index=(int)(Math.random()*cards.length);
		return pick(index);// pick(int index)를 호출한다.
	}
}//SutdaDeck

class SutdaCard {
	int num;
	boolean isKwang;
	
	SutdaCard(){
		this(1,true);//this.num=1; this.isKwang=ture; 를 한줄로 표현 재사용성이 높고 코드를 수정할 때도 유리
	}
	
	SutdaCard(int num,boolean isKwang){
		this.num=num;
		this.isKwang=isKwang;
	}
	
	//info()대신 Object클래스의 toString()을 오버라이딩햇다.
	public String toString() {
		return num+(isKwang ? "K":"");
	}
}


public class Excercise6_9 {

	public static void main(String[] args) {
		SutdaDeck deck=new SutdaDeck();
		
		System.out.println(deck.pick(0));//섞기전 1k로 고정
		System.out.println(deck.pick());//index 위치 반환 math.random() 사용으로 값이 계속 바뀜
		deck.shuffle();//메서드로 섞고(math.random())
		
		for(int i=0;i<deck.cards.length;i++) //섞은 배열을 출력
			System.out.print(deck.cards[i]+",");
		
		System.out.println();
		System.out.println(deck.pick(0));//그 배열의 index가 0인 값 출력
		}
	}

