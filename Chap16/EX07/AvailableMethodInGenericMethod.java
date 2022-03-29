package Chap16.EX07;
//제너릭 메소드 내부에서 사용 가능한 메소드 : Object  클래스의 메소드만 사용 가능

class A{
	public <T> void method(T t) {
		//System.out.println(t.length()); //t.length(); : String 글자수 리턴, 사용 불가
		System.out.println(t.equals("안녕")); //t.equalsd()는 OBject의 메소드라 사용가능
	}
}
public class AvailableMethodInGenericMethod {

	public static void main(String[] args) {
		A a = new A();
		a.<String>method("안녕");
		

	}

}
