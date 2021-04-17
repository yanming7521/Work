package test02;

interface IPlane {
	String fname = " 战机  ";
	void speed();
}
interface IShip {
	String sname = " 航母  ";
	void speed1();
}
interface IAirBoat extends IPlane,IShip{
	String cname = "中国 China";
}
class ChineseAirBoat implements IAirBoat {
	String name;
	double time,s,v;
	public ChineseAirBoat(String name,double time,double s) {
		this.name=name;
		this.time=time;
		this.s=s;
	}
	public void speed() {
		time=time*3600;
		v=s/time;
		System.out.println(name+fname+"飞行速度:"+v+" m/s");
	}
	public void speed1() {
		time=time*60;
		v=s/time;
		System.out.println(name+sname+"航行速度:"+v+" m/s");
	}
}
public class TestIAirBoat {
public static void main(String[] args) {
	IPlane a = new ChineseAirBoat("J-22",2,900000);
	IShip b = new ChineseAirBoat("L-01",50,61980);
	System.out.println(ChineseAirBoat.cname);
	a.speed();
	b.speed1();
}
}


