package Chap15.EX04;

// Runnable �������̽��� run()�� �����ؼ� ������ ���� 
class SMIFileRunnable implements Runnable{  //�������̽� 
	@Override
	public void run() {
		//1 �ڸ� ��ȣ ��� 
		String[] strArray = {"�ϳ�", "��", "��", "��", "�ټ�"};
		try {Thread.sleep(10);} catch (InterruptedException e1) {}  //0.01 
		for (int i = 0 ; i < strArray.length ; i++) {
			System.out.println(" - �ڸ� ��ȣ " + strArray[i]);
			try {Thread.sleep(200);} catch (InterruptedException e) {}  //0.2�� ������ 			
		}
		
	}
}

class VidioFileRunnable implements Runnable {
	@Override
	public void run() {
		//2. ���� ������ ��� 
		int[] intArray = {1,2,3,4,5};
		for( int i =0 ; i< intArray.length; i++) {
			System.out.print("(����������" + intArray[i]);
			try {Thread.sleep(200);} catch (InterruptedException e) {}  //0.2�� ������ 
		}
		
	}
}


public class CreateAndStartThread_3 {

	public static void main(String[] args) {
		//ù��° ��ü ������ ������ ���� 
		Runnable smi = new SMIFileRunnable();  
		//smi.start();     //start() �޼ҵ�� Runnable �������̽� ���� �������� �ʴ´�. 
		Thread thread = new Thread(smi);   // Runnable��ü�� Thread ������ ���ο� �ִ´�. 
		thread.start();   // 
		
		//�ι�° ��ü ������ ������ ���� 
		Runnable vidio = new VidioFileRunnable();
		Thread thread2 = new Thread(vidio); 
		thread2.start(); 
		
	}

}
