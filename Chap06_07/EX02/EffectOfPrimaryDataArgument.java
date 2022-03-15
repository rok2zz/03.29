package Chap06_07.EX02;

public class EffectOfPrimaryDataArgument {
	int abc; //필드
	
	
	static int twice(int a) { //정수를 받아서 x2해서 반환
		a = a*2;
		return a;
	}
	
	public static void main(String[] args) {
		int a=3; // 지역변수 stack 에 변수명과 같이 저장
		int result1 = twice(3);
		System.out.println(result1);
		
		int result2 = twice(a);
		System.out.println(result2);
		System.out.println(a); // 메인의 a는 변화 x

	}

}
