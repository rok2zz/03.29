package Chap12.EX1;

abstract class Abc {
	abstract void cry();    // 
	abstract void fly(); 
}
class Cat extends Abc{

	@Override
	void cry() {
		System.out.println("�߿�");		
	}

	@Override
	void fly() {
		System.out.println("���� ���մϴ�. ");
	}
}
class Eagle extends Abc{

	@Override
	void cry() {
		System.out.println("������");
	}

	@Override
	void fly() {
		System.out.println("�ϴ��� ���� �����ϴ�. ");
	}
	
}

public class Ex_AbstractClass {   //p.jangwoo@gmil.com 

	public static void main(String[] args) {
			//1. �ڽ� Ŭ���� Cat, Eagle  Ŭ������ ������ ��� 
			Abc a1 = new Cat(); 
			Abc a2 = new Eagle(); 
			
			a1.cry();
			a1.fly();
			a2.cry();
			a2.fly();
		
			//2. �͸� Ŭ���� ������ ���, 
			Abc a3 = new Abc() {
				void cry() {
					System.out.println("����̴� �߿�");
				}
				void fly() {
					System.out.println("���� �ݴϴ�. ");
				}
			};
			Abc a4 = new Abc() {
				void cry() {
					System.out.println("�������� ������");
				}
				void fly() {
					System.out.println("���� ���ϴ� ");
				}
			};
			
			a3.cry();
			a3.fly();
			a4.cry();
			a4.fly();
			
		
	}

}
