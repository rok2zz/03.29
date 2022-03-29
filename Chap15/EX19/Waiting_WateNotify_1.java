package Chap15.EX19;

//Waiting : 
    //a.join () : �ڽ��� ������� Waiting �����̰� a ��ü���� CPU (Runnable) 
				//a  ��ü�� ������ �Ϸ�Ǹ� �ڽ��� �����尡 (Runnable)�� �̵� 
			//�ڽ� �������� ó���� ������ �ٸ� �������� ����� �޾Ƽ� ó���ؾ� �� ��� 
	//wait(), notify(), notifyAll() <== ����ȭ ��������� ����.
	//  - wait() : ����ȭ ��(�޼ҵ�) ������ wait() �޼ҵ带 ������ Waiting ���·� ����. 
    //  - notify(), notifyAll()�� wait() �޼ҵ带 ������. <== �ݵ�� �ٸ� ���������� �����ټ� �ִ�. 

class DataBox{
	int data ; //���� �ʵ� 
	
	synchronized void inputData (int data) {	//����ȭ �޼ҵ� 
		this.data = data; 
		System.out.println("�Է� ������" + data);   //data : �Ű����� ������ ���� ������ 
	}
	synchronized void outputData () {			//����ȭ �޼ҵ� 
		System.out.println("��� ������" + data);   // data : �޸��� data , this �����Ǿ� ����. 
	}
}
public class Waiting_WateNotify_1 {

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
