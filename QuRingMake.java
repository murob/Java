package ex12inheritance;
/*
다음 Point클래스를 이용하여 다음 문제를 해결하시오. 
해당 문제는 상속을 통해 구현하는것이 아니라 구성관계를 이용하여 해결한다. 
Point 클래스를 기반으로 원을 의미하는 Circle클래스를 정의하자. 
그리고 Circle클래스를 기반으로 Ring클래스를 정의하자.

실행결과]
안쪽원의 정보 :
반지름 : 3	
[x좌표:1, y좌표1]
바깥쪽원의 정보 :
반지름 : 9
[x좌표:2, y좌표2]
 */
class Point
{
   	int xDot, yDot;
   	public Point(int x, int y)
   	{
        xDot=x;
        yDot=y;
   	}
   	public void showPointInfo()
   	{
        System.out.println("[x좌표:"+xDot+", y좌표"+yDot+"]");
   	}
}

//Point클래스를 기반으로 원(Circle) 클래스 표현하기
class Circle{	
	//멤버변수
	int radian;//반지름
	Point center;
	//블라블라
	public Circle(int x, int y, int radian) {
		center = new Point(x, y);//중심점을 표현하는 객체
		this.radian = radian;//반지름 초기화
	}
}

//원 2개를 겹쳐서 링을 표현하는 클래스
class Ring{
	//멤버변수
	Circle innerCircle;//안쪽의 원
	Circle outerCircle;//바깥쪽의 원
	//생성자
	/*
	링 클래스에서는 원이 2개 있어야 하므로 아래와 같이
	Circle객체를 2개 생성한다.
	 */
	public Ring(int innerX, int innerY, int innerR, int outerX, int outerY, int outerR) {
		//멤버변수가 객체이므로 해당 객체를 생성해야한다.
		innerCircle = new Circle(innerX, innerY, innerR);//중심점(x, y), 반지름(r)
		outerCircle = new Circle(outerX, outerY, outerR);
		
	}
	public void showRingInfo() {
		System.out.println("안쪽원의 정보: \n반지름: "+innerCircle.radian);
		innerCircle.center.showPointInfo();
		System.out.println("바깥쪽원의 정보: \n반지름: "+outerCircle.radian);
		outerCircle.center.showPointInfo();
	}
}
class QuRingMake {
	public static void main(String[] args) {
		Ring c = new Ring(1,1,3,2,2,9);
		c.showRingInfo();
	}
}
