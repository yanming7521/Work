package text;
/*打印出杨辉三角形（要求打印出10行）*/
public class Yang {
public static void main(String[] args) {
	int i=1;
	int triggle[] = new int[10];
	for(i=0;i<10;i++) {
		triggle[i]=1;//末尾元素一直为1
		for (int j=i-1;j>0;j--){
			triggle[j]= triggle[j-1]+triggle[j];
		}
		for(int k=10-i-1;k>0;k--) {
			System.out.print(" ");
		}
		for (int j=0;j<=i;j++) {
			System.out.print(triggle[j]+" ");
		}
		System.out.println();
	}

}
}
