class Data2{int x;}


 class ReferenceReturnEx {
	public static void main(String[] args) {
		Data2 d = new Data2();
		d.x=10;
		
		Data2 d2= copy(d);//copy 메서드 호출 d가 매개변수 d에 복수단되
		System.out.println("d.x="+d.x);
		System.out.println("d2.x="+d2.x);
	}
	
	
	static Data2 copy(Data2 d) {
		Data2 tmp=new Data2();
		tmp.x=d.x;
		return tmp;//복사한 객체의 주소를 반환 => 반환 타입이 참조형이라는 것은 메서드가 객체의 주소를 반환한다는 뜻이다.
	}
	
	

}
