package Chap10.Ex04;

// �޼ҵ� �������̵� (MethodOverriding) : 
   // 1. �ݵ�� ��� ���迡���� �޼ҵ� �������̵��� �����ȴ�. 
   // 2. �θ� Ŭ�������� ����� �޼ҵ带 �ڽ� Ŭ�������� ���Ӱ� �����ؼ� ����ϴ°�. 
   // 3. @Override  ��� ������̼��� ����ϸ� �޼ҵ� �����ǽ� ������ ���ϼ� �ִ�.
   // 4. �ñ״��İ� ���ƾ� �Ѵ�. ( �޼ҵ��, �Ű����� Ÿ��, �Ű����� ����) 
   // 5. �޼ҵ��� ���� �����ڰ� ���ų� ����� �Ѵ�. 

class A {
	void print() { 
		System.out.println("A Ŭ����");
	}
}
class B extends A {
	@Override		//�޼ҵ� �������̵��� , �ݵ�� �θ��� �޼ҵ带 ������ �ϵ��� ����.
					//@Override ������̼��� ������� ���� ��� : ��Ÿ�� ���ų� ���Ŀ� ���� ���� ��� 
					//������ �޼ҵ�� ���ǵ�. 
     void print() {
		System.out.println("B Ŭ���� ");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		//1. A Ÿ��  
		A aa =  new A(); 
		aa.print();           // A Ŭ������ print() ��� 
		
		//2. B  Ÿ�� 
		B bb = new B(); 
		bb.print(); 		//B Ŭ������ print() ��� 
		
		//3.  A Ÿ��  ��ĳ����    <<=== B�� ��ĳ����  A Ÿ������ �θ� 
		A ab = new B(); 
		ab.print();           //B Ŭ������ print() ��� 
		
		  //ab.print()�� A Ŭ������ print�� ȣ��, ���� ���ε��� ���ؼ� BŬ������ print()�� ���  
			
	}

}
