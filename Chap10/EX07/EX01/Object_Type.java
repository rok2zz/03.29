package Chap10.EX07.EX01;

class AA{
	int a =3;
	int b = 4;
	
	@Override
	public String toString() {
		return "a : " + a + "b : " + b ; 
	}
}
class BB{
	int a = 5;
	int b = 6;
	
	@Override
	public String toString() {
		return "a : " + a + "b : " + b ; 
	}
}
class CC{
	int a = 7;
	int b = 8;
	
	@Override
	public String toString() {
		return "a : " + a + "b : " + b ; 
	}
}

public class Object_Type {

	public static void main(String[] args) {
		//�ڹ��� ��� ��ü�� Object Ÿ������ ����ȯ�� �����ϴ�. 
		Object aa = new AA();
		Object bb = new BB();
		Object cc = new CC(); 
		
		//Object �迭�� ��ü ���� 
		Object[] arr1 = {aa, bb, cc};
		
		for ( int i = 0 ; i <arr1.length; i++) {
			System.out.println(arr1[i].toString());     // Object �� toString�� ȣ���� ��� 
		}												//�ڽ��� toString ȣ�� 
		
		System.out.println("==============");
		
		for (Object k : arr1) {
			System.out.println(k);       //��ü ��ü�� ����� ��� toString() �� ���     
		}
		
		
		
		
		
		
	}

}
