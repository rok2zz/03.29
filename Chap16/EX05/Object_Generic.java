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
		return "�̸� : " + name + ", ���� : " + price;
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
		return "�̸� : " + name + ", ���� : " + price;
	}
}

//���ʸ��� ����ؼ� ��ü�� ���� �� �� �о����

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
		
		Goods<Apple> goods1 = new Goods<Apple>(); //goods1�� apple ������Ÿ���̴�
		goods1.set(new Apple("���",1000));
		System.out.println(goods1.get()); //generic�� �ٿ�ĳ���� �ʿ� x
		goods1.get().abc();
		
		Goods<Pencil> goods2 = new Goods();
		goods2.set(new Pencil("����1",2000));
		System.out.println(goods2.get());
		goods2.get().bcd();
	}

}
