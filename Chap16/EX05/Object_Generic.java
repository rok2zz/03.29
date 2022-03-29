package Chap16.EX05;

class Apple{
	String name;
	int price;
	
	Apple(String name, int price){
		this.name = name;
		this.price = price;
	}
	public void abc() {
		System.out.println(123123);
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
	public void bcd() {
		System.out.println(234234);
	}
	
	@Override
	public String toString() {
		return "이름 : " + name + ", 가격 : " + price;
	}
}

//제너릭을 사용해서 객체를 저장 후 값 읽어오기

class Goods<T>{
	private T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}
	
	
}
public class Object_Generic{

	public static void main(String[] args) {
		
		Goods<Apple> goods1 = new Goods<Apple>(); //goods1은 apple 데이터타입이다
		goods1.set(new Apple("사과",1000));
		System.out.println(goods1.get()); //generic은 다운캐스팅 필요 x
		goods1.get().abc();
		
		Goods<Pencil> goods2 = new Goods();
		goods2.set(new Pencil("연필1",2000));
		System.out.println(goods2.get());
		goods2.get().bcd();
	}

}
