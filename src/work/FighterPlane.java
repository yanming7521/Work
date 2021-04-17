package work;

public class FighterPlane implements IPlane {
	String name ="23-6 ";
	int x,t;
	double sp;
	public FighterPlane(int x,int t) {
		this.x = x;
		this.t = t;
	}
	public void sudu() {
		sp = x/t;
		System.out.println(name+fname+"飞行速度是:"+sp);
	}
public static void main(String[] args) {
IPlane c = new FighterPlane(700, 48);
c.sudu();
}
}
