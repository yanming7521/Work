package work;
class coun{
	String c;
	public coun(String coun) {	
	this.c = coun; 	
	}
	public void say() {
		System.out.print(c+" ");
	}
}
class chengji{
	int txt;
	public chengji(int t) {
		this.txt = t;
	}
}
public class People {
	String name;
	static coun coun = new coun("中国");
	chengji cheng = new chengji(50);
	static {
		coun.say();
	}
	public People() {
		
	}
	public People(String name) {
		this.name = name;
	}
	public void we() {
		System.out.println(name+cheng.txt);
	}
	
	
	public static void main(String[] args) {
		People p = new People();
		People p2 = new People("wwq");
		p.name = "ada";
		p.we();
		p2.we();
	}

}
