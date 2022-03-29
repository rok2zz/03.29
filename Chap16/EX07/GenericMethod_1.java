package Chap16.EX07;
//���ʸ� Ŭ���� : Ŭ������ ���� �� �� Ÿ�Ժ����� ���� <T> <<����>>. ��ü������ T�� ������ Ÿ�� ����
//���ʸ� �޼ҵ� : �Ϲ� Ŭ���� ������ �޼ҵ� ����� ���ʸ� Ÿ�� ���� ���

class Genericmethod{
	public <T> T method1(T t) {//���ʸ� �޼ҵ�
		return t;
	}
	public <T> boolean method2(T t1,T t2) {
		return t1.equals(t2); //�� ���� ���ؼ� true,false ����
								//�⺻�ڷ����϶��� ���� ��,�����ڷ����϶� �ּҺ�
	}
	
	public <K,V> void method3(K k, V v) {
		System.out.println(k+" : "+v);
	}
	
	public <K,V> void method4() {
		System.out.println("�Ű������� ��ǲ ������ ���� ��� ����");
	}
}

public class GenericMethod_1 {

	public static void main(String[] args) {
		//1. �Ϲ� Ŭ���� ��ü ���� �� ���ʸ� �޼ҵ� ȣ��
		Genericmethod gm = new Genericmethod();
		String str1 = gm.<String>method1("�ȳ�");
		String str2 = gm.method1("�ȳ�"); //Ÿ���� �� �� �ִ� �Ű������� ���� �� �� <>��������
		System.out.println(str1);
		System.out.println(str2);
		System.out.println("=================");
		
		Integer i = gm.<Integer>method1(100);
		Integer i2 = gm.method1(200);
		System.out.println(i);
		System.out.println(i2);
		System.out.println("=================");
		
		Boolean b1 = gm.<Boolean>method1(true);
		Boolean b2 = gm.<Boolean>method1(false);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println("=================");
		
		Boolean d1 = gm.<Double>method2(2.55,2.55);
		Boolean d2 = gm.<Double>method2(2.5,3.0);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println("=================");
		
		gm.<String, Integer>method3("����",80);
		gm.method3("����",90);
		
		gm.<Integer, String>method3(500,"���� ���� �Դϴ�.");
		gm.method3(402, "������ ã�� �� �����ϴ�.");
		
		gm.method4();
	}

}
