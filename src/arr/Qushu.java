package arr;
/*打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身*/
public class Qushu {
	public static void main(String[] args) {
		int x,y,z;
		System.out.print("水仙花数有:");
		for(int a = 100 ; a < 1000 ; a++)
		   {
			x = a/100;    //百位数字
		    y = a/10%10;  //十位数字
		    z = a%10;     //个位数字
		    if(x*x*x+y*y*y+z*z*z == a)
		      System.out.print(" "+a);
			}
	}
}
