package change1;
import java.util.Scanner;
public class Change
{
	public static void main (String [] args)
	{
		Scanner in= new Scanner(System.in);
		System.out.print("输入5个数:");
		int [] arry = new int [5];
		for (int i = 0 ; i < 5 ; i++) { 
		arry[i]= in.nextInt();  //输入数组
		} 
		int change;
		for (int x = 0,y = arry.length-1 ; x < y ; x++ , y--) {
			change = arry[x];
			arry[x] = arry[y];  //交换
			arry[y] = change;
		}
		System.out.print("输出倒序的数组元素:");
		for (int i = 0 ; i < 5 ; i++) {
			System.out.print(arry[i]+" ");
		}
		in.close();
	}
}