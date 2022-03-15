package chap01;

public class Ex02_ConsolOut02 {

	public static void main(String[] args) {
		System.out.printf("나의 나이는 %d입니다. \n",30); // %d 자리에 정수, printf : 출력포맷
		System.out.printf("%o\n",10); //%o : 8진수
		System.out.printf("%x\n", 30);//%x:16진수
		System.out.printf("%s\n","출력"); // %s : 문자열
		System.out.printf("%f\n",5.876534); //%f : 실수
		System.out.printf("%4.2f\n",5.8); //%4.2f : 전체 4자리, 소수점 이하 2자리
		System.out.printf("%d 와 %4.2f",10,5.8);
	}

}
