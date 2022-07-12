package chapter6;

class Excercise6_1 {
	public static void main(String args[]) {
		SutdaCard card1=new SutdaCard(3,false);
		SutdaCard card2=new SutdaCard();//1 true
		
		System.out.println(card1.info()); //3출력
		System.out.println(card2.info()); //1k출력

	}

}


class SutdaCard{
	int num;
	boolean isKwang;
	
	SutdaCard(){
		this(1,true);  //this.num=1; this.isKwang=ture; 를 한줄로 표현 재사용성이 높고 코드를 수정할 때도 유리
		
	}
	
	SutdaCard(int num,boolean isKwang){
		this.num=num;
		this.isKwang=isKwang;
	}
	
	String info() { //숫자를 문자열로 반환 광인경우 k를 덧붙인다.
		return num + (isKwang?"K":"");
	}
}