package Chap10.Ex04;

class Human {		// �θ�Ŭ���� 
	String name ;	// �ν��Ͻ� �ʵ� : ��üȭ ���Ѿ� ���, Heap 
	int age ; 
	
	void eat() {	// �ν��Ͻ� �޼ҵ� : ��üȭ ���Ѿ� ���, Heap (pointer), Ŭ������������ �ν��Ͻ� �޼ҵ念���� 
						// ���� �޼ҵ��� �ڵ尡 ���� 
		System.out.println("����� �Խ��ϴ�. ");
	}
	void sleep () {
		System.out.println("����� ���� ��ϴ�. ");
	}
}
class Student extends Human {
	int studentID;
	void goToScool () { 
		System.out.println("�л��� �б��� ���ϴ�. ");
	}
}
class Worker extends Human {
	int workerID ; 
	void goToCompany () {
		System.out.println("���忡 ���ϴ���");
	}
}


public class Test01 {

	public static void main(String[] args) {

		Human h = new Human();  // �θ�Ŭ���� 
		h.name = "ȫ�浿";
		h.age = 30; 
		h.eat();
		h.sleep();
		
		Student s = new Student(); //�ڽ� Ŭ����: �ڽ� Ŭ������ �θ�Ŭ������ �ʵ�� �޼ҵ带 ��� 
		s.name = "�Ż��Ӵ�";  // �θ�Ŭ������ �ʵ� 
		s.eat();   			// �θ�Ŭ������ �޼ҵ�
		s.studentID = 1111; // �ڽ� Ŭ������ �ʵ�
		s.goToScool();      // �ڽ� Ŭ������ �޼ҵ� 
		
		Worker w = new Worker(); //�ڽ�Ŭ���� 
		w.name = "BTS";		// �θ�Ŭ���� �ʵ�
		w.eat();			// �θ� Ŭ���� �޼ҵ��
		w.workerID = 2222;  // �ڽ� Ŭ���� �ʵ�
		w.goToCompany();    // �ڽ� Ŭ���� �޼ҵ� 
		
		Human h1 = new Student ();    // ��ĳ���� : �ڽ� => �θ� Ÿ������ ����ȯ 
						//h : Human , Student Ÿ���� ��� ����, Human �� ���� ���� 
		h.name = "�̼���";
		h.eat(); 
		
		System.out.println("=======================");
		
		//�ٿ� ĳ���� : �θ� ==> �ڽ� ���� Ÿ�� ��ȯ     , if ������ ����ؼ� instanceof �� ����ؼ� ó�� 
			// ��Ÿ�� ���� 
		
		System.out.println(h1 instanceof Human);  //true
		System.out.println(h1 instanceof Student); //true
		
		if ( h1 instanceof Student) {	//�ٿ� ĳ���� �Ҷ� ��Ÿ�� ������ �����ϱ� ���� ��ü�� 
			Student s2 = (Student) h1; 		// �ٿ�ĳ������ ������ Ÿ���� �����Ҷ� 
			s2.studentID = 3333; 
			s2.goToScool();
		}
		
		if ( h1 instanceof Worker) {
			Worker w4 = (Worker) h1;
		}
				// ������ �߻� ���� �ʴ´�. (������ ������ �߻����� �ʴ´�)
										// ����� ����	�߻�, ��Ÿ�� ���� 
		System.out.println(h1 instanceof Worker);   //false 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
