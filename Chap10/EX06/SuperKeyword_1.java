package Chap10.EX06;

//super : �θ� Ŭ���� ( ��Ӱ��迡�� �θ� ) 
//this  : �ڽ��� ��ü 

//���� ���̵� : �θ��� �޼ҵ尡 ������ ���� ���� �ʾҴ�. 

class A {
	void abc() {
		System.out.println("A Ŭ������ abc()");
	}
}
class B extends A {
	void abc () {
		System.out.println("B Ŭ������ abc()");
	}
	void bcd() {
		abc();      // this.abc     // this�� �ڽ��� ��ü  
		super.abc();
	}
}
public class SuperKeyword_1 {
	public static void main(String[] args) {
		//1. ��ü ���� 
		B bb = new B();
		//2. �޼��� ȣ�� 
		bb.bcd();  //BŬ������ 
		

	}

}
