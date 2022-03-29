package Chap16.EX02;
//Object를 사용해서 5개의 객체를 저장하고 출력

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
		return "이름 : " + name + ", id : " + id + ", 암호 : " + pass;			
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
		return "이름 : " + name + ", 연차 : " + year + ", 이메일 : " + email;			
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
		return "이름 : " + name + ", 달리기 : " + run;
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
		return "이름 : " + name + ", 색깔 : " + color + ", 가격 : " + price;			
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
		return "이름 : " + name + ", 색깔 : " + color + ", 날기 : " + fly;
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
		student.setObject(new Student("홍길동","gildong123",1234));
		System.out.println((Student)student.getObject());
		
		ExObject professor = new ExObject();
		professor.setObject(new Professor("이순신",35,"ss123@naver.com"));
		System.out.println((Professor)professor.getObject());
		
		ExObject tiger = new ExObject();
		tiger.setObject(new Tiger("호랑이","호랑이는 잘 달린다."));
		System.out.println((Tiger)tiger.getObject());
		
		ExObject banana = new ExObject();
		banana.setObject(new Banana("바나나","노랑색",7000));
		System.out.println((Banana)banana.getObject());
		
		ExObject bird = new ExObject();
		bird.setObject(new Bird("참새","갈색","참새는 잘 난다."));
		System.out.println((Bird)bird.getObject());
	}

}
