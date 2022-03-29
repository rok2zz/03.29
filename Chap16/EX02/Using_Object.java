package Chap16.EX02;

//Generic ����� ������
//Object�� ��� ��ü�� ���� ����
// ��ǰ�� �����ϴ� Ŭ������ Object Ÿ������ �����ϸ� ��� ��ü�� ���� �� ����
//Object �� ���� : ��� ��ü�� ���� �� �ִ� (Casting)
			//���� : �Ź� �ٿ� ĳ�����ؼ� ����ؾ���
			// ���� Ÿ�� üũ : 
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


class Goods{ // Object : ��� ��ǰ ����
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
		//1. Apple�� ������ ���. Object
		Goods goods1 = new Goods();
		goods1.setObject(new Apple("���3",4000));
		System.out.println((Apple)goods1.getObject());//ObjectŸ�� ��ü ������ : �ٿ�ĳ���� �ʿ�
		
		//2. Pencil�� ������ ���. Object
		Goods goods2 = new Goods();
		goods2.setObject(new Pencil("����3",5000));
		System.out.println((Pencil)goods2.getObject());
		
		//3. �߸��� ĳ������ �� �� �ִ�(���� Ÿ�� üũ) : Object �� ������
		Goods goods3 = new Goods();
		goods3.setObject(new Apple("���4",5000));
		System.out.println((Pencil)goods3.getObject());
		//Ÿ��üũ����� ���ؼ� ����� �����߻� Ÿ���� �������� ������Ȯ��ŭ
	}

}
