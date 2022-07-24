package chapter7;

class MyTv2{
	private boolean isPowerOn;
	private int channel;
	private int volume;
	private int prevChannel; //이전채널로 이동하는 메서드를 추가하기 위해 변수도 추가
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME=0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL =1;
	
	
	
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		if(channel>MAX_CHANNEL || channel < MIN_CHANNEL) //매개변수가 있는 매서드는 유효성 검사 추가
			return;
		
		prevChannel=this.channel; //현재 채널을 이전 채널에 저장한다.
		this.channel = channel;
	}
	public void gottoPrevChannel() {
		setChannel(prevChannel); // 현재채널을 이전 채널로 변경한다.
	}
	
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		if(volume>MAX_VOLUME || volume < MIN_VOLUME) //매개변수가 있는 메서드는 유효성 검사 추가
			return;
		
		this.volume = volume;
	}
	
	
}




public class Excercise7_1 {

	public static void main(String[] args) {
		MyTv2 t= new MyTv2();
		
		t.setChannel(10);
		System.out.println("CH:"+t.getChannel());
	
		
		t.setChannel(20);
		System.out.println("CH:"+t.getChannel());
		t.gottoPrevChannel();
		System.out.println("CH:"+t.getChannel());
		t.gottoPrevChannel();
		System.out.println("CH:"+t.getChannel());
	
		t.setVolume(20);
		System.out.println("VOL:"+t.getVolume());
		

	}

}
