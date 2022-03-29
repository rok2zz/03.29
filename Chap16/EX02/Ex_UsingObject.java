package Chap16.EX02;
//Object�� ����ؼ� 5���� ��ü�� �����ϰ� ���

class Student{
	String name;
	String id;
	int pass;
	
	Student(String name, String id, int pass){
		this.name = name;
		this.id = id;
		this.pass = pass;
	}
	
	@Override
	public String toString() {
		return "�̸� : " + name + ", id : " + id + ", ��ȣ : " + pass;			
	}
}

class Professor{
	String name;
	int year;
	String email;
	
	Professor(String name, int year, String email){
		this.name = name;
		this.year = year;
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "�̸� : " + name + ", ���� : " + year + ", �̸��� : " + email;			
	}
}

class Tiger {
	String name;
	String run;
	
	Tiger(String name, String run){
		this.name = name;
		this.run = run;
	}
	
	@Override
	public String toString() {
		return "�̸� : " + name + ", �޸��� : " + run;
	}
}

class Banana{
	String name;
	String color;
	int price;
	
	Banana(String name, String color, int price){
		this.name = name;
		this.color = color;
		this.price = price;
	}
	@Override
	public String toString() {
		return "�̸� : " + name + ", ���� : " + color + ", ���� : " + price;			
	}
}

class Bird{
	String name;
	String color;
	String fly;
	
	Bird(String name, String color, String fly){
		this.name = name;
		this.color = color;
		this.fly = fly;
	}
	@Override
	public String toString() {
		return "�̸� : " + name + ", ���� : " + color + ", ���� : " + fly;
	}
}

class ExObject{
	private Object object = new Object();

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}
}
public class Ex_UsingObject {

	public static void main(String[] args) {
		ExObject student = new ExObject();
		student.setObject(new Student("ȫ�浿","gildong123",1234));
		System.out.println((Student)student.getObject());
		
		ExObject professor = new ExObject();
		professor.setObject(new Professor("�̼���",35,"ss123@naver.com"));
		System.out.println((Professor)professor.getObject());
		
		ExObject tiger = new ExObject();
		tiger.setObject(new Tiger("ȣ����","ȣ���̴� �� �޸���."));
		System.out.println((Tiger)tiger.getObject());
		
		ExObject banana = new ExObject();
		banana.setObject(new Banana("�ٳ���","�����",7000));
		System.out.println((Banana)banana.getObject());
		
		ExObject bird = new ExObject();
		bird.setObject(new Bird("����","����","������ �� ����."));
		System.out.println((Bird)bird.getObject());
	}

}
