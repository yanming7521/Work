package arr;

public class Array {
	public static void main(String[] args) {
		int[] ar= {2,0,8,78,45};
		System.out.print("[");
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]);
			if(i < ar.length-1)
			System.out.print(",");
		}
		System.out.println("]");
	}
}
