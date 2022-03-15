package Chap06_07.EX02;

//메소드 오버로딩 : 하나의 메소드명에 매개변수의 타입과 개수에 따라서 각각 다르게 호출됨 (Java)
//메소드 오버라이딩 : 상속에서 부모 클래스의 메소드를 재정의 해서 사용
// import Chap06_07.EX03.A; // 다른 패키지에 잇을경우 임포트
// 다양한 타입의 메소드 형식(리턴 타입이 있는 경우 : int, double 등)
// 리턴 타입 x : void키를 사용

public class ExternalCallMethod {

	public static void main(String[] args) {
		//객체 생성
		A a = new A(); //같은 패키지 내의 클래스는 import 없이 호출해서 사용가능
		
		//메소드 호출
		a.print();
		int k = a.data();
		System.out.println(k);
		
		double result = a.sum(3,5.2);
		System.out.println(result);
		
		a.printMethod(5);
		a.printMethod(25);
		
		//주의 :
		
		System.out.println(a.data());// 출력구문에 호출 가능한 메소드( 리턴이 있음)
//		System.out.println(a.print()); 오류 발생
		a.print();
		System.out.println(a.sum(4, 10.5));
//		System.out.println(a.printMethod(3)); 오류
		a.printMethod(3);
	}

}
