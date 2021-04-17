package text;
/*定义一个长度为10的整型数组，将数组元素从小到大排序并输出排序结果*/
import java.util.Scanner;
public class Arr {
public static void main(String[] args) {
	Scanner in= new Scanner(System.in);
	System.out.print("输入10个数:");
	int [] arry = new int [10];
	for (int i = 0 ; i < 10 ; i++) { 
	arry[i]= in.nextInt();  
	} 
	int temp;
	for(int i=0;i<9;i++)
	{
		for(int j=0;j<9-i;j++)
		{
			if(arry[j+1]<arry[j])
			{
				temp=arry[j];
				arry[j]=arry[j+1];
				arry[j+1]=temp;
			}
		}
	}
	System.out.print("从小到大排序：");
	for (int i = 0 ; i < 10 ; i++) {
		System.out.print(arry[i]+" ");
	}
in.close();	
}
}
