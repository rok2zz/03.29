package Chap16.EX07;
//���ʸ� �޼ҵ� ���ο��� ��� ������ �޼ҵ� : Object  Ŭ������ �޼ҵ常 ��� ����

class A{
	public <T> void method(T t) {
		//System.out.println(t.length()); //t.length(); : String ���ڼ� ����, ��� �Ұ�
		System.out.println(t.equals("�ȳ�")); //t.equalsd()�� OBject�� �޼ҵ�� ��밡��
	}
}
public class AvailableMethodInGenericMethod {

	public static void main(String[] args) {
		A a = new A();
		a.<String>method("�ȳ�");
		

	}

}
