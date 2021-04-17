package work;
import java.util.*;
class User{
	String name;
	String password;
	static int num;
	public User() { }
	public User(String name) {
		num++;
		this.name = name;
	}
	public User(String name,String password) {
		num++;
		this.name = name;
		this.password = password;
	}
	public void say() {
		System.out.println("用户"+num+"  账户:"+name+" 密码:"+password);
	}
	public void change() {
		Scanner in = new Scanner(System.in);
		String nps;
		System.out.print("输入密码:");
		nps = in.next();
		this.password = nps;
		in.close();
	}

}
public class Work{
	public static void main(String[] args) {
		User u1 =new User("yzh");
		u1.say();
		u1.change();
		u1.say();
		User u2 =new User("ymm","741852");
		u2.say();
		User u3 =new User("zyy","10000");
		u3.say();	
	}
}