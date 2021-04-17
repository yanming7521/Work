package test02;

abstract class Shape{
	static int add;
	abstract double area();
}
class Circle extends Shape{
	int r;double v,pi=3.14;
	public Circle(int r) {
		this.r=r;
		add++;
	}
	public double area() {//圆形面积
		v=r*r*pi;
		return v;
	}
}
class Rectangle extends Shape{
	int a,b; double v;
	public Rectangle(int a,int b) {
		this.a=a;
		this.b=b;
		add++;
	}
	public double area() {//矩形面积
		v=a*b;
		return v;
	}
}
public class TestShape1 {
	public double sum(Shape[] shapes) {
		double sum = 0;
		for (int i = 0; i < shapes.length; i++) {
			sum+=shapes[i].area();
		}
		return sum;
		}
	public static void main(String[] args) {
		Shape[] s=new Shape[4];
		s[0]=new Circle(5);// 78.5
		s[1]=new Circle(6);// 113.4
		s[2]=new Rectangle(8, 7);// 56
		s[3]=new Rectangle(4, 8);// 32
		TestShape1 sarea= new TestShape1();
		System.out.println(Shape.add+"个图形面积总和是:"+sarea.sum(s));
	}
}
