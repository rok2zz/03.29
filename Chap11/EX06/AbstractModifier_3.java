package Chap11.EX06;

abstract class Animal { //�߻� Ŭ���� : �߻� �޼ҵ尡 �ϳ��̻� ���� �Ǿ� �ִ� ��� 
						//�߻� Ŭ������ ��ü ���� �Ұ�, Ÿ���� ��� ���� 
							//�ڽ�Ŭ������ �θ� Ŭ������ �޼ҵ带 ������ ������ ����  
						//�߻� Ŭ������ �߻� Ŭ���� ���� �߻�޼ҵ带 �ڽ� Ŭ�������� �ݵ�� �����ϵ��� 
						// ���� �޴´�. 
	String name ; 
	int age ; 
	
	abstract void cry();  //�߻� �޼ҵ� : �����ΰ� ���� �޼ҵ� 
		//void cry(){}    <== �Ϲ� �޼ҵ� : ����Ÿ�� �޼ҵ��̸� (�Է¸Ű�����) {�����ڵ�}
	abstract void run();
	
	@Override
		public String toString() {   //��ü ��ü�� �ⷢ�� �޸��� ������ ��� 
			return "�̸� : " + name + " , ���� : " + age ;
		}		
}
class Cat extends Animal {		//Cat�� Animal ��� �Ϻθ� ��� �Ѱ�� �߻� Ŭ����, 
								//��� �߻� �޼ҵ带 ������ ���� ��ũ��Ʈ(������ ������) Ŭ����
	Cat(String name, int age) {
		super.name = name; 
		super.age = age; 
		
	}

	void cry() {	//�߻� �޼ҵ带 ������ �޼ҵ� 
		System.out.println("�߿�");
	}
	@Override
		void run() {
			System.out.println("����̴� �����ϰ� �ݴϴ�.");			
		}	
}
class Tiger extends Animal{
	Tiger(String name, int age){
		super.name = name; 
		super.age = age; 
	}

	@Override
	void cry() {
		System.out.println("����");
	}

	@Override
	void run() {
		System.out.println("ȣ���̴� ������ �޸��ϴ�. ");
	}
	
}
class Eagle extends Animal {
	Eagle (String name, int age){
		super.name = name ; 
		super.age  = age ;
	}

	@Override
	void cry() {
		System.out.println("���� �ϰ� ��ϴ�. ");
	}

	@Override
	void run() {
		System.out.println("�������� ����ٴմϴ� ");
	}
	
}

//p.jangwoo@gmail.com   

public class AbstractModifier_3 {

	public static void main(String[] args) {
		Animal a1 = new Cat("�����" , 10);
		Animal a2 = new Tiger("ȣ����", 5);
		Animal a3 = new Eagle("������", 15); 
		
		//1. Animal �迭 ��ü�� ���� �� 
		Animal[] arr1 = {a1, a2, a3};
		
		// 2. For ���� ����ؼ� ��ü�� ��½� �̸��� ���̸� ��� , .cry(), run() 
		for (int i = 0 ; i < arr1.length; i++) {
			System.out.println(arr1[i]);   // ��ü ��� , Animal�� toString()
			arr1[i].cry();		// ��ü�� �������̵��� �޼ҵ� ��� 
			arr1[i].run();		//Animal�� cry(), run() ======> �������̵� (�ڽ��� cry(), run())
			System.out.println("========================");
		}
		
		System.out.println();
		System.out.println();
		
		// 3. Enhanced For ���� ����ؼ� ��ü�� ��½�  �̸��� ���̸� ��� , .cry(), run()
		for ( Animal k : arr1) {
			System.out.println(k);
			k.cry();
			k.run();
			System.out.println("======================");
		}

	}

}
