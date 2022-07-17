package chapter6;

class MyTv{
	boolean isPowerOn;
	int channel;
	int volume;
	
	final int MAX_VOLUME=100;
	final int MIN_VOLUME=0;
	final int MAX_CHANNEL=100;
	final int MIN_CHANNEL=1;
	
	void trunOnOff() {
		// isPowerOn의 값이 true이면 false, false이면 true로 바꾼다.
		isPowerOn=!isPowerOn;
	}
	void volumeUp() {
		//volume의 값이 MAX_VOLUME보다 작을때만 값을 1 증가시킨다.
		if(volume<MAX_VOLUME) volume++;
	}
	void volumeDown() {
		//volue의 값이 MIN_VOULUME보다 클때만 값을 1 감소시킨다.
		if(volume>MIN_VOLUME) volume--;
	}
	void channelUp() {
		if(channel==MAX_CHANNEL) {
			channel=MIN_CHANNEL;
		}else {
			channel++;
		}
	}
	void channelDown() {
		if(channel==MIN_CHANNEL) {//1다음에 100이어야 하니까
			channel=MAX_CHANNEL;
		}else {
			channel--;
		}
	}

}

public class Excercise6_7 {

	public static void main(String[] args) {
		MyTv t= new MyTv();
		t.channel=100;
		t.volume=0;
		System.out.println("CH:"+t.channel+", VOL:"+t.volume);
		
		t.channelDown();
		t.volumeDown();
		System.out.println("CH:"+t.channel+", VOL:"+t.volume);
		
		t.volume=100;
		t.channelUp();
		t.volumeUp();
		System.out.println("CH:"+t.channel+", VOL:"+t.volume);
	}

}
