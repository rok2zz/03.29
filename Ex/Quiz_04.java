package Ex;

class E extends Object {   //자바의 모든 클래스는 Object 의 자식 클래스이다. 
								//Object 클래스의 정의된 메소드를 사용할 수 있다. 
	String name; 
	E (){}				// 기본 생성자 : 클래스내의 다른 생성자가 존재 할때 외부에서 기본생자를 호출할때 
						//     생략 되면 안된다. 
	E (String name) {
		this.name =name;  //매개변수 이름, 구현부에서 매개변수를 받는 변수명, 필드의 변수명이 모두 동일 
	}	
	// this : 자신의 객체 
	@Override
		public String toString() {    //객체 자체를 출력시 toString()가 호출 
			
			return "이름 : " + name;			//this.name , 
		}
	
	@Override
		public boolean equals(Object obj) {    // e2.equals(a3);, 업캐스팅됨 
		
			if ( this.name == ((E) obj).name ) {  //두객체의 name필드의 값을 비교 
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
		public boolean equals(Object obj) {  // 업캐스팅됨 
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
		Student1 s1 = new Student1(1111, "홍길동" , 90, 80) ; 
		Student1 s2 = new Student1(2222, "이순신" , 70,60) ; 
		Student1 s3 = new Student1(3333, "강감찬", 80, 60) ; 
		Student1 s4 = new Student1(1111,"홍", 70, 100) ; 
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		
		/*studentID 가 같은 경우 같은 학생이다 라고 출력 
		객체의 StudentID 컬럼을 비교 해서 같을 경우 같은 학생 이다 라고 출력 
		
		
			   == : 기본 타입 : boolean, byte, shot, int, long double , float, char  : 8개
						 값을 비교. 
			           참조타입인 경우 : 객체의 주소를 비교. 배열, 객체, String (특수하게 사용), 
			    			String : toString() 재정의 되어 있다. equals (재정의)
			   object 의 toString()  - 객체 자체를 println(a),  패키지이름.클래스이름@해쉬코드
			   				//오버라이딩 해서 객체의 필드의 정보를 출력. 
			   			 equals()  :    ==   과 같다. , 객체의 주소를 비교. 
								재정의 해서 객체내의 특징 필드의 값을 비교.  			
		*/ 
		
		System.out.println(s1.equals(s4));   //true 
		
		if (s1.equals(s2)){
			System.out.println("s1과 s4는 같은 학생입니다. ");
		} else {
			System.out.println("s1과 s4는 다른 학생입니다. ");
		}
		
		E e1 = new E (); 				//기본 생성자 호출 : Heap 의 필드의 값은 강제 초기화 됨
		System.out.println(e1.name);	//null
		
		E e2 = new E("고양이");
		System.out.println(e2.name);
		
		E e3 = new E("고양이"); 
		
		System.out.println(e2 == e3 );   //참조 타입 ( == ): 객체의 주소를 비교 
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e2.equals(e3));  // Object의 equals() : (==) : 객체의 주소를 비교
		// Object의 toString(), equals() 는 재정의 해서 사용. 
		
		
		
		
		
	}

}
