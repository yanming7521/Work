package super0;
class Father1{
	String name;
	public Father1() {
		
	}
	public Father1(String name) {
		this.name = name;
	}
}
class child extends Father1{
	public child() {
		super("name");
}
	public void say() {
		System.out.println(name);
	}
}
public class Super1 {
public static void main(String[] args) {
	child p = new child();
	p.say();
}
}
