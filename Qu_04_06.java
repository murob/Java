package ex04controlstatement;

public class Qu_04_06 {

	public static void main(String[] args) {
		
//		int m=1;
//		while(m<=5) {
//			int n=1;
//			while(n<=5) {
//				if(m==n)
//					System.out.print("* ");
//				else if(m>n)
//					System.out.print("* ");
//				n++;
//			}
//			System.out.println();
//			m++;
//		}
		System.out.println("방법1");
		int i=1;
		while(i<=5) {
			int j=1;
			while(j<=5) {//무조건 25번 반복함.
				if(i>=j) {
					System.out.print("* ");
				}
				j++;
			}
			System.out.println();
			i++;
		}
		
		System.out.println("방법2");
		i=1;//동일한 지역에 동일한 변수는 생성할 수 없다.
		while(i<=5) {
			int j=1;
			while(j<=i) {//j는 i의 크기만큼 반복하므로 15번만 반복하면 됨.
				System.out.print("* ");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
