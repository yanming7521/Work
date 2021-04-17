package test01;
abstract class Shape{
    abstract double area();
    public double sum1(Circle[] shapes) {
        double sum = 0;
        for (int i = 0; i < shapes.length; i++) {
            sum+=shapes[i].area();
        }
        return sum;
    }
    public double sum2(Rectangle[] shapes) {
        double sum = 0;
        for (int i = 0; i < shapes.length; i++) {
            sum+=shapes[i].area();
        }
        return sum;
    }
}
class Circle extends Shape{
    int r;double v,pi=3.14;
    static int s;
    public Circle(int r) {
        this.r=r;
        s++;
    }
    public double area() {
        v=r*r*pi;
        return v;
    }
    public void say() {
        System.out.println("圆形"+s+"个");
    }
}
class Rectangle extends Shape{
    int a,b; double v;
    static int y;
    public Rectangle(int a,int b) {
        this.a=a;
        this.b=b;
        y++;
    }
    public double area() {
        v=a*b;
        return v;
    }
    public void say() {
        System.out.println("矩形"+y+"个");
    }
}
public class TestShape {
    public static void main(String[] args) {
        Circle[] r=new Circle[2];
        r[0]=new Circle(6);
        r[1]=new Circle(4);
        r[1].say();
        Rectangle[] t=new Rectangle[2];
        t[0]=new Rectangle(8, 14);
        t[1]=new Rectangle(9, 6);
        t[1].say();
        Circle sum=new Circle(0);
        System.out.println("圆形面积和："+sum.sum1(r));
        System.out.println("矩形面积和："+sum.sum2(t));
        System.out.println("面积总和为："+(sum.sum1(r)+sum.sum2(t)));
    }
}
