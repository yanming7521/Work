package text;
/*请按照以下要求设计一个计算机类Computer，并进行测试。
要求如下：
1.Computer类中定义一个静态变量cpu
2.Computer类中定义一个静态方法info()，用于输出计算机的CPU信息
3.在main()方法中为静态变量cpu赋值，并调用静态方法info()输出计算机CPU的相关信息。*/
class Computer{
	static String cpu;
	public static void info() {
		System.out.println("cpu信息：");
		System.out.println(cpu);
	}
}
public class Cpu {
public static void main(String[] args) {
	Computer.cpu="Inter(R) Core i5-8265U @ 1.60GHz 1.80GHz";
	Computer.info();
}
}
