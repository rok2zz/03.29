package Chap12.EX1;

//2. �߻� �޼ҵ带 ����ϴ� 2��° ��� : �ڽ� Ŭ����  �������� �͸� Ŭ������ Ȱ���ϴ� ��� 
	//1���� �ӽ������� ����Ҷ� , �̺�Ʈ ó�� 
	// ���� : �ڽ� Ŭ���� ������ ���� �ʴ´�.  �ӽ������� ����� ��� ����
	// ���� : �������� ��ü�� �����ؾ��� ��� �ڵ尡 �����. ( 1�� ���) 

abstract class AAA {    //�߻�޼ҵ�� ��üȭ �� �� ����. 
	abstract void abc();		//�߻� �޼ҵ� 
}

public class AbstractClass_2 {

	public static void main(String[] args) {
		//1. �͸� ��ü ����
		AAA aaa = new AAA() {   // �͸� ��ü�� Ȱ���� �߻�޼ҵ带 Ŭ���� �������� ���� 
			void abc() {
				System.out.println("���2 : ��ü ���� ���� �͸�Ŭ������ �߻�޼ҵ� ���� ");
			}
		};
		
		AAA aaa1 = new AAA() { //�߻�Ŭ������ ��ü ���� �Ұ� , �͸�Ŭ���� ������ �޼ҵ� ������ �ؼ� ��� 
			void abc() {
				System.out.println("���2 : ��ü ���� ���� �͸�Ŭ������ �߻�޼ҵ� ����");
			}
		};
		
		AAA aaa2 = new AAA() {
			void abc() {
				System.out.println("���2 : ");
			}
		};
		
		
		
		
		//2. �޼ҵ� ȣ�� 
		aaa.abc();   //
		aaa1.abc();
		aaa2.abc(); 

	}

}