package Chap06_07.EX02;
import java.util.Scanner;

public class Q1_Scanner_Flexible {
	
	static void sum(int...values) {
		int sum = 0;;
		for(int i=0;i<values.length;i++)
			sum+=values[i];
		System.out.println("입력한 정수의 합 : " + sum);
		System.out.println("입력한 정수의 평균 : " + (double)sum/values.length);
	}
	
	public static void main(String[] args) {
		// 스캐너로 임의의 정수값을 받아서 합계, 평균 구하기
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입력할 정수의 갯수를 입력하세요.");
		int count = sc.nextInt();
		int[] array = new int[count];
		System.out.println("정수를 입력하세요.");
		for(int i=0;i<count;i++)
			array[i] = sc.nextInt();
		
		sum(array);
		
		
		
		sc.close();
	}

}
