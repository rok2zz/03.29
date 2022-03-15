package Chaerok;

public class Print {

	public static void main(String[] args) {
		System.out.println("화면출력"); //자바의 한라인 주석
		/*
		 * 여러 라인 주석
		 * */
		System.out.println("화면"+"출력"); // + 는 문자일때 연결 연산
		System.out.println(3.8); //정수, 실수를 출력
		System.out.println(3+5); //+는 정수,실수 일때는 더하기
		System.out.println("3"+"5"); //"이기 때문에 문자취급
		System.out.println("화면 : "+3+5); //" 문자열이 앞에 존재하면 +가 문자 연결연산자 취급
		System.out.println(3+5+ "화면"); // 숫자가 앞에 존재하면 +가 더하기 취급
		System.out.println("화면"+" "+ 3); //오류발생
	}

}
