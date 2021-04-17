package super0;
class Worker{
	String name;
	int wage;
	public Worker() {
		
	}
	public Worker(String name,int wage) {
		this.name = name;
		this.wage =wage;
	}
	public void wag() {
		wage = wage + 100;
	}
	public void say() {
		System.out.println("工人:"+name+"  工资:"+wage);
	}
}
class Manager extends Worker{
	int jin;
	public Manager(String name,int wage,int jin) {
		super(name,wage);
		this.jin = jin;	
	}
	public void wag() {
		wage = wage + 300;
		jin = jin + 200;
	}
	public void say() {
		System.out.println("经理:"+name+"  工资:"+wage+" 津贴:"+jin);		
	}
}
public class Lianxi {
public static void main(String[] args) {
	Worker y = new Worker("小杨", 3000);
	Manager z = new Manager("老张",5000,300);
	System.out.println("涨五次工资后");
	for(int i=0; i<5; i++) {
	y.wag();
	z.wag();
	}
	y.say();
	z.say();
}
}
