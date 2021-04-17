package test;
abstract class Vehicle{
	String name;
	public abstract String NoOfWheels();
}
class Car1 extends Vehicle{
	public String NoOfWheels() {
		this.name="四轮车";
		return this.name;
	}
}
class Motorbike extends Vehicle{
	public String NoOfWheels() {
		this.name="二轮车";
		return this.name;
	}
}
public class TestVehicle {
public static void main(String[] args) {
	Car1 ca=new Car1();
	Motorbike mo=new Motorbike();
	System.out.println("Car:"+ca.NoOfWheels()+"    Motorbike:"+mo.NoOfWheels());
}
}
