package Chap10.Ex04;

class Animal2 {
	void run() {		
	}}
class Tiger extends Animal2 { //ȣ���̴� �׹߷� �޸��ϴ�. 
	@Override
	void run() {
		System.out.println("ȣ���̴� �׹߷� �޸��ϴ�. ");
	}	
	void tigerEat () {
		System.out.println("ȣ���̴� ������ �Խ��ϴ�. ");
	}
}
class Egle extends Animal2 {  //�������� �ϴ��� ���ϴ�. 
	@Override
	void run() {
		System.out.println("�������� �ϴ��� ���ϴ� ");
	}
	void egleEat () { 
		System.out.println("�������� �ٸ� ���� ��� �Խ��ϴ�. ");
		
	}
}
class Snake extends Animal2{   //���� ���ٴմϴ�. 
	@Override
	void run() {
		System.out.println("���� ���ٴմϴ� ");
	}
}
public class MethodOverriding_2 {
	public static void main(String[] args) {	
		//1. ��� ��ü�� Animal2 Ÿ������ ��ĳ�����ؼ� ����.
		Animal2 a = new Tiger();
		Animal2 b = new Egle();
		Animal2 c = new Snake();
		
		//2. Animal2 �迭�� �� ��ü�� ����. 
		Animal2[] arr = {a,b,c};
		
		//3. for������ �迭�� ��ü�� ��� . run()�� ����. 
		for (int i=0; i < arr.length; i++) {
			arr[i].run();
		}
		//4. Enhanced For ���� ����ؼ� ��ü�� run() �޼ҵ� ��� 	
		for ( Animal2 k : arr) {
			k.run();
		}
		//5. �ٿ� ĳ���� ( instanceof ����ؼ� ) ==>  tigerEat(), egleEat() �޼ҵ� ���  
		if (a instanceof Tiger) {
			Tiger a_down = (Tiger) a; 
			a_down.tigerEat();
		}
		if (b instanceof Egle) {
			Egle b_down = (Egle) b; 
			b_down.egleEat();
		}
		if ( c instanceof Snake) {
			Snake c_down = (Snake) c;
			
		}
		
		//p.jangwoo@gmail.com

	}

}
