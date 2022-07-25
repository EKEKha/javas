package chapter7;

public class Excercise7_2 {

}

abstract class Unit{
	int x,y;
	abstract void move (int x, int y); //추상 클래스 구현부가 없음
	void stop( ) {   /*현재 위치에 정지*/           }
}
class Marine extends Unit{//보병
	void move(int x, int y) {/*지정된 위치로 이동*/} //추상 클래스 실현
	void stimPack( ) {/*스팀팩 사용*/}
	
}
class Tank extends Unit{//탱크
	void move(int x, int y) {/*지정된 위치로 이동*/} //추상 클래스 실현
	void changeMode() {/*공격 모드를 변환한다*/}
	
}
class Dropship extends Unit{
	void move(int x, int y) {/*지정된 위치로 이동*/} //추상클래스 실현
	void load() {/*선택된 대상을 태운다*/}
	void unload() {/*선택된 대상을 내린다*/}
}