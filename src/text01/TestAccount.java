package text01;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
class Account{
	String name;
	String acc;
	int money;

	public Account(String acc,String name,int money) {
		this.acc=acc;
		this.name=name;
		this.money=money;
	}
	public void in(int money) {
		this.money=money+this.money;
		System.out.println(this.name+" 存入："+money);
	}
	public void out(int money) {
		this.money=this.money-money;
		System.out.println(this.name+" 取出："+money);
	}
	public void transfer(Account p1,Account p2,int inout) {
		p1.money-=inout;
		p2.money+=inout;
		System.out.println(p1.name+"给"+p2.name+"转账："+inout);
	}
	public void say() {
		String s;

		Date d = new Date();
		DateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd hh:mm");
		s = sdf2.format(d);
		System.out.println(s);
		System.out.println("账号："+this.acc+" 户名："+this.name+"  存款："+this.money);
	}
	public void sayout() {
		System.out.println(this.name+" 余额："+this.money);
	}
}
public class TestAccount {
public static void main(String[] args) {
	Account p1 = new Account("001","张三",1000);
	Account p2 = new Account("002","李四",1000);
	p1.say();
	p2.say();
	p1.in(2000);
	p2.out(500);
	p1.transfer(p1, p2, 300);
	p1.sayout();
	p2.sayout();
}
}
