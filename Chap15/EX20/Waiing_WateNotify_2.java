package Chap15.EX20;

class DataBox{
	boolean isEmpty = true;
	int data ; //���� �ʵ� 
	
	synchronized void inputData (int data) {	//����ȭ �޼ҵ� 
		if(!isEmpty) { //false �϶� wait(); ����ȭ ����̳� �޼��忡�� waiting ���·� ��ȯ
						//data�ʵ��� ���� ������� ���� �� ��� ���, t2�� ó��
			try {
				wait();
			}
			catch(InterruptedException e) {}
		}
		
		isEmpty = false; // Data�ʵ��� ���� �ְ� t2�� ���� �������ֵ��� false����
		this.data = data; 
		System.out.println("�Է� ������" + data);   //data : �Ű����� ������ ���� ������ 
	}
	synchronized void outputData () {			//����ȭ �޼ҵ� 
		try {
			wait();
		}
		catch(InterruptedException e) {}
		isEmpty = true;
		System.out.println("��� ������" + data);   // data : �޸��� data , this �����Ǿ� ����. 
		notify(); //inputData()�޼ҵ��� wait()�� �����带 ������
	}
}
public class Waiing_WateNotify_2 {

	public static void main(String[] args) {
DataBox dataBox = new DataBox();
		
		//ù��° ������ : ���� ��ü�� ���� �ִ� ������ 
		Thread t1 = new Thread() {          //�͸� ���� Ŭ���� 
			@Override
			public void run() {
				for (int i = 1 ; i <9 ; i++) {
					dataBox.inputData(i);
				}
			}
		};
		
		//�ι�° ������ : ���� ��ü�� ���� ���� �о� ���� �޼ҵ� 
		Thread t2 = new Thread() {
			@Override
			public void run() {
				for (int i=1 ; i < 9 ; i++) {
					dataBox.outputData();
				}
			}
		};
		
		t1.start();
		t2.start();

	}

}
