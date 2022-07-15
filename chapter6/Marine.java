package chapter6;

//컴퓨터 게임의 병사(marine)클래스
public class Marine {
	int x=0,y=0 ; //Marine의 위치 좌표(x,y)
	static int weapon=6;//공격력
	static int armor=0;//방어력 
	//모든 병사의 공격력 방어력은 같으므로 static
	
	static void weaponUp() {//static 변수와 관련되 작업이므로 static
		weapon++; 
	}
	static void armorUp() {//static 변수와 관련된 작업이므로 static
		armor++;
	}
	
	void move(int x, int y) {//인스턴스변수 x,y로 작업하는 메서드
		this.x=x;
		this.y=y;
	}

}
