package test03;
import java.util.Scanner;
public class TestDay {
public static void main(String[] args) {
	int[] arr= {31,28,31,30,31,30,31,31,30,31,30,31};
	Scanner input =new Scanner(System.in);
	System.out.println("请输入一年的具体时间(如：19990205)：");
	int num=input.nextInt();
	int year=num/10000;
	int moth=num/100%100;
	int sum=0;
	int day=num%100;
	if ((year%4==0&&year%100!=0)||year%400==0) {
		arr[1]=29;
	}
	for (int i = 0; i < (moth-1); i++) {
		sum+=arr[i];
	}
	int Day=sum+day;
	System.out.println("这是"+year+"年的第"+Day+"天");
	input.close();
}
}
