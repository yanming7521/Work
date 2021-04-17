package text01;
class Demo{
	static int count=0;
public Demo() {
	count++;
}
}
public class Test {
public static void main(String[] args) {
	Demo c1=new Demo();
	Demo c2=new Demo();
	Demo c3=new Demo();
	Demo c4=new Demo();
	Demo c5=new Demo();
	Demo c6=new Demo();
	System.out.println("使用构造方法"+Demo.count+"次");
}
}
