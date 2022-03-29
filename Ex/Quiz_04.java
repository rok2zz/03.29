package Ex;

class E extends Object {   //�ڹ��� ��� Ŭ������ Object �� �ڽ� Ŭ�����̴�. 
								//Object Ŭ������ ���ǵ� �޼ҵ带 ����� �� �ִ�. 
	String name; 
	E (){}				// �⺻ ������ : Ŭ�������� �ٸ� �����ڰ� ���� �Ҷ� �ܺο��� �⺻���ڸ� ȣ���Ҷ� 
						//     ���� �Ǹ� �ȵȴ�. 
	E (String name) {
		this.name =name;  //�Ű����� �̸�, �����ο��� �Ű������� �޴� ������, �ʵ��� �������� ��� ���� 
	}	
	// this : �ڽ��� ��ü 
	@Override
		public String toString() {    //��ü ��ü�� ��½� toString()�� ȣ�� 
			
			return "�̸� : " + name;			//this.name , 
		}
	
	@Override
		public boolean equals(Object obj) {    // e2.equals(a3);, ��ĳ���õ� 
		
			if ( this.name == ((E) obj).name ) {  //�ΰ�ü�� name�ʵ��� ���� �� 
				return true; 
			}else {
				return false; 
			}
		}
	

}

class Student1 {      //p.jangwoo@gmail.com
	int studentID;
	String name;
	int kor ; 
	int eng ;
	
	Student1(int studentID, String name, int kor, int eng){
		this.studentID = studentID;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	@Override
		public boolean equals(Object obj) {  // ��ĳ���õ� 
			if (this.studentID == ((Student1)obj).studentID){
				return true;
			} else {
				return false; 
			}				
		}
	@Override
		public String toString() {
			return studentID + "," +  name + "," + kor +"," + eng ;
		}
	
	
}

public class Quiz_04 {

	public static void main(String[] args) {
		Student1 s1 = new Student1(1111, "ȫ�浿" , 90, 80) ; 
		Student1 s2 = new Student1(2222, "�̼���" , 70,60) ; 
		Student1 s3 = new Student1(3333, "������", 80, 60) ; 
		Student1 s4 = new Student1(1111,"ȫ", 70, 100) ; 
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		
		/*studentID �� ���� ��� ���� �л��̴� ��� ��� 
		��ü�� StudentID �÷��� �� �ؼ� ���� ��� ���� �л� �̴� ��� ��� 
		
		
			   == : �⺻ Ÿ�� : boolean, byte, shot, int, long double , float, char  : 8��
						 ���� ��. 
			           ����Ÿ���� ��� : ��ü�� �ּҸ� ��. �迭, ��ü, String (Ư���ϰ� ���), 
			    			String : toString() ������ �Ǿ� �ִ�. equals (������)
			   object �� toString()  - ��ü ��ü�� println(a),  ��Ű���̸�.Ŭ�����̸�@�ؽ��ڵ�
			   				//�������̵� �ؼ� ��ü�� �ʵ��� ������ ���. 
			   			 equals()  :    ==   �� ����. , ��ü�� �ּҸ� ��. 
								������ �ؼ� ��ü���� Ư¡ �ʵ��� ���� ��.  			
		*/ 
		
		System.out.println(s1.equals(s4));   //true 
		
		if (s1.equals(s2)){
			System.out.println("s1�� s4�� ���� �л��Դϴ�. ");
		} else {
			System.out.println("s1�� s4�� �ٸ� �л��Դϴ�. ");
		}
		
		E e1 = new E (); 				//�⺻ ������ ȣ�� : Heap �� �ʵ��� ���� ���� �ʱ�ȭ ��
		System.out.println(e1.name);	//null
		
		E e2 = new E("�����");
		System.out.println(e2.name);
		
		E e3 = new E("�����"); 
		
		System.out.println(e2 == e3 );   //���� Ÿ�� ( == ): ��ü�� �ּҸ� �� 
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e2.equals(e3));  // Object�� equals() : (==) : ��ü�� �ּҸ� ��
		// Object�� toString(), equals() �� ������ �ؼ� ���. 
		
		
		
		
		
	}

}
