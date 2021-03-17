package ex04controlstatement;

public class Qu_04_09 {

	public static void main(String[] args) {
//		for(int dan=2 ; dan<=9 ; dan++) {
//			for(int su=1 ; su<=9 ; su++) {
//				System.out.printf("%d*%d=%d", dan, su, (dan*su));
//				System.out.println();
//			}
//			System.out.print("\n");
//		}

		for(int su=1 ; su<=9 ; su++) {
			for(int dan=2 ; dan<=9 ; dan++) {
				System.out.printf("%2d*%2d=%2d", dan, su, (dan*su));
			}
			System.out.println();	
		}
	}
}
