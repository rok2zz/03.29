package Chap13.EX03;
 
//static �̳� Ŭ���� : �ܺ�Ŭ������ �ν��Ͻ� �ʵ�, �ν��Ͻ� �޼ҵ�� ������ �Ұ� 
			        //�ܺ�Ŭ������ static �ʵ峪 static �޼ҵ�� ������ ������. 

class A {
	int a= 3;   //�ν��Ͻ� �ʵ�, ��üȭ �ؾ� ���� ����. 
	static int b = 4 ;   //static �ʵ�, ��ü �������� ����, ��ü ������ ����, 
	void method1() {	//�ν��Ͻ� �޼ҵ�: ��ü ������ ���� 
		System.out.println("instance Method");
	}
	static  void method2() { //static �޼ҵ� , ��ü�� �������� �ʰ� ����, ��ü������ ���� 
		System.out.println("Static Method");
	}
	static class B {  //static �̳�ũ���� : �ܺ� ��ü�� �������� �ʰ� ��ü ���� ���� 
		void bcd () {
			//1. static Ŭ�������� �ܺ� Ŭ������ �ν��Ͻ� �ʵ� ���� (���� �Ұ�)
			//System.out.println(a);    //�ܺ� Ŭ������ �ν��Ͻ� �ʵ� (���ٺҰ�)
			System.out.println(b);    //static �̳�Ŭ�������� �ܺ�Ŭ������ static �ʵ峪 �޼ҵ� ���� ���� 
			
			//2. �޼ҵ� ȣ�� 
			//method1();		// �ν��Ͻ� �޼ҵ� ȣ��Ұ�
			method2(); 		// static �޼ҵ� ȣ�Ⱑ�� 
			
		}
	}
	
}
public class InnerClass_3 {

	public static void main(String[] args) {
		//1. Static �̳�Ŭ���� ��ü ���� 
		A.B b = new A.B();        // static �̳� Ŭ������ �ܺ� ��ü ���� ���� ��ü ���� 
		
		b.bcd();
		

	}

}
