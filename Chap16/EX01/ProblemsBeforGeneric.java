package Chap16.EX01;

//Generic 사용전 문제점
//객체를 담을 클래스를 만들 경우, 매번 객체를 생성할 때 마다 그 객체를 담을 클래스를 만들어야함
//객체를 저장할 클래스를 생성해서 객체 정보를 담을 수 있다 << 새로운 상품이 추가될때마다 새로운 클래스 생성
// 코드가 굉장히 복잡해짐

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
//1. Apple을 담을 수 있는 클래스 생성
class Goods1{ //상품클래스
	private Apple apple = new Apple("사과", 1000);

	public Apple getApple() {
		return apple;
	}

	public void setApple(Apple apple) {
		this.apple = apple;
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

class Goods2{ //상품클래스
	private Pencil pencil = new Pencil("연필", 2000);

	public Pencil getPencil() {
		return pencil;
	}

	public void setPencil(Pencil pencil) {
		this.pencil = pencil;
	}
}

public class ProblemsBeforGeneric {

	public static void main(String[] args) {
		//1. Goods1 상품이 저장>> Apple 객체 추가 및 가져오기
		Goods1 goods1 = new Goods1();
		goods1.setApple(new Apple("사과2",2000)); // 값을 할당
		System.out.println(goods1.getApple()); //필드의 내용 출력
		
		//2. Goods2 상품 저장, pencil 객체 생성
		Goods2 goods2 = new Goods2();
		goods2.setPencil(new Pencil("연필2",3000));
		System.out.println(goods2.getPencil());
		
		
	}

}
