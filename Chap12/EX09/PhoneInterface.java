package Chap12.EX09;

public interface PhoneInterface {
	int TIMEOUT = 10000;   	// public static final ������ 
	void sendCall();		// public abstact
	void receiveCall();		
	default void printLogo() {
		System.out.println("�ΰ� ��� �մϴ�. ");
	}

}
