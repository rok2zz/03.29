package Chap16.EX03;

//Generic 클래스 : 하나의 클래스에서 다양한 데이터 타입 처리 가능
//제너릭 타입 변수 : T(타입), K(Key), V(Value), E(Element)
	// -A~Z 임의로 넣을 수 있다
	//wrapper클래스 : 기본 타입을 객체화 시켜놓은 클래스
		//int(기본타입) >> Integer(객체), boolean >> Boolaen
		//char >> Charter, double >> Double
class MyClass<T>{
	private T t;
	
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t = t;
	}
}
public class SingleGenericArgument {

	public static void main(String[] args) {
		// 1. 제너릭 클래스 객체 생성 <String> 입력
		MyClass<String> mc1 = new MyClass<String>();
		mc1.set("안녕");
		System.out.println(mc1.get());
		
		//2.제너릭 클래스 객체 생성<Integer>
		MyClass<Integer> mc2 = new MyClass<Integer>(); //wrapper 클래스를 할당해야한다
		mc2.set(100);
		System.out.println(mc2.get());
		
		//3. 제너릭 클래스 객체 생성<Double>
		MyClass<Double>mc3 = new MyClass();
		mc3.set(333.33);
		System.out.println(mc3.get());
		
		//4. 강한 타입 체크
		MyClass<Boolean>mc4 = new MyClass();
		mc4.set(true);
		mc4.set(false);
		//mc4.set(55); 바로 오류 발생
		System.out.println(mc4.get());
		
		
		
		
	}

}
