package Chap15;

/*    �Ϸ�ð� : 13:20�б��� , p.jangwoo@gmail.com
 * 
 ������ 4�� ���� :  1, Thread�� ���, 2, Runnable ���� , 3.4. �͸� ����Ŭ������ �����ؼ� ���� 
�� ���� String �迭�� ������ �Ʒ��� ���� ��� �ϼ���. 
 
 1		2		3		4
 �̸� 	ȫ�浿	�̼���	�Ż��Ӵ�
 ���� 	40		50		60
 ����		100		90		80
 ����    70		60		100
 ����		50		70		80
 
 
 */

//ppt 20 ~ 30 page 
//dothome, GitHub, GitHub page

class F_Thread extends Thread{
	@Override
	public void run() {
		//0.01�� ���� , ���� ���� ���
		try {Thread.sleep(0);} catch (InterruptedException e) {}
		String[] strArr = {"T_1", "�̸�", "����", "����", "����", "����"};
		for (int i = 0 ; i < strArr.length; i++) {
			System.out.print(strArr[i] + "\t");
			try {Thread.sleep(200);} catch (InterruptedException e) {}
		}	
	}
}

class S_Thread implements Runnable{
	@Override
	public void run() {
		//0.01�� ���� , �ι�° ���
		try {Thread.sleep(10);} catch (InterruptedException e) {}
		String[] strArr = {"T_2", "ȫ�浿", "40", "100", "70", "50"};
		for (int i = 0 ; i < strArr.length; i++) {
			System.out.print(strArr[i] + "\t");
			try {Thread.sleep(200);} catch (InterruptedException e) {}
		}	
	}
}

public class EX_CreateAndStartThread {
	public static void main(String[] args) {
		//1. ù��° ������ ��ü ����
		Thread thread1 = new F_Thread(); 
		
		//2. �ι�° ������ ��ü ����
		Runnable r1 = new S_Thread();
		Thread thread2 = new  Thread(r1);
		

		
		//3. ����° ������ - �͸��� ��ü �̿�
		Thread thread3 = new Thread(new Runnable() {
			public void run() {
				//0.02�� ���� , ����° ���
				try {Thread.sleep(20);} catch (InterruptedException e) {}
				String[] strArr = {"T_3", "�̼���", "50", "90", "60", "70"};
				for (int i = 0 ; i < strArr.length; i++) {
					System.out.print(strArr[i] + "\t");
					try {Thread.sleep(200);} catch (InterruptedException e) {}
				}
			};
		});
		
		
		//4. �׹�° ������ - �͸��� ��ü �̿�
		Thread thread4 = new Thread(new Runnable() {
			public void run() {
				//0.03�� ���� , �ι�° ���
				try {Thread.sleep(30);} catch (InterruptedException e) {}
				String[] strArr = {"T_4", "�Ż��Ӵ�", "60", "80", "100", "80"};
				for (int i = 0 ; i < strArr.length; i++) {
					System.out.println(strArr[i] + "\t");
					try {Thread.sleep(200);} catch (InterruptedException e) {}
				}
			};
		});
		
		//3. ������ ���� 
			thread1.start();
			thread2.start();
			thread3.start();
			thread4.start();
	}
}
