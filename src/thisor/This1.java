package thisor;
class Father{
	String name;
	public Father() {
		System.out.println("wucan");
	}
	public Father(String name) {
		this.name = name;
		}
	}
class father1 extends Father{
	public father1() {
	super("adfasd");
	}
	public void ss() {
		System.out.println(name);
	}
}
public class This1 {

	public static void main(String[] args) {
		father1 p1 = new father1();
		p1.ss();
	}

}
