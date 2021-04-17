package work;
import java.util.Scanner;
import java.lang.Math;
class Person {
	int x , y , z , wh;
	public void san() {
		if(x+y>z & x+z>y & y+z>x & x*y*z > 0) {
		System.out.println("三角形边长为：" + x+ ","+ y +","+ z);	
		System.out.println("周长="+(x+y+z));
		double  s , t ,v;
		v = x+y+z;
		t = v/2 ;
	    s = Math.sqrt(t*(t-x)*(t-y)*(t-z));
	    System.out.print("面积=");
		System.out.printf("%1$.2f \n",s);
		if (x*x+y*y>z*z & x*x+z*z>y*y & y*y+z*z>x*x) 
				System.out.println("这是锐角三角形");
		if (x*x+y*y<z*z | x*x+z*z<y*y | y*y+z*z<x*x) 
				System.out.println("这是钝角三角形");
		if (x*x+y*y==z*z | x*x+z*z==y*y | y*y+z*z==x*x) 
				System.out.println("这是直角三角形");
		}
		else {
			System.out.println("错误！！不能构成三角形,请重新输入！");
			wh = 1;
		}
	}
}
public class TestPerson {
	public static void main(String[] args) {
		System.out.print("输入三角形的三边长度：");
		Person p1 = new Person();
		Scanner in= new Scanner(System.in);
		p1.x = in.nextInt();
		p1.y = in.nextInt();
		p1.z = in.nextInt();
		p1.san();
		while(p1.wh==1) {
		p1.x = in.nextInt();
		p1.y = in.nextInt();
		p1.z = in.nextInt();
		p1.san();
		}
		in.close();
		}
}
