package work;

public class ChineseAirBoat implements IAirBoat {
	String name;
	double v;
	public ChineseAirBoat () { }
	public ChineseAirBoat (String name,double v) {
		this.name = name;
		this.v = v;
	}
	public void sudu() {
		System.out.println(name+fname+"飞行速度:"+v+" m/s");
	}
	public void spend() {
		System.out.println(name+sname+"航行速度:"+v+" m/s");
	}
	public static void main(String[] args) {
		IPlane a = new ChineseAirBoat("J-22",364);
		IShip b = new ChineseAirBoat("L-01",451);
		System.out.println(cname);
		a.sudu();
		b.spend();
	}
}
