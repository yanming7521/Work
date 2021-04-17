package test02;
import java.util.Scanner;
abstract class Fish {
	abstract double swim();
}
public class TestFish {
	public void print(Fish fish) {
		System.out.println("游过的距离:"+fish.swim()+"m");
	}
	public static void main(String[] args) {
		Fish fish=new Fish() {
			{System.out.println("输入时间:(s)");};
			Scanner in=new Scanner(System.in);
			int t=in.nextInt(); 
			double s,v=0.6;
			double swim() {
				s=v*t;
				return s;
			}
		};
		TestFish p=new TestFish();	
		p.print(fish);
		}
}
