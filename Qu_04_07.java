package ex04controlstatement;

public class Qu_04_07 {

	public static void main(String[] args) {
//		int sum = 0;
//		int i = 1;
//		do {
//			if(i%3==0 || i%7==0) {
//				System.out.println(sum + "+" + i);
//				sum += i;
//			}
//			else if(i%21==0)
//				break;
//			i++;
//		}while(i<=100);
//		System.out.println("1~100까지 숫자 중 3또는7의 배수의 합 단, 3과7의 공배수제외"+ sum);
		
		int sum=0;//누적합을 위한 변수
		//1~100까지 반복
		for(int i=1 ; i<=100 ; i++) {
			//3의 배수이거나 7의 배수
			if(i%3==0 || i%7==0) {
				//3과7의 공배수가 아닌 경우
				if(i%(3*7)!=0) {
					sum+=i;
					System.out.print(i+" ");
				}
			}
		}
		System.out.println("\n결과:"+ sum);
	}
}
