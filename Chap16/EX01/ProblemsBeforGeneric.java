package Chap16.EX01;

//Generic ����� ������
//��ü�� ���� Ŭ������ ���� ���, �Ź� ��ü�� ������ �� ���� �� ��ü�� ���� Ŭ������ ��������
//��ü�� ������ Ŭ������ �����ؼ� ��ü ������ ���� �� �ִ� << ���ο� ��ǰ�� �߰��ɶ����� ���ο� Ŭ���� ����
// �ڵ尡 ������ ��������

class Apple{
	String name;
	int price;
	
	Apple(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "�̸� : " + name + ", ���� : " + price;
	}
}
//1. Apple�� ���� �� �ִ� Ŭ���� ����
class Goods1{ //��ǰŬ����
	private Apple apple = new Apple("���", 1000);

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
		return "�̸� : " + name + ", ���� : " + price;
	}
}

class Goods2{ //��ǰŬ����
	private Pencil pencil = new Pencil("����", 2000);

	public Pencil getPencil() {
		return pencil;
	}

	public void setPencil(Pencil pencil) {
		this.pencil = pencil;
	}
}

public class ProblemsBeforGeneric {

	public static void main(String[] args) {
		//1. Goods1 ��ǰ�� ����>> Apple ��ü �߰� �� ��������
		Goods1 goods1 = new Goods1();
		goods1.setApple(new Apple("���2",2000)); // ���� �Ҵ�
		System.out.println(goods1.getApple()); //�ʵ��� ���� ���
		
		//2. Goods2 ��ǰ ����, pencil ��ü ����
		Goods2 goods2 = new Goods2();
		goods2.setPencil(new Pencil("����2",3000));
		System.out.println(goods2.getPencil());
		
		
	}

}
