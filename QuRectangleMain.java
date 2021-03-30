package ex12inheritance;
/*
정사각형을 의미하는 Square클래스와 직사각형을 
의미하는 Rectangle클래스를 정의하고자 한다.
그런데 정사각형은 직사각형의 일종이므로, 
다음의 형태로 클래스의 상속관계를 구성하고자 한다. 
아래의 소스를 참조하여 구현하시오.

 실행결과]
직사각형 면적: 12
정사각형 면적: 49
 */
//직사각형을 표현한 클래스
class Rectangle
{
    private int height;
    int width;
    
    public Rectangle() {}
    public Rectangle(int height, int width) {
    	this.height = height;
    	this.width = width;
    }
    
    //직사각형의 넓이를 출력
    public void ShowAreaInfo() {
    	System.out.println("직사각형의 면적: "+(height*width));
    }
} 
//정사각형을 표현한 클래스(정사각형은 직사각형의 일종)
class Square extends Rectangle
{
    private int sideLength;
	/*
	멤버변수
	: 해당 클래스의 경우는 부모클래스가 이미 가로, 세로에 대한
	멤버변수를 정의하였으므로 자식쪽
	 */
    public Square(int sideLength) {
//    	super(sideLength);
    	
    	this.sideLength = sideLength;
    }
    
    public void ShowAreaInfo() {
    	System.out.println("정사각형의 면적: "+(sideLength*sideLength));
    }
    
} 
class QuRectangleMain
{
	public static void main(String[] args)
	{
     	Rectangle rec = new Rectangle(4, 3);
     	rec.ShowAreaInfo();

     	Square sqr = new Square(7);
     	sqr.ShowAreaInfo();
 	}
}

