package static1;
class Red{
	static int num = 0;
	int m;
	int w;
	public Red() {
		
	}
	public Red(int w) {
		this.w=w;
	}
	public void sad() {
		num++;
		System.out.print(num+" ");
		System.out.println(w);
	}
}
public class Txt {
public static void main(String[] args) {
	for (int i = 0; i < 5; i++) {
		Red xi =new Red(Red.num+i);
		xi.sad();
	}
	Red x1 = new Red();
	x1.sad();
}
}
