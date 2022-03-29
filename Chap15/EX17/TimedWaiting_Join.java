package Chap15.EX17;

// a.join(1000) : a ��ü���� CPU�� �Ҵ��ϰ� �ڽ��� TimedWaiting ���·� ��� 

class MyThread1 extends Thread{
	
	public void run() {
		for (long i = 0 ; i < 1000000000000L ; i++) {}   // �ð����� 1�� 100�� 
		for (long i = 0 ; i < 1000000000000L ; i++) {} 
		for (long i = 0 ; i < 1000000000000L ; i++) {} 
	};
}
class MyThread2 extends Thread{
	MyThread1  myThread1; 	//Ŭ����Ÿ�� ��������; 
	
	public MyThread2 (MyThread1 myThread1) {   //�����ڸ� ���ؼ� ���������� �� �Ҵ�. 
		this.myThread1 = myThread1; 
	}
	 @Override
	public void run() {
		try {
			myThread1.join(3000);  // MyThread2�� 3�ʴ���ϰ� myThread1���� CPU �Ҵ�. 
		} catch (InterruptedException e) {
			System.out.println("---join(...) ������ interrupt �߻�");
			for (long i = 0 ; i < 100000000L ; i++) {}  // �ð� ���� 0.5�� 
		}
	}	
}

public class TimedWaiting_Join {
	public static void main(String[] args) {
		//1. ��ü ���� 
		MyThread1 myThread1 = new MyThread1(); 
		MyThread2 myThread2 = new MyThread2(myThread1); 
		myThread1.start();
		myThread2.start();
		
		try {Thread.sleep(1);} catch (InterruptedException e) {}  //������ ���� �غ� �ð� 0.01��
		System.out.println("MyThread1 State : " + myThread1.getState());  //RUNNABLE
		System.out.println("MyThread2 State : " + myThread2.getState());  //TIMED_WATING 
		
		myThread2.interrupt();   //3�� ����� ���� ���ͷ�Ʈ�� �߻� �Ǹ� ���ܸ� �߻���Ű�� Runnable�� �̵���.
		try {Thread.sleep(1);} catch (InterruptedException e) {}  //������ ���� �غ� �ð� 0.01��
		System.out.println("MyThread1 State : " + myThread1.getState());  //RUNNABLE
		System.out.println("MyThread2 State : " + myThread2.getState());  //Runnable
		
	}

}
