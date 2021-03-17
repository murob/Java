package ex04controlstatement;

public class Qu_04_08 {

	public static void main(String[] args) {
//		int m=1;
//		while(m<=5) {
//			int n=1;
//			while(n<=5) {
//				if(m==n)
//					System.out.print("* ");
//				else if(m<n)
//					System.out.print("* ");
//				n++;
//			}
//			System.out.println();
//			m++;
//		}
		
		//*를 출력한 행의 갯수를 상수로 표현
		final int FLOOR = 5;
		/*
		FLOOR(행의갯수) - x + 1
			: 변수 x가 증가함에 따라 점점 감소하는 y를 표현하기 위한 일반식 정의
		 */
		for(int x=1 ; x<=5 ; x++) {
			for(int y=1 ; y<=(FLOOR-x+1) ; y++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int n=1 ; n<=5 ; n++) {
			for(int m=1; m<=5 ; m++) {
				if(n<=m)
					System.out.print("* ");
			}
			System.out.println();
		}
	}
}
