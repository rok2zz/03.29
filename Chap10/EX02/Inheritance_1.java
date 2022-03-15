package Chap10.EX02;

class Aa{
	int m;
	void abc() {
		
	}
}

class Bb extends Aa{
	int n;
	void bcd() {
		
	}
}
public class Inheritance_1 {

	public static void main(String[] args) {
		//타입캐스팅을 하지않은 경우
		Bb b = new Bb();
		b.m = 10; // Aa의 필드
		b.n = 20; // Bb의 필든
		b.abc();
		b.bcd();
		
		// 업캐스팅 : 자식 >> 부모
		Aa a = new Bb(); 
		a.m = 100;
		//a.n = 200; 접근불가
		
		Bb bb6 = (Bb) a;//다운캐스팅
		bb6.m = 100;
		bb6.n = 200;

	}

}
