package test01;
interface Vehicle{
	void start(double a);
	void stop(double a);
}
class Bike implements Vehicle{
	double speed;
	public void start(double a) {
		this.speed=a;
		if(a>0) {
		System.out.println("Bike成功启动，速度是："+a+"m/s");
		}
		else System.out.println("Bike启动失败!!");
	}
	public void stop(double a) {
		a=this.speed/a;
		System.out.println("Bike成功暂停，用时："+a+"s");
	}
}
class Bus implements Vehicle{
	double speed;
	public void start(double a) {
		this.speed=a;
		if(a>0) {
		System.out.println("Bus成功启动，速度是："+a+"m/s");
		}
		else System.out.println("Bus启动失败!!");
	}
	public void stop(double a) {
		a=this.speed/a;
		System.out.println("Bus成功暂停，用时："+a+"s");
	}
}
public class InterfaceDemo {
public static void main(String[] args) {
	Bike bike=new Bike();
	bike.start(3);
	bike.stop(2);
	Bike bike2=new Bike();
	bike2.start(0);
	Bus bus=new Bus();
	bus.start(60);
	bus.stop(50);
	
}
}
