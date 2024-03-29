package ex12inheritance;
/*
 상속관계에 놓여있는 클래스의 생성자 정의 및 호출방식을 
 기본으로 다음 클래스의 적절한 생성자를 삽입해보자. 
 그리고 이의 확인을 위한 main 메소드도 적절히 정의해보자.

 실행결과]
남은가솔린:10
남은전기량:20
남은워터량:30
 */

class Car {
	int gasoline;
	
	public Car(int gasoline) {
		this.gasoline = gasoline;
	}
}
class HybridCar extends Car
{
    int electric;
    public HybridCar(int gasoline, int electric) {
    	super(gasoline);
    	this.electric = electric;
    }
}
class HybridWaterCar extends HybridCar
{
    int water;
    /*
    하위클래스의 생성자에서는 부모클래스의 객체를 항상 먼저
    생성해야 하므로 super()를 통해 부모의 생성자를 먼저
    호출한 후 자신의 멤버변수를 초기화 해야한다.
     */
    public HybridWaterCar(int gasoline, int electric, int water) {
    	//부모객체를 초기화하기 위한 super()가 항상 먼저 기술되야한다.
    	super(gasoline, electric);
    	//만약 위 아래의 코드의 위치가 바뀌면 에러가 발생한다.
    	this.water = water;
    }
 
    public void showNowGauge()
    {
       	System.out.println("남은가솔린:"+gasoline);
       	System.out.println("남은전기량:"+electric);
       	System.out.println("남은워터량:"+water);
    }
}
public class QuConstructorAndSuper {

	public static void main(String[] args)
	{
		/*
		하위클래스를 통해 객체를 생성할 때는 항상 부모쪽 멤버변수까지
		초기화할 수 있도록 인자를 전달받아야 한다. 
		 */
		HybridWaterCar hcar = new HybridWaterCar(10,20,30);
		hcar.showNowGauge();
	}
}
