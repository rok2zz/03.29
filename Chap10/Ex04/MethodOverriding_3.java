package Chap10.Ex04;

//�޼ҵ� �������̵��� ���� �����ڿ��� ���� 
	//�ڽ��� Ŭ�������� �θ��� �޼ҵ带 ������ �Ұ�� ���� �����ڴ� �θ�� ���ų� ����� �ȴ�. 

	// public > protected > default > private 

class Aaa {
	protected void abc() {}
}
class B1 extends Aaa {
	@Override
	public void abc() {	}
}
class B2 extends Aaa{
	@Override
	protected void abc() {	}
}
class B3 extends Aaa{
	//@Override
	//void abc() {} // ���� �߻� : �������̵��� �޼ҵ��� ���� ������ ���� 
}
class B4 extends Aaa {
	//@Override 
	//private void abd() {}  // ���� �߻� : �������̵��� �޼ҵ��� ���� ������ ���� 
}




public class MethodOverriding_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
