package Chap16.EX03;

//Generic Ŭ���� : �ϳ��� Ŭ�������� �پ��� ������ Ÿ�� ó�� ����
//���ʸ� Ÿ�� ���� : T(Ÿ��), K(Key), V(Value), E(Element)
	// -A~Z ���Ƿ� ���� �� �ִ�
	//wrapperŬ���� : �⺻ Ÿ���� ��üȭ ���ѳ��� Ŭ����
		//int(�⺻Ÿ��) >> Integer(��ü), boolean >> Boolaen
		//char >> Charter, double >> Double
class MyClass<T>{
	private T t;
	
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t = t;
	}
}
public class SingleGenericArgument {

	public static void main(String[] args) {
		// 1. ���ʸ� Ŭ���� ��ü ���� <String> �Է�
		MyClass<String> mc1 = new MyClass<String>();
		mc1.set("�ȳ�");
		System.out.println(mc1.get());
		
		//2.���ʸ� Ŭ���� ��ü ����<Integer>
		MyClass<Integer> mc2 = new MyClass<Integer>(); //wrapper Ŭ������ �Ҵ��ؾ��Ѵ�
		mc2.set(100);
		System.out.println(mc2.get());
		
		//3. ���ʸ� Ŭ���� ��ü ����<Double>
		MyClass<Double>mc3 = new MyClass();
		mc3.set(333.33);
		System.out.println(mc3.get());
		
		//4. ���� Ÿ�� üũ
		MyClass<Boolean>mc4 = new MyClass();
		mc4.set(true);
		mc4.set(false);
		//mc4.set(55); �ٷ� ���� �߻�
		System.out.println(mc4.get());
		
		
		
		
	}

}
