package text04;
class Number{
	public int Maxd(int a,int b) {
		int x;
		if(a>b) x=a;
		else x=b;
		return x;
	}
	public int Product(int a,int b,int c) {
		int y;
		y=a*b*c;
		return y;
	}
	public int Factorial(int a) {
	int sum=1;
	if(a==0) sum=1;
	else {
	for(int i=a;i>0;i--) sum=sum*i;
	}
	return sum;
	}
}
public class Test {
public static void main(String[] args) {
	Number num1=new Number();
	System.out.println("15和7的最大值是："+num1.Maxd(15, 7));
	System.out.println("6、9、10的乘积是："+num1.Product(6, 9, 10));
	System.out.println("10的阶乘是："+num1.Factorial(10));
}
}
