package Chap16.EX06;

//Generic Printer에 사용될 객체

public class Water {
	
	public void doPrinting() {
		System.out.println("물을 재료로 출력 합니다.");
	}
	@Override
	public String toString() {
		return "재료는 물입니다.";
	}

}
