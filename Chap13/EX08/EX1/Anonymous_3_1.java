package Chap13.EX08.EX1;

//3. �޼ҵ��� �Ű� ������ ���� :  
//  3-1 : ��ü ������ �Ű� ������ ���� ( Ŭ������ 0, + �������� 0 ) 
//  3-2 : ��ü ������ �Ű� ������ ���� ( Ŭ������ 0, + �������� x ) 

interface A {	//�������̽� , �߻�޼ҵ带 ���� ,
	public abstract void cry();	  //�߻�޼ҵ�,  public abstract 
	void fly(); 
}
class B implements A {   //B�� A�������̽��� ������ Ŭ���� 
	public void cry() {  System.out.println("�۸� : �Ű� ���� ������ ��� ");	}
	public void fly() { System.out.println("�������մϴ�: �Ű����� ���� " );}
}
class C {	//C ��ü�� abc �żҵ� ȣ��� A Ÿ���� �Ű������� �޴´�. 
	void abc(A a) {  //���� �ڽ� Ŭ������ �Ű������� ���� ��� A  Ÿ������ �ڵ����� ��ĳ������ �ȴ�. 
		a.cry();
		a.fly(); 
	}
}

public class Anonymous_3_1 {

	public static void main(String[] args) {
		
		//1. Ŭ������ ���� 0 + ���� ���� : 0 
		C c = new C();
		A a = new B();		//B�� ��üȭ �ؼ� A Ÿ������ ����, a : ���� ���� 
				
		c.abc(a); 
		System.out.println("=================");
		
		//2. Ŭ������ ���� 0 + �������� : x 
		
		c.abc(new B()); 		
		
	}

}
