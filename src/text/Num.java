package text;
/*有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？*/
public class Num {
	
public static void main(String[] args) {
	int num,sa=0;
	System.out.println("无重复数字有：");
	for(int i=1;i<5;i++) {
		for(int j=1;j<5;j++) {
			for(int k=1;k<5;k++) {
				if(i!=j&&i!=k&&j!=k) {
					num = i*100+j*10+k;
					sa++;
					System.out.print(num+" ");
				}
			}
		}
		System.out.println();
	}

	System.out.println("共"+sa+"个");
}
}
