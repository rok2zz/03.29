package Chap16.EX06;

//Generic Printer에 사용될 객체

public class Powder {
	
	public void doPrinting() {
		System.out.println("파우더 재료로 출력 합니다.");
	}
	@Override
	public String toString() {
		return "재료는 파우더입니다.";
	}

}
