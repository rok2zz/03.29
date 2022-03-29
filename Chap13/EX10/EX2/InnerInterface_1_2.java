package Chap13.EX10.EX2;
  //p.jangwoo@gmail.com  : 5���� (30��) 

class Abc {   
	//1. ��ü ������ �ʵ忡 ���� ���� �Ҵ�. (d1)
	//2. �����ڸ� ���ؼ� �� �Ҵ�, (d2)
	//3. setter�� ���ؼ� ���Ҵ� (d3)
	
	Def d;		//�ʵ� ��� 
				//������ ��� 
	
	Abc() {} 		//�⺻������ 
	Abc(Def d){		//�����ڸ� ���ؼ� �ʵ��� �麻�� �Ҵ�. 
		this.d = d; 
	}
	void setD (Def d) {  //setter�� ���ؼ� �ʵ��� �⺻�� �Ҵ� 
		this.d = d; 
	}
	
	
	interface Def { //Abc.Def 
		void run ();
		void fly (); 
	}	
	void ghi() {
		d.run();
		d.fly(); 
	}
}

public class InnerInterface_1_2 {
	public static void main(String[] args) {
		
		//1. ��ü ������ �ʵ忡 ���� ���� �Ҵ�. (d1)
		Abc d1 = new Abc();
		d1.d = (Abc.Def) new Abc.Def() {	
			public void run() { System.out.println("����̰� �޸��ϴ�. ");	}
			public void fly() { System.out.println("����̴� ���� ���մϴ�. ");}
		};
		d1.ghi();
		System.out.println("=============");
		//2. �����ڸ� ���ؼ� �� �Ҵ�, (d2)
		Abc d2 = new Abc(
				new Abc.Def() {		//�̳� �������̽� 	
					public void run() {System.out.println("���� ��½ ��½ �޸��ϴ�.");}				
					public void fly() {System.out.println("���� ���� ���մϴ�. ");}
				}); 
		d2.ghi();
		System.out.println("=====================");
		//3. setter�� ���ؼ� ���Ҵ� (d3)
		Abc d3 = new Abc(); 
		d3.setD( new Abc.Def() {
			public void run() {System.out.println("�������� �޸��� ���մϴ�.");}
			public void fly() {System.out.println("�������� ����ٴմϴ�.");}
		});	
		d3.ghi();
	}
}
