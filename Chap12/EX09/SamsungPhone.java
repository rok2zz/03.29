package Chap12.EX09;

public class SamsungPhone implements PhoneInterface{

	//�������̽����� ������ �޼ҵ带 �����ߴ�. 
	@Override
	public void sendCall() {
		System.out.println("�츮���� ~~~");	
	}
	@Override
	public void receiveCall() {
		System.out.println("��ȭ�� �Խ��ϴ� ~~~ ");
	}
	
	//�߰�����  SamgsungPhone ���� ����� �߰� 
	public void flash () {
		System.out.println("��ȭ�⿡ ���� �� �����ϴ�. ");
	}

}
