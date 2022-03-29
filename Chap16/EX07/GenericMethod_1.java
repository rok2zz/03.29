package Chap16.EX07;
//제너릭 클래스 : 클래스를 선언 할 때 타입변수는 선언 <T> <<정의>>. 객체생성시 T에 적용할 타입 지정
//제너릭 메소드 : 일반 클래스 내부의 메소드 선언시 제너릭 타입 변수 사용

class Genericmethod{
	public <T> T method1(T t) {//제너릭 메소드
		return t;
	}
	public <T> boolean method2(T t1,T t2) {
		return t1.equals(t2); //두 값을 비교해서 true,false 리턴
								//기본자료형일때는 값을 비교,참조자료형일땐 주소비교
	}
	
	public <K,V> void method3(K k, V v) {
		System.out.println(k+" : "+v);
	}
	
	public <K,V> void method4() {
		System.out.println("매개변수가 인풋 값으로 없는 경우 오류");
	}
}

public class GenericMethod_1 {

	public static void main(String[] args) {
		//1. 일반 클래스 객체 생성 후 제너릭 메소드 호출
		Genericmethod gm = new Genericmethod();
		String str1 = gm.<String>method1("안녕");
		String str2 = gm.method1("안녕"); //타입을 알 수 있는 매개변수로 값이 들어갈 때 <>생략가능
		System.out.println(str1);
		System.out.println(str2);
		System.out.println("=================");
		
		Integer i = gm.<Integer>method1(100);
		Integer i2 = gm.method1(200);
		System.out.println(i);
		System.out.println(i2);
		System.out.println("=================");
		
		Boolean b1 = gm.<Boolean>method1(true);
		Boolean b2 = gm.<Boolean>method1(false);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println("=================");
		
		Boolean d1 = gm.<Double>method2(2.55,2.55);
		Boolean d2 = gm.<Double>method2(2.5,3.0);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println("=================");
		
		gm.<String, Integer>method3("국어",80);
		gm.method3("영어",90);
		
		gm.<Integer, String>method3(500,"서버 에러 입니다.");
		gm.method3(402, "파일을 찾을 수 없습니다.");
		
		gm.method4();
	}

}
