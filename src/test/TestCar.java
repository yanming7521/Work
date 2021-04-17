package test;
class Auto{
	String colour="白色";
	int tire=4;
	int weight=0;
	int speed=0;
	public Auto() {
		
	}
	public Auto(String colour,int weight) {
		this.colour=colour;
		this.weight=weight;
	}
	public Auto(String colour,int weight,int tire,int speed) {
		this.colour=colour;
		this.weight=weight;
		this.tire=tire;
		this.speed=speed;
	}
	public int SpeedUp(int speed) {
		this.speed=this.speed+speed;
		return this.speed;
	}
	public int SlowDown(int speed) {
		this.speed=this.speed-speed;
		return this.speed;
	}
	public int stop() {
		this.speed=0;
		return this.speed;
	}
	public void say() {
		System.out.println("auto颜色:"+this.colour+" 轮胎:"+this.tire+"个 重量:"+this.weight+" 速度:"+this.speed);
	}
}
class Car extends Auto{
	String air="Gree";
	String cd="Sony";
	public Car() {
		
	}
	public Car(String colour,int weight,int tire,int speed) {
		this.colour=colour;
		this.weight=weight;
		this.tire=tire;
		this.speed=speed;
	}
	public int SpeedUp(int speed) {
		this.speed=this.speed+speed/2;
		return this.speed;
	}
	public int SlowDown(int speed) {
		this.speed=this.speed-speed/2;
		return this.speed;
	}
	public void say() {
		System.out.println("car颜色:"+colour+" 轮胎:"+tire+"个 重量:"+weight+" 速度:"+speed);
		System.out.println("空调:"+this.air+" CD:"+this.cd);
	}
}
public class TestCar {
public static void main(String[] args) {
	Auto auto1=new Auto("蓝色",1500);
	Car car1=new Car("银色",1000,4,90);
	Auto auto2=new Auto("黑色",2000,6,100);
	Car car2=new Car();
	auto1.SpeedUp(20);
	auto1.say();
	auto2.SlowDown(40);
	auto2.say();
	car1.SpeedUp(50);
	car1.SlowDown(30);
	car1.say();
	car1.stop();
	car1.say();
	car2.say();
}
}
