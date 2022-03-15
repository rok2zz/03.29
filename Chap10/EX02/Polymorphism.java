package Chap10.EX02;

//������(Polymorphism) : ��ü�� ��� ���迡�� ���� ������ Ÿ������ ��ȯ ����

class A{}
class B extends A{}
class C extends B{}
class D extends B{}


public class Polymorphism {

	public static void main(String[] args) {
		// 1. ��ĳ����(�ڵ����� ��ȯ) : �ڽ� >> �θ�� ��ȯ , ������ �����Ϸ��� �ڵ����� �߰�
		A ac = (A)new C(); // C >> A : C�� A�̴� �տ� (A) �����ϰ� (�ڵ����� ��ȯ)
		// A,B,C�� �ʵ�� �޼ҵ� ����, A�� �ʵ�� �޼ҵ常 ���ٰ���
		A ab = new B(); // B>> A : B�� A�̴�.
		// A,B �� �ʵ�� �޼ҵ尡 ����, A�� �ʵ�� �޼ҵ常 ���ٰ���
		B bd = new D(); // D >> B : D�� B�̴�.
		// A,B,D�� �ʵ�� �޼ҵ� ����, A,B�� �ʵ�� �޼ҵ� ���� ����
		C c = new C(); // C�� C�̴�. 
		// A,B,C�� �ʵ�� �޼ҵ� ����, ���ٰ���
		
		// 2. ��ü ������ �� �� ���� ���
		//B b = new A(); A�� B�̴� : �����߻�
		//C cc1 = new B(); 
		//D dd1 = new B();
		//C cd = new D(); ������ �Ʒ��� �����ϸ� �� ����
		
		// 3. �ٿ� ĳ����(������ȯ) : �θ� >>�ڽ����� ��ȯ, ĳ���� �Ұ��ϸ� ��Ÿ�� ����
		A aa = new A(); // aa : AŸ�Ը� ������ ����
		//B b1 = (B) aa; // A�� B�� �ٿ�ĳ����, ����� ���� �߻�
		// java.lang.ClassCastException : �ٿ� ĳ���� �� ��ü ���� �ش� Ÿ���� ������ ����
		//C cc2 = (C) aa; //aa�� CŸ���� ���� x >> �ٿ�ĳ���� �ؼ� ��Ÿ�� ���� �߻�
		
		//������ ���� : ���α׷� ���� �� ���� ����(��Ŭ������ üũ)
		//��Ÿ�� ���� : ����� �߻��Ǵ� ����(������ ����x)
		
		// 4. �ٿ� ĳ���� ������ ���(������ȯ) : ��ü ���ο� �ڽ� ������Ÿ���� ������ ������ ĳ���� ����
		A ac3 = new C(); // ac3 : A,B,C �ʵ�� �޼ҵ� ����, A�� �ʵ�� �޼ҵ� ���� ����
		
		B ac5 = (B) ac3; // ac3�� BŸ������ �ٿ�ĳ���� : A,B ���ٰ���
		C ac6 = (C) ac3; // ac3�� CŸ������ �ٿ�ĳ���� : A,B,C ���ٰ���
		
		A ad2 = new D(); //AŸ������ ��ĳ���� A,B,D ����, A���ٰ���
		B bd3 = (B) ad2;//ad2 �� BŸ������ �ٿ�ĳ����
		D dd4 = (D) ad2;
		
		
	}

}