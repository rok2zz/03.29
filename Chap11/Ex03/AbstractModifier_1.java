package Chap11.Ex03;

//abstract(�߻�) �޼ҵ� : ���࿵���� ���� �޼ҵ� , ���� �Ǿ� �ִ� �޼ҵ� 
   // �߻� Ŭ������ ��üȭ �� �� ����. ,  Ÿ�����δ� ���� �� �� �ִ�. 
   // ������ �޼ҵ带 �������ش�.  : ȸ���� ��ɱ��� �޼ҵ带 ���� 
		//������ �������� �߻�޼ҵ带 �������̵� �ؼ� �����θ� ����� �ȴ�. 
		//���� Ŭ�������� �޼ҵ� �������̵��� ������ ���� �ϱ� ���� ���. ... 
	//�ڽ�Ŭ�������� ������ �ؼ� �����θ� ���� �ؾ� �Ѵ�. 
  // ��)     �޼ҵ��� �⺻ ���� : void print() {} 
  //         �߻� �޼ҵ� : ���� ������ ���� �޼ҵ� : abstract void print(); 
  //         �߻� Ŭ���� : abstract class A { �߻�޼ҵ带 �ϳ� �̻� ���� �ϸ� } 
				//�ڽ� Ŭ�������� �żҵ带 ������ �ؼ� �����θ� �����Ѵ�. 

abstract class A {		//�߻� Ŭ���� : �߻� �޼ҵ带 �ϳ��� ���� �ϸ� �ݵ�� �߻� Ŭ�������� �Ѵ�. 	
	 abstract void print ();      // �߻� �޼ҵ�  : ���࿵���� ���� �޼ҵ� 
	 abstract void cry();	
}
class B extends A {   //��ũ��Ʈ Ŭ���� : �߻� Ŭ�������� ������ �޼ҵ带 ��� ������ Ŭ���� 

	@Override
	void print() {
		System.out.println("��ũ��Ʈ Ŭ���� : �߻� Ŭ������ �߻�޼ҵ带 ��� ������ Ŭ���� ");	
	}
	@Override
	void cry() {
		System.out.println("�߿� ");
	}	
}
abstract class C extends A {   // �θ��� �߻� �޼ҵ��� �Ϻθ� ���� �� ��� : �߻� Ŭ���� 

	@Override
	void print() {
		// TODO Auto-generated method stub	
	}
}
class D extends C {   //��ũ��Ʈ Ŭ���� : �θ��� ��� �߻�޼ҵ带 ���������� ������ Ŭ���� 

	@Override
	void cry() {
		// TODO Auto-generated method stub
		
	}
	
}





public class AbstractModifier_1 {

	public static void main(String[] args) {

	}

}
