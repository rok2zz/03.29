package chap04;

public class Continue_Quiz {

	public static void main(String[] args) {
		// 1. continue 를 사용해서 1 ~ 19단 출력하는데 홀수단만 출력
		
		POS:for(int i=1; i<=19;i++) {
			for(int j=1;j<=19;j++) {
				if((i%2)==0) {
					continue POS;
				}
				System.out.println(i + " * " + j + " = " + (i*j));
			}
		}

		for(int i=1; i<=19;i++) {
			if((i%2)==0) {
				continue;
			}
			for(int j=1;j<=19;j++) {
				System.out.println(i + " * " + j + " = " + (i*j));
			}
		}
		System.out.println("============================");
		
		// 2. continue 를 사용해서 1 ~ 19단 출력하는데 3의 배수만 출력
		
		POS:for(int i=1; i<=19;i++) {
			for(int j=1;j<=19;j++) {
				if((i%3)!=0) {
					continue POS;
				}
				System.out.println(i + " * " + j + " = " + (i*j));
			}
		}

		for(int i=1; i<=19;i++) {
			if((i%3)!=0) {
				continue;
			}
			for(int j=1;j<=19;j++) {
				System.out.println(i + " * " + j + " = " + (i*j));
			}
		}
	}

}
