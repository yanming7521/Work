package work;
abstract class Shape{
public abstract double getv();
}
class San extends Shape{
int di,gao;
double v;
public San(int di,int gao) {
	this.di = di;
	this.gao = gao;
}
public double getv() {
	v = di*gao*0.5;
	return v;
}
}
class Yuan extends Shape{
int r;
double v,pi=3.14;
public Yuan(int r) {
	this.r=r;
}
public double getv() {
	v = r*r*pi;
	return v;
}
}
class Fang extends Shape{
int bian;
double v;
public Fang(int bian) {
	this.bian = bian;
}
public double getv() {
	v = bian*bian;
	return v;
}
}
class Ju extends Shape{
	int di,gao;
	double v;
	public Ju(int di,int gao) {
		this.di = di;
		this.gao = gao;
	}
	public double getv() {
		v = di*gao;
		return v;
	}		
}
public class Sum {
	public double sum(Shape[] shapes) {
		double sum = 0;
		for (int i = 0; i < shapes.length; i++) {
			sum+=shapes[i].getv();
		}
		return sum;
		}
public static void main(String[] args) {
	Shape[] s=new Shape[4]; 
	s[0]=new San(6, 9);
	s[1]=new Yuan(5);
	s[2]=new Fang(6);
	s[3]=new Ju(14, 20);
	Sum sum = new Sum();
	System.out.println("三角形:"+s[0].getv()+" 圆:"+s[1].getv()+" 方形:"+s[2].getv()+" 矩形:"+s[3].getv());
	System.out.println("总体积="+sum.sum(s));
}
}
