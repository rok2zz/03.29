package Ex;
class Student {                     // p.jangwoo@gmail.com
					// �ڹٴ� ���� ����� �Ұ� , �ڹ��� ��� Ŭ������ Object Ŭ������ �ڽ� Ŭ�����̴�. 
							//Object Ŭ�������� ������ �ʵ峪 �޼ҵ带 ������ �� �ִ�. 
	String name ; 		//�л��̸�
	int studentID ;		//�й� 
	int	kor; 			//��������
	int eng; 			//�������� 
	int math;			//�������� 	
	
	int sum; 			//���� ��	
	double avg;			//���� ��� 
	
	void hobby () {
		System.out.println("�� �л��� ��̴� �Դϴ�. ");
	}

	@Override
	public String toString() {		//Object Ŭ������ �޼ҵ�, ��ü ��ü�� ����Ҷ� , [��Ű����.Ŭ������@�ؽ��ڵ�]
		return "�̸� : " + name + " , �й� : " + studentID + " , ���� :" + kor + " , ���� :" + eng + 
				" , ���� : "  + math +  " , �հ� : " + sum + "��� : " + avg ;
		
	}	
	
}
class S_ö�� extends Student {
	
	S_ö��(String name, int studentID, int kor, int eng, int math){    //������: 1. Ŭ������� ����, 2. ����Ÿ���� ������Ѵ�. 
		super.name = name;  //super ���� Ŭ���� , this : �ڽ��� ��ü 
		super.studentID = studentID;
		super.kor = kor;
		super.eng = eng;
		super.math = math;
		
		super.sum = kor + eng + math; 
		super.avg = (double) sum / 3;    //����� ��� �Ҷ��� (double)�� ĳ���� 
		
	}

	@Override
	void hobby() {
		System.out.println("ö���� ��̴� ���� �Դϴ�. ");
	}
	
}
class S_���� extends Student{
	
	S_���� (String name, int studentID, int kor, int eng, int math){    //������: 1. Ŭ������� ����, 2. ����Ÿ���� ������Ѵ�. 
		super.name = name;  //super ���� Ŭ���� , this : �ڽ��� ��ü 
		super.studentID = studentID;
		super.kor = kor;
		super.eng = eng;
		super.math = math;
		
		super.sum = kor + eng + math; 
		super.avg = (double) sum / 3;    //����� ��� �Ҷ��� (double)�� ĳ���� 
		
	}

	@Override
	void hobby() {
		System.out.println("������ ��̴� ��ȭ���� �Դϴ�. ");
	}
}
class S_���� extends Student{
	S_����(String name, int studentID, int kor, int eng, int math){    //������: 1. Ŭ������� ����, 2. ����Ÿ���� ������Ѵ�. 
		super.name = name;  //super ���� Ŭ���� , this : �ڽ��� ��ü 
		super.studentID = studentID;
		super.kor = kor;
		super.eng = eng;
		super.math = math;
		
		super.sum = kor + eng + math; 
		super.avg =  (double) sum / 3 ;    //����� ��� �Ҷ��� (double)�� ĳ���� 
		
	}

	@Override
	void hobby() {
		System.out.println("������ ��̴� �ڵ� �Դϴ�. ");
	}
}


public class Quiz03 {

	public static void main(String[] args) {
		
		Student ö�� = new S_ö��("ö��", 001, 80,90,100);
		Student ���� = new S_����("����", 002, 95,90,70);
		Student ���� = new S_����("����", 003, 60,70,85);
		
		Student[] arr = {ö��, ����, ����}; 
		
		for ( int i = 0 ; i < arr.length; i++) {
			System.out.println(arr[i]);
			arr[i].hobby();
		}
		
		System.out.println("===========================");
		for ( Student k : arr) {
			System.out.println(k);
			k.hobby();
		}	
	}

}
