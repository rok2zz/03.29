package chap05;

public class Value_Assignment_Ex02 {

	public static void main(String[] args) {
		// 1. 배열 변수의 방에 값 할당하기(3가지 방법)
		
		int[] array1 = new int[3]; // 배열 변수 array1, 방크기 3, 방번호는 0부터 3개
		// array1[0],array1[1],array1[2] 생성
		array1[0] = 3;
		array1[1] = 4;
		array1[2] = 5;
		
		System.out.println(array1[0] + " " + array1[1] + " " + array1[2]);
		System.out.println("=============================");
		
		int[] array2 = new int[3]; // 배열 변수 array1, 방크기 3, 방번호는 0부터 3개
		// array1[0],array1[1],array1[2] 생성
		array2[0] = 3;
		array2[1] = 4;
		array2[2] = 5;
		
		System.out.println(array2[0] + " " + array2[1] + " " + array2[2]);
		System.out.println("=============================");
		
		// 배열의 원소값을 대입 방법2
		int[] array3 = new int[] {6,7,8,9,10};// 배열 변수 선언과 동시에 값 할당 
		System.out.println(array3[0] + " " + array3[1] + " " + array3[2] 
				+ " " + array3[3] + " " + array3[4]);
		System.out.println("=============================");
		
		int[] array4;
		array4 = new int[] {3,4,5}; // 한 번에 값을 넣을 때 방번호 지정 x
		System.out.println(array4[2]); // 2번방에 있는 값 출력
		System.out.println("=============================");
		
		// 배열의 원소값을 대입 방법3
		int[] array5 = {11, 12 ,13};
		System.out.println(array5[0] + " " + array5[1] + " " + array5[2] );
				
		/*int[] array6;
		array6 = {11,12,13}; //new int 안써서 오류
		System.out.println(array6[0] + " " + array6[1] + " " + array6[2] );
		*/	
		
	}

}
