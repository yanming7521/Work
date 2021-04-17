package text;
/*打印菱形*/
public class Sout {
public static void main(String[] args) {
	for(int i=1;i<=4;i++) {
		for(int k=1;k<=4-i;k++) {
			System.out.print(" ");
		}
		for(int j=1;j<=i*2-1;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	for(int i=1;i<4;i++) {
		for(int k=1;k<=i;k++) {
		System.out.print(" ");
		}
		for(int j=1;j<=7-i*2;j++) {
		System.out.print("*");
		}
		System.out.println();
	}
}
}
