package Chap12.EX2;

//���� ���̽� (interface) : �ܺο� ���θ� ���� �����ִ� ����... �ܼ�Ʈ (�ܺ�������ġ >>�ܼ�Ʈ <<< ���� ) 
							// ������ (���, TV) , API 
   //��ü ���� �Ұ�, Ÿ���� ���� ���� 
   // ��� �ʵ�� �ݵ�� : public static final ���� 
   // ��� �޼ҵ�� : public abstract ���� (1.8)   , (default �޼ҵ� ���� ) 

interface A{      //���� ǥ�� 
	public static final int A = 3;		//Interface �ʵ��� ���� ǥ�� 
	public abstract void abc(); 		//Interface �޼ҵ��� ���� ǥ�� 
}

interface B{		//������ ����
	int A = 3;
	void abc();		//�߻� �޼ҵ� : 
}

abstract class C {				//�߻� Ŭ���� �϶��� abstract �� ���� �ɼ� ����. 
	abstract void abc();		//������ ���� �߻� 
}

public class Interface_1 {

	public static void main(String[] args) {

		//�������̽��� ��ü ���� �Ұ�.  �������� �ʴ� �޼ҵ尡 ����. 
		// A a = new A();   //A�� �������̽��̹Ƿ� ��ü ���� �Ұ�, 
		
		//1. �������̽��� static �ʵ��� ������ ��� 
		
		System.out.println(A.A);	// �������̽��� �ʵ� ��� , A  <== static 
		System.out.println(B.A);
		
		//2. final �� ����Ǿ� �ֱ� ������  ���� ���� �Ұ� 
		// A.A = 5; 	//final�� �����Ǿ� �ֱ� ������ ���� ���� �Ұ� 
		// B.A = 6;
		
		
	}

}
