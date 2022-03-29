package Chap16.EX02;

//Generic 사용전 문제점
//Object는 모든 객체를 저장 가능
// 상품을 저장하는 클래스에 Object 타입으로 저장하면 모든 객체를 담을 수 있음
//Object 의 장점 : 모든 객체를 담을 수 있다 (Casting)
			//단점 : 매번 다운 캐스팅해서 출력해야함
			// 약한 타입 체크 : 
class Apple{
	String name;
	int price;
	
	Apple(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "이름 : " + name + ", 가격 : " + price;
	}
}

class Pencil{
	String name;
	int price;

	Pencil(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "이름 : " + name + ", 가격 : " + price;
	}
}


class Goods{ // Object : 모든 상품 저장
	private Object object = new Object();

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}
	
}
public class Using_Object {

	public static void main(String[] args) {
		//1. Apple을 저장후 출력. Object
		Goods goods1 = new Goods();
		goods1.setObject(new Apple("사과3",4000));
		System.out.println((Apple)goods1.getObject());//Object타입 객체 가져옴 : 다운캐스팅 필요
		
		//2. Pencil을 저장후 출력. Object
		Goods goods2 = new Goods();
		goods2.setObject(new Pencil("연필3",5000));
		System.out.println((Pencil)goods2.getObject());
		
		//3. 잘못된 캐스팅을 할 수 있다(약한 타입 체크) : Object 의 문제점
		Goods goods3 = new Goods();
		goods3.setObject(new Apple("사과4",5000));
		System.out.println((Pencil)goods3.getObject());
		//타입체크기능이 약해서 실행시 오류발생 타입이 많을수록 오류날확률큼
	}

}
