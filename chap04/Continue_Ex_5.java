package chap04;

public class Continue_Ex_5 {

	public static void main(String[] args) {
		// 1. 단일 루프에서 continue
		
		for(int i=0;i<10;i++) {
			continue; // 조건 들어가게씀 보통
			//System.out.println("출력 구문 오류");
		}
		for(int i=0;i<10;i++) {
			System.out.print(i+ " ");
			continue; // continue는 조건 없이 하위에 실행문을 사용하면 오류	
//			System.out.println();
		}
		System.out.println();
		System.out.println("=====continue=====");
		
		// 2. 조건을 사용해서 continue 처리
		for(int i=0;i<10;i++) {
			if(i==5) {
				continue;
			}
			System.out.print(i+ " ");
		}
		System.out.println();
		System.out.println("=====break=====");
		
		// 2. 조건을 사용해서 break 처리
		for(int i=0;i<10;i++) {
			if(i==5) {
				break;
			}
			System.out.print(i+ " ");
		}
		System.out.println();
		System.out.println("=====다중 루프문 continue=====");
		
		// 3. 다중 루프문에서 continue 사용
		for(int i=0;i<5;i++) {
			for(int j=0;j<5; j++) {
				if(j==3) {
					continue;
				}
				System.out.println(i+ " , " + j);
			}
		}
		System.out.println();
		System.out.println("=====다중 루프문 break=====");
		// 3. 다중 루프문에서 break 사용
		for(int i=0;i<5;i++) {
			for(int j=0;j<5; j++) {
				if(j==3) {
					break;
				}
				System.out.println(i+ " , " + j);
			}
		}
		
		System.out.println();
		System.out.println("=====continue에서 라벨 사용=====");
		// 4. continue에서 라벨 사용
		POS2:for(int i=0;i<5;i++) {//continue pos2로 여기로 옴
			for(int j=0;j<5; j++) {
				if(j==3) {
					continue POS2; //j=4일때도 실행안되고 바로 위로 감
				}
				System.out.println(i+ " , " + j);
			}
		}
		System.out.println();
		System.out.println("=====break에서 라벨 사용=====");
		// 4. break에서 라벨 사용
		POS3:for(int i=0;i<5;i++) {
			for(int j=0;j<5; j++) {
				if(j==3) {
					break POS3; //j=3일때 이중for문 종료
				}
				System.out.println(i+ " , " + j);
			}
		}
	}

}
