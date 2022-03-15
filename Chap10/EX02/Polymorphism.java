package Chap10.EX02;

//다형성(Polymorphism) : 객체의 상속 관계에서 여러 데이터 타입으로 변환 가능

class A{}
class B extends A{}
class C extends B{}
class D extends B{}


public class Polymorphism {

	public static void main(String[] args) {
		// 1. 업캐스팅(자동으로 변환) : 자식 >> 부모로 변환 , 생략시 컴파일러가 자동으로 추가
		A ac = (A)new C(); // C >> A : C는 A이다 앞에 (A) 생략하고 (자동으로 변환)
		// A,B,C의 필드와 메소드 포함, A의 필드와 메소드만 접근가능
		A ab = new B(); // B>> A : B는 A이다.
		// A,B 의 필드와 메소드가 포함, A의 필드와 메소드만 접근가능
		B bd = new D(); // D >> B : D는 B이다.
		// A,B,D의 필드와 메소드 포함, A,B의 필드와 메소드 접근 가능
		C c = new C(); // C는 C이다. 
		// A,B,C의 필드와 메소드 포함, 접근가능
		
		// 2. 객체 생성을 할 수 없는 경우
		//B b = new A(); A는 B이다 : 오류발생
		//C cc1 = new B(); 
		//D dd1 = new B();
		//C cd = new D(); 위에서 아래를 선언하면 다 오류
		
		// 3. 다운 캐스팅(수동변환) : 부모 >>자식으로 변환, 캐스팅 불가하면 런타임 오류
		A aa = new A(); // aa : A타입만 가지고 있음
		//B b1 = (B) aa; // A를 B로 다운캐스팅, 실행시 오류 발생
		// java.lang.ClassCastException : 다운 캐스팅 시 객체 내의 해당 타입이 없을때 오류
		//C cc2 = (C) aa; //aa는 C타입을 내포 x >> 다운캐스팅 해서 런타임 오류 발생
		
		//컴파일 오류 : 프로그램 실행 전 구문 오류(이클립스가 체크)
		//런타임 오류 : 실행시 발생되는 오류(문법적 오류x)
		
		// 4. 다운 캐스팅 가능한 경우(수동변환) : 객체 내부에 자식 데이터타입을 가지고 있으면 캐스팅 가능
		A ac3 = new C(); // ac3 : A,B,C 필드와 메소드 내포, A의 필드와 메소드 접근 가능
		
		B ac5 = (B) ac3; // ac3를 B타입으로 다운캐스팅 : A,B 접근가능
		C ac6 = (C) ac3; // ac3를 C타입으로 다운캐스팅 : A,B,C 접근가능
		
		A ad2 = new D(); //A타입으로 업캐스팅 A,B,D 포함, A접근가능
		B bd3 = (B) ad2;//ad2 를 B타입으로 다운캐ㅡ팅
		D dd4 = (D) ad2;
		
		
	}

}
