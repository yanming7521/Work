package text;

public class Rabbit {
	public int Fib(int num) {
		if(num <= 0) {
			return 0;
		}
		if(num == 1 || num == 2) {
			return 1;
		}
		int first = 1,second =1,third = 0;
		for(int i = 3; i<= num ;i++) {
			third = first + second;
			first = second;
			second = third;
		}
		return third;
	}

public static void main(String[] args) {
	Rabbit a=new Rabbit();
	System.out.print("第十二个月兔子数："+a.Fib(12));
}
}
