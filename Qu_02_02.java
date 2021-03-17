package ex02variable;

/*
문제2] 파일명 : Qu_02_02.java
국어,영어,수학 점수를 99, 80, 96점으로 입력하고 
평균점수를 구해서 출력하는 프로그램을 작성하시오.
 */

public class Qu_02_02 {

	public static void main(String[] args) {
		int kor=99, eng=80, math=96;
		int sum = kor+eng+math;
		double avg1 = sum/3.0;
		int avg2 = sum/3;
		System.out.printf("국어점수: %d, 영어점수: %d, 수학점수: %d", kor, eng, math);
		System.out.println("국영수 총점: "+ sum);
		System.out.println("국영수 평균(실수형): "+ avg1);
		System.out.println("국영수 평균(정수형): "+ avg2);

	}

}
