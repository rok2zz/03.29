package Chap16.EX06;

public class GenericPrinter<T> { //�پ��� ���� �������ϴ� ������(�Ŀ쵵,�ö�ƽ,��)
	
	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	
	public String toString() {
		return material.toString(); // �ش� ��ü�� toString ȣ��
	}
	
	public void printing() {//�޼ҵ常 ����
		
	}
	

}
