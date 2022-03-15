package chap03;

public class OperatorEx4 {

	public static void main(String[] args) {
		/* 대입 연산자 : = 를 포함하는 증감연산자, >>=, <<=, >>>= 등
		 * a=b; : b의 값을 a에 할당
		 * a +=b : a= a+b 
		 * a &=b : a= a&b
		 * a |=b : a|b
		 * a <<=b : a= a<<b
		*/
		int value1=3;
		value1 = value1+3;
		System.out.println(value1);
		System.out.println();
		
		int value2; // 기본형 자료형에 변수값을 넣지 않을 경우 기본값 0 할당
					// 참조형 자료형일 경우 기본값 null
		value2 = 5;
		System.out.println(value2+=2);
		System.out.println(value2-=2);
		System.out.println(value2/=2);
		value2=5;
		System.out.println(value2%=2); // 2로나눈 나머지값
		value2=5;
		System.out.println(value2|2); //2진법으로연산
		value2=5;
		System.out.println(value2&2);
		value2=5;
		
		System.out.println(value2 <<=2);
		value2=5;
		System.out.println(value2 >>=2);
		value2=5;
		System.out.println(value2 >>>=2); 
	}

}
