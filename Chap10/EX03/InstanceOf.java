package Chap10.EX03;

//instanceof : 객체 내부의 캐스팅이 가능여부를 알 수 있도록 해주는 키워드
//업캐스팅한 객체 내부에 어떤 타입이 존재하는지 true,false로 리턴
//다운캐스팅시 런타임 오류 발생을 방지함
class A{
	int m;
	void a() {
		System.out.println(m);
	}
}

class B extends A{
	int n;
	void b() {
		System.out.println(n);
	}
}
public class InstanceOf {

	public static void main(String[] args) {
		//1. intstanceof :
		A aa = new A();
		A ab = new B(); //업캐스팅 A만 사용가능
		
		System.out.println(aa instanceof A );//true
		System.out.println(ab instanceof A ); //true
		System.out.println(aa instanceof B); //false
		
		if( aa instanceof B) { //aa객체에 B타입 내포되있으면
			B b = (B)aa; //다운캐스팅
			System.out.println("aa를 B로 캐스팅 했습니다.");
		}
		else
			System.out.println("aa는 B타입으로 캐스팅 불가");
		
		if(ab instanceof B) {//ab객체에 B타입이 내포되있으면
			B b = (B)ab;
			System.out.println("ab를 B로 캐스팅 했습니다. ");
		}
		else
			System.out.println("ab는 B타입으로 캐스팅 불가");
		
		if("안녕" instanceof String) {
			System.out.println("\"안녕\"은 String 클래스 입니다. ");
		}
		else
			System.out.println("\"안녕\"은 String 클래스가 아닙니다. ");
	}

}
