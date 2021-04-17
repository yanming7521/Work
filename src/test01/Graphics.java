package test01;
abstract class SumGra {
	abstract double perimeter();
	abstract double area();
	public void say(double a,double b) {
		System.out.println("周长："+a+" 面积："+b);	
	}
}
class Rect extends SumGra{
	int a,b;
	public Rect(int a,int b) {
		this.a=a;
		this.b=b;
		System.out.print("#矩形# 边长："+a+"、"+b+" ");
	}
	public double perimeter() {
		double rect;
		rect=(a+b)*2;
		return rect;
	}
	public double area() {
		double area;
		area=a*b;
		return area;
	}
}
class Round extends SumGra{
	int r; double pi=3.14;
	public Round(int r) {
		this.r=r;
		System.out.print("#圆形# 半径："+r+" ");
	}
	public double perimeter() {
		double rect;
		rect=pi*r*2;
		return rect;
	}
	public double area() {
		double area;
		area=r*r*pi;
		return area;
	}
}
class Triangle extends SumGra{
	int a,b,c;
	public Triangle(int a,int b,int c) {
		this.a=a;
		this.b=b;
		this.c=c;
		System.out.print("#三角形# 边长："+a+"、"+b+"、"+c+" ");
	}
	public double perimeter() {
		double rect;
		rect=a+b+c;
		return rect;
	}
	public double area() {
		double area,t,v;
		v=a+b+c;
		t=v/2;
		area=Math.sqrt(t*(t-a)*(t-b)*(t-c));
		return area;
	}
}
public class Graphics {
public static void main(String[] args) {
	Rect rect=new Rect(6,9);
	rect.say(rect.perimeter(), rect.area());
	Round round=new Round(6);
	round.say(round.perimeter(), round.area());
	Triangle triangle=new Triangle(3,4,5);
	triangle.say(triangle.perimeter(), triangle.area());
}
}
