package Chap15.EX11;

/*
    ���� �����尡 ������ �ʵ忡 ���� �Ҷ� ���ü��� ������ �߻�.  ====> ����ȭ�� ���ü� ������ �ذ�.  
  
    ����ȭ : ���� �����尡 ������ �ʵ带 �����Ҷ� �ϳ��� �����尡 �Ϸ�Ǹ� �ٸ� �����忡�� ������ ���� 
    	�ϳ��� �����尡 ������� ��� lock �� �ɰ� �۾��� �Ϸ�Ǹ� �ٸ� �����尡 ���� �����ϵ��� Lock ���� 
    	
    	- ��� ��ȭ�� �޼ҵ�� this (�ڽ��� ��ü) ��� Ű�� ������. 
    	- ���� �޼ҵ尡 ����ȭ�� �޼ҵ��� ��� : �ϳ��� �����常 ������ ���� 
    	
 */

class MyData{   //���� ��ü : ���� �����尡 ���� ��ü�� ���� 
		//����ȭ�� �޼ҵ�� Key���� ��� this�� �ڵ����� ���, ������ �Ұ���.
		  //����ȭ �޼ҵ�� Key ���� ���� �� ����. 
		  //�ϳ��� �����尡 �����Ҷ� Key�� ������ ����ȭ�� �޼ҵ带 ���� �����ϴ�. 
		  //Key �� ��ü�� Ű�� ����� �� �ִ�. 
	    //����ȭ ���� Key ���� ���Ƿ� �Ҵ� �����ϴ�. 
	synchronized void abc() {	//���������尡 �����Ҷ� ���ü� ������ �����ϱ� ���ؼ� ����ȭ ó�� 
		for (int i=0 ; i < 3; i++) {
			try {Thread.sleep(10);} catch (InterruptedException e1) {}  //0.01�� ������
			System.out.println(i + "sec");    
			try {Thread.sleep(1000);} catch (InterruptedException e) {}  //1�� ������
		}
	}
	synchronized void bcd() {	//���������尡 �����Ҷ� ���ü� ������ �����ϱ� ���ؼ� ����ȭ ó�� 
		 try {Thread.sleep(20);} catch (InterruptedException e1) {}  //0.02�� ������
		for (int i=0 ; i < 3; i++) {
			System.out.println(i + "��");    
			try {Thread.sleep(1000);} catch (InterruptedException e) {}  //1�� ������
		}
	}
	synchronized void cde() {	//���������尡 �����Ҷ� ���ü� ������ �����ϱ� ���ؼ� ����ȭ ó�� 
		 try {Thread.sleep(30);} catch (InterruptedException e1) {}  //0.03�� ������
		for (int i=0 ; i < 3; i++) {
			System.out.println(i + "��°");    
			try {Thread.sleep(1000);} catch (InterruptedException e) {}  //1�� ������
		}
	}	
}

public class KeyObject_1 {
	public static void main(String[] args) {

		//������ü 
		MyData myData = new MyData();
		
		// ������ �����尡 ������ �޼ҵ� ȣ�� 
		new Thread() {					// �͑mŬ���� : ������Ŭ������ �����ϴ� �ڽ� �͸� Ŭ���� 
			public void run() {
				myData.abc();			//ù��° ������ abc() �޼ҵ� ȣ�� 
			};
		}.start();
		
		new Thread() {					// �͑mŬ���� : ������Ŭ������ �����ϴ� �ڽ� �͸� Ŭ���� 
			public void run() {
				myData.bcd();			//�ι�° ������ bcd() �޼ҵ� ȣ�� 
			};
		}.start();
		
		new Thread() {					// �͑mŬ���� : ������Ŭ������ �����ϴ� �ڽ� �͸� Ŭ���� 
			public void run() {
				myData.cde();			//����° ������ cde()  �޼ҵ� ȣ�� 
			};
		}.start();
		

	}

}
