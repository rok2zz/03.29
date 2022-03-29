package Chap16.EX04;


class KeyValue<K,V>{ //Argument 두개
	private K key;
	private V value;
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
}



public class TwoGenericArgument {

	public static void main(String[] args) {
		KeyValue<String,Integer> kv1 = new KeyValue<String,Integer>();
		//뒤의 생성자에서는 <> 생략가능
		kv1.setKey("사과");
		kv1.setValue(1000);
		System.out.println(kv1.getKey());
		System.out.println(kv1.getValue());
		System.out.println("=========================");
		
		KeyValue<Integer,String> kv2 = new KeyValue();
		kv2.setKey(404);
		kv2.setValue("Not Found");
		System.out.println(kv2.getKey());
		System.out.println(kv2.getValue());
		System.out.println("=========================");
		
		KeyValue<String,Double> kv3 = new KeyValue();
		kv3.setKey("평균값");
		kv3.setValue(555.555);
		System.out.println(kv3.getKey());
		System.out.println(kv3.getValue());
		System.out.println("=========================");
		
		//특정 타입 사용하지않을시 Void키 사용
		KeyValue<String, Void> kv4 = new KeyValue();
		kv4.setKey("키값만 사용");
		System.out.println(kv4.getKey());
		System.out.println("=========================");
	}

}
