package arr;

public class Lianxi {
public static void main(String[] args) {
	int[] arr = new int[] {8,2,1,5,3,7,9};
	int[] index = new int[] {2,3,4,0,6,3,3,1,5,0,2};
	String tell ="";
	for(int i:index) {
	tell+=arr[i];	
	}
	System.out.println(tell);
}
}
