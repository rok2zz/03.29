package Chap16.EX05;

class Student{
	String name;
	String id;
	int pass;
	
	Student(String name, String id, int pass){
		this.name = name;
		this.id = id;
		this.pass = pass;
	}
	
	public void abc() {
		System.out.println("이름 : " + name + ", id : " + id + ", 암호 : " + pass);
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

class ExGeneric<K,V,T>{ //Argument 두개
	private K key;
	private V value;
	private T type;
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	public T getType() {
		return type;
	}
	public void setType(T type) {
		this.type = type;
	}
}


public class Ex_UsingGeneric {

	public static void main(String[] args) {
		ExGeneric<String,String,Integer> student = new ExGeneric();
		student.setKey("홍길동");
		student.setValue("gildong123");
		student.setType(1234);
		System.out.println(student.getKey());
		System.out.println(student.getValue());
		System.out.println(student.getType());
		System.out.println("===========================");
		
		ExGeneric<String,Integer,String> professor = new ExGeneric();
		professor.setKey("이순신");
		professor.setValue(35);
		professor.setType("ss123@naver.com");
		System.out.println(professor.getKey());
		System.out.println(professor.getValue());
		System.out.println(professor.getType());
		System.out.println("===========================");
		
		ExGeneric<String,String,Void> Tiger = new ExGeneric();
		Tiger.setKey("호랑이");
		Tiger.setValue("달리기");
		System.out.println(Tiger.getKey());
		System.out.println(Tiger.getValue());
		System.out.println("===========================");
		
		ExGeneric<String,String,Integer> banana = new ExGeneric();
		banana.setKey("바나나");
		banana.setValue("노란색");
		banana.setType(7000);
		System.out.println(banana.getKey());
		System.out.println(banana.getValue());
		System.out.println(banana.getType());
		System.out.println("===========================");
		

	}

}
